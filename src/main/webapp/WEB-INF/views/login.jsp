<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page session="false" %>
<html>
<head>
	<title>login</title>
</head>
<body>
<h3>
	this is login Page  
</h3>
<form role="form" method="post" autocomplete="off" action="/login">
	<p>
		<label for="userId">아이디</label>
 		<input type="text" id="userId" name="userId" />
	</p>
 	<p>
<label for="userPass">패스워드</label>
<input type="password" id="userPass" name="userPass" />
</p>
 <p><button type="submit">로그인</button></p>
 <p><a href="/register">회원가입</a></p>
</form>
</body>
</html>