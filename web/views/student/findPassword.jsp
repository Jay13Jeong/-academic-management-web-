
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="student.model.vo.Member" isErrorPage="false" %>
<%@page import="java.util.Calendar"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<% Member m = (Member)session.getAttribute("loginMember"); %>

<head>
  
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<style>
img{
    position: absolute;
   height: 100%;
   
   background-color: rgba(0, 0, 0, 0.4);                                                                 
   z-index:-1;
}
.other{
position:relative;
}
.otherid{
}
</style>
<body>
<img src="/beet/resources/images/school.jpg">
<br><br><br><br><br><br><br><br><br>
<center>
<div style="background-color:white; width:40%; border-radius:50px;">
&nbsp;
<br>
<form class="form-horizontal" role="form" method="POST" action="/beet/findpwd">		
		<h1>비밀번호찾기</h1>
		<br>
		<input type="text" name="id" class="form-control" id="id" placeholder="id" style="width:70%;" required autofocus>
		<br>
		<input type="treasure" style="width:70%;" name="treasure" class="form-control"id="treasure" placeholder="나의보물1호" required>
		<br>
		<button type="submit" class="btn btn-outline-secondary findbtn">비밀번호 찾기</button>
		<form><button onclick="javascript:location.href='/beet/'" class="btn btn-outline-secondary findbtn">취소</button></form>
		<br>
		&nbsp;		
	</form>
</div>
</center>
</body>
</html>