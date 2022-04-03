<%-- <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="schedule.model.vo.Schedule" %>
<%
Schedule schedule = (Schedule)request.getAttribute("schedule"); 
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title</title>
</head>
<body>
<form action="/nea/upsch" method="post" class="upform" onsubmit="return update();">
<!-- <input type="hidden" name="action" value="new"> -->
<table id="disup" align="center" width="800" cellspacing="5" cellpadding="0">
<tr>
<th >시작날짜</th>
	<td style="text-align: left;">
		<input type="number" name="schstartyear" value="<%= schedule.getSchstartyear() %>">
		<input type="number" name="schstartmonth"  value="1">
		<input type="number" name="schstartdate" value="1">
	</td>
</tr>
<tr>
<th>끝날짜</th>
	<td style="text-align: left;">
		<input type="number" name="schendyear" min="2010" max="2050" value="2020">
		<input type="number" name="schendmonth" min="1" max="12" value="1">
		<input type="number" name="schenddate" min="1" max="31" value="1">
	</td>
</tr>
<th >시작날짜</th>
	<td style="text-align: left;">
		<input type="number" name="schstartyear" value="<%=schedule.getSchstartyear() %>">
		<input type="number" name="schstartmonth" value="<%=schedule.getSchstartmonth() %>">
		<input type="number" name="schstartdate" value="<%=schedule.getSchstartdate() %>">
	</td>
</tr>
<tr>
<th>끝날짜</th>
	<td style="text-align: left;">
		<input type="number" name="schendyear" value="<%=schedule.getSchendyear() %>">
		<input type="number" name="schendmonth"  value="<%=schedule.getSchendmonth() %>">
		<input type="number" name="schenddate" value="<%=schedule.getSchenddate() %>">
	</td>
</tr>
<tr>
	<th>작성자</th>
	<td style="text-align: left;"><input type="text" name="adno" value="A003"></td>
</tr>
<tr>
	<th>일정 내용</th>
	<td style="text-align: left;"><textarea rows="2" cols="70" name="schname"><%= schedule.getSchname() %></textarea></td></tr>
<tr>
	<th colspan="3" >
		<input type="submit"value="수정하기"> &nbsp;&nbsp;
		<input type="reset"value="작성취소"> &nbsp;&nbsp;
		<a href="/nea/index.jsp">시작 페이지</a>
		
	</th>
</tr>
</table>
</form>
</body>
</html> --%>