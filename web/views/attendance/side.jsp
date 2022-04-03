<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="termScore.model.vo.TermScore, student.model.vo.Member " %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>beet</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
<style>
.subui {
line-height: 26px;
-webkit-font-smoothing: antialiased;
font-family: 'Nanum Gothic' !important;
list-style: none;
font-size: 16px;
background: 0 0;
border: 0;
margin: 0;
vertical-align: baseline;
outline: 0;
text-decoration: none;
cursor: pointer;
transition: color .3s ease-in-out;
color: inherit;
font-weight: 600 !important;
display: block;
top: 0;
left: 0;
padding: 14px 0px 14px 20px;
}

.subui:hover {
	color:#fbb817;
}

</style>
<div class="column_inner">
<aside class="sidebar">
							
		<div class="widget "><div id="dc_jqaccordion_widget-8">		
		<div class="dcjq-accordion" id="dc_jqaccordion_widget-8-item">

<ul id="menu-%ed%96%89%ec%a0%95" class="menu">
<form action="/beet/mylctr" method="get">
<input type="hidden" name="userid" value="<%=((Member)session.getAttribute("loginMember")).getId() %>">
<li><input type="submit" class="btn-sm subui" value="강의목록"></li>
 </form>
 
 <form action="/beet/atnlist" method="get">
<input type="hidden" name="userid" value="<%=((Member)session.getAttribute("loginMember")).getId() %>">
<li><input type="submit" class="btn-sm subui" value="출결조회"></li>
 </form> 
 
 
 <form action="/beet/myScore" method="get">
<input type="hidden" name="userid" value="<%=((Member)session.getAttribute("loginMember")).getId() %>">
<li><input type="submit" class="btn-sm subui" value="성적조회"></li>
 </form>
</ul>		


		</div>
		</div></div>		</aside>
	</div>
</body>
</html>