<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<%@include file="side.jsp" %>
<%@include file="top.jsp" %>
<head>
	<title>Home</title>
</head>
<body>
<div align="center">
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
<div><br/></div>
	<div>
		회원가입 &nbsp;&nbsp;&nbsp;회원목록 &nbsp;&nbsp;&nbsp;자유게시판<br>
		<a href="memberJoin.do" class="btn btn-primary btn-circle">
                    <i class="fab fa-facebook-f"></i>
                  </a>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<a href="memberList.do" class="btn btn-info btn-circle">
             <i class="fas fa-info-circle"></i>
         </a>
         &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<a href="boardList.do" class="btn btn-warning btn-circle">
             <i class="fas fa-info-circle"></i>
         </a>
	</div>
</div>

</body>
</html>
<%@include file="footer.jsp" %>
