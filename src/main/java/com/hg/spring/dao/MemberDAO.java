package com.hg.spring.dao;

import com.hg.spring.domain.MemberVO;

public interface MemberDAO {

	// 회원 가입
	public void register(MemberVO vo) throws Exception;
	
	// 로그인
	public MemberVO login(MemberVO vo) throws Exception;
}
