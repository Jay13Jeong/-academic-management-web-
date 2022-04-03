<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ page import="absence.model.vo.Absence, java.util.ArrayList"%>
<%
	ArrayList<Absence> list = (ArrayList<Absence>)request.getAttribute("list");
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>beet</title>
</head>
<body>
<style type="text/css">
.tg {
	border-collapse: collapse;
	border-spacing: 0;
	border-color: inherit;
	text-align: left;
	vertical-align: top
}
.tg td {
	border-color: black;
	border-style: solid;
	border-width: 1px;
	font-family: Arial, sans-serif;
	font-size: 14px;
	overflow: hidden;
	padding: 10px 5px;
	word-break: normal;
}
.tg th {
	border-color: black;
	border-style: solid;
	border-width: 1px;
	font-family: Arial, sans-serif;
	font-size: 14px;
	font-weight: border;
	overflow: hidden;
	padding: 10px 5px;
	word-break: normal;
}

</style>
<header>
<%@ include file="../common/header.jsp"%>
</header>

<br><br><br><br><br>
<div align="center">
<button onclick="javascript:location.href='/beet/selectaball'">전 체 조 회</button>
<br>
<button onclick="javascript:location.href='/beet/selectaba?value=a'">휴 학 조 회</button>
<button onclick="javascript:location.href='/beet/selectaba?value=b'">복 학 조 회</button>
<br>

<% if(list != null){ %>
<form method="post" name="managerform">
<table id="select" class="tg">
<tr><th style="font-weight: bold;">신청번호</th><th style="font-weight: bold;">학번</th><th style="font-weight: bold;">신청일</th><th style="font-weight: bold;">취소가능날짜</th><th style="font-weight: bold;">승인여부</th></tr>
<% for(Absence ab : list){ %>
<tr><td><input type="radio" name="requestid" value=<%=ab.getRequestid()%> readonly><%=ab.getRequestid()%></td>
	<td><%=ab.getStudentid() %></td>
	<td><%=ab.getRequestdate() %></td>
	<td><%=ab.getLimitcanceldate() %></td>
	<td><%=ab.getApproval()%></td>
<% } %>
</tr>
</table>
<input type="submit" value="승인하기" onclick="javascript: managerform.action='/beet/updateab'">
<input type="submit" value="신청삭제(복구불가)" onclick="javascript: managerform.action='/beet/deleteabad'">
</form>
<% } %>

</div>
</body>
</html>