
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
.other{
position:relative;
float:right;
margin-right:5px;
}
.otherid{
	margin-right: 23%; 
} 
body{
	background-image: url('/beet/resources/images/school.jpg'); width:100%; height: 100%;
	background-color: navy;
}
div.form-group{
	padding-top: 18%;
}
</style>
<body>

<br><br><br><br><br><br><br><br><br>
<% if(m != null){ %>	
<meta http-equiv="refresh" content="0;url=/beet/views/main/main.jsp">
<% } %>
<!-- 세션 아래 인클루드코드 복사해서 쓰세요! -->
<%-- <%@ include file="/views/common/sessionChk.jsp" %> --%>
<% if(m == null){ %>

<div class="container">
	<form action="/beet/login.cp" method="post">
	<div class="form-group">
	<h1>ID<span style="color:white;">&nbsp;</span></h1><input type="text" name="userid" class="form-control" id="usr" required>
	<h1 style="color:white;">PASSWORD<span style="color:black;">&nbsp;</span></h1><input type="password" name="userpwd" class="form-control" id="pwd" required>
	<br><button type="submit" value="로그인" class="btn btn-dark">로그인</button>
	</div>
	</form>
	
	<div  style=" margin-left: 50%;">
	<button onclick="javascript: location.href='/beet/views/student/findId.jsp'" class="btn btn-dark other otherid">아이디찾기</button>
	&nbsp;&nbsp;
	<button onclick="javascript: location.href='/beet/views/student/findPassword.jsp'" class="btn btn-dark other">비밀번호찾기</button>
	&nbsp;&nbsp;
	<button onclick="javascript: location.href='/beet/views/student/enrollselect.jsp'" class="btn btn-dark other">회원가입</button>
	</div>
</div>
<% }else{ %>


<%=m.getName() %> 님 로그인 상태입니다
<br>
<button onclick="javascript: location.href='/beet/views/main/main.jsp'" class="btn btn-dark other"> 메인 페이지 </button>
<button onclick="javascript: history.go(-1)" class="btn btn-dark other"> 이전 페이지 </button>

<% } %>

</body>
</html>