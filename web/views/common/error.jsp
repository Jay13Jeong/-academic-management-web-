<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true" import="student.model.vo.Member"%>
<%
	String error = (String)request.getAttribute("message");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<title>beet</title>
</head>
<body>



<div align="center" style="margin-top: 20%;">
<p>에러 발생</p>

<% if(error != null){ %>

<p><strong><h1><%= error%></h1></strong></p>

<% } %>
<%if( (Member)session.getAttribute("loginMember") != null ){ %>
<button class="btn btn-outline-secondary" onclick="javascript:loaction.href='/beet/main/main.jps'"> 메인 페이지 </button>&nbsp;&nbsp;&nbsp;
<% } %>
<br>
<button class="btn btn-outline-secondary" onclick="javascript:history.go(-1)"> 이전 페이지 </button>
</div>

</body>
</html>