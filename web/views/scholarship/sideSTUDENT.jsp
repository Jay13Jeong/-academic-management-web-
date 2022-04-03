<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="student.model.vo.Member"%>
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
  <li id="menu-item-9101" class="menu001-9101"><a href="/beet/s.t.list?who=<%= ((Member)session.getAttribute("loginMember")).getId() %>">등록금고지서 조회</a></li>
  <li id="menu-item-9102" class="menu002-9102"><a href="/beet/selectbenest?studentid<%= ((Member)session.getAttribute("loginMember")).getId() %>">장학금 조회</a></li>
</ul>		
		</div>
		</div></div></aside>
	</div>
</body>
</html>