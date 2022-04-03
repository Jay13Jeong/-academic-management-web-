
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
/*left:40%;*/
width:15%;
height:5%;
background-color:#2f3640;
}
.btns{
padding:7%;
font-size:300%;
background-color:#2f3640;
}
.one{
position:relative;
/*left:6%;
right:2%;
margin-right:1%;*/
}
.btns:hover{
padding:9%;
font-size:600%;
}
 a:link { color: red; text-decoration: none;}
 a:visited { color: black; text-decoration: none;}
 a:hover { color: blue; text-decoration: underline;}
</style>
<body>
<img src="/beet/resources/images/school.jpg">
<center>
<br><br><br><br><br><br><br><br><br>
<div>
<span class="one">
<button onclick="javascrip:location.href='/beet/toenroll?who=student'" class="btn btn-outline-light btns">학 생</button>
</span>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<span class="one">
<button onclick="javascrip:location.href='/beet/toenroll?who=professor'" class="btn btn-outline-light btns">교 수</button>
</span>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<span class="one">
<button onclick="javascrip:location.href='/beet/toenroll?who=admin'" class="btn btn-outline-light btns">임직원</button>
</span>
</div>
<br>
<button onclick="javascript: location.href='/beet/'" class="btn btn-outline-danger other">돌아가기</button>

</center>
</body>
</html>