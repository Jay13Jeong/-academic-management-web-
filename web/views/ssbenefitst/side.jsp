<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="student.model.vo.Member"%>
    <% 
    String s = ((Member)session.getAttribute("loginMember")).getId().substring(0, 1);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div class="column_inner">
<aside class="sidebar">
							
		<div class="widget "><div id="dc_jqaccordion_widget-8">		
		<div class="dcjq-accordion" id="dc_jqaccordion_widget-8-item">

<ul id="menu-%ed%96%89%ec%a0%95" class="menu">
<% if( s.equals("A") ){ %>
  <li id="menu-item-9101" class="menu001-9101"><a href="#">장학금 관리</a></li>
  <li id="menu-item-9102" class="menu002-9102"><a href="#">장학금수혜학생 관리</a></li>
  <li id="menu-item-9103" class="menu003-9103"><a href="#">계열 관리</a></li> 
  <li id="menu-item-9104" class="menu004-9104"><a href="#">학과 관리</a></li>
  <% }else if(!s.equals("p") && !s.equals("A")){ %>
    <li id="menu-item-9101" class="menu001-9101"><a href="#">등록금 조회</a></li>
  <li id="menu-item-9102" class="menu002-9102"><a href="#">장학금 조회</a></li>
<% } %>
</ul>		



		</div>
		</div></div>		</aside>
	</div>
</body>
</html>