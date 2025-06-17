<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	String root = request.getContextPath();
	pageContext.setAttribute("root",root);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인화면</title>
</head>
<body>
	<h1>메인화면</h1>
		<a href="${ root }/board/list">목록</a>
		<a href="${ root }/join">회원가입</a>
		<a href="${ root }/login">로그인</a>
</body>
</html>