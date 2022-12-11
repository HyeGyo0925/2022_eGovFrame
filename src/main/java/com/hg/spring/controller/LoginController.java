package com.hg.spring.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hg.spring.domain.MemberVO;
import com.hg.spring.service.MemberService;

@Controller
public class LoginController {

	@Inject
	MemberService service;

	
	@RequestMapping(value="/goLogin", method = RequestMethod.GET)
	public String login() throws Exception{
		
		return "login";
	}
	
	// 로그인
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(MemberVO vo, HttpServletRequest req) throws Exception {

	   
	   HttpSession session = req.getSession();
	   
	   MemberVO login = service.login(vo);
	   
	   if(login == null) {
	    session.setAttribute("member", null);
	    System.out.println("로그인 실패");
	   } else {
	    session.setAttribute("member", login);
	    System.out.println("로그인 성공");
	   }
	   
	   return "redirect:/";
	}
	
	
	@RequestMapping(value="/register", method = RequestMethod.GET)
	public String getRegister() throws Exception{
		
		return "register";
	}
	
	@RequestMapping(value="/register", method = RequestMethod.POST)
	public String postRegister(MemberVO vo) throws Exception{
		service.register(vo);
		return "redirect:/";
	}
	
	
}
