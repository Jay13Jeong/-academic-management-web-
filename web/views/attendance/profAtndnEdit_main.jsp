<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Date, java.text.SimpleDateFormat, java.util.*,
				attendance.model.vo.Atndn, student.model.vo.Member" %>   
 
<%
Member loginmember = (Member)session.getAttribute("loginMember");
ArrayList<Atndn> list = (ArrayList<Atndn>)request.getAttribute("list");
Date lastmodified = new Date();
SimpleDateFormat format1 = new SimpleDateFormat ( "yyyy-MM-dd HH:mm:ss");


Set<String> set = new HashSet<String>();
for (Atndn a : list) {
	set.add(a.getSemester());
}
Iterator<String> it = set.iterator();
%>
 <!--  성적이랑합침  -->

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
<h1>교수의 성적 입력 현황 출력해주는 페이지 (리스트로)  </h1>

<select id="selected">
				style="width: 80px"> 
				<% while (it.hasNext()) { %>
				<option><%=it.next()%></option>
				<% } %>
			</select>
<style type="text/css">
.tg  {border-collapse:collapse;border-spacing:0;border-color:inherit;text-align:left;vertical-align:top}
.tg td{border-color:black;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:14px;
  overflow:hidden;padding:10px 5px;word-break:normal;}
.tg th{border-color:black;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:14px;
  font-weight:normal;overflow:hidden;padding:10px 5px;word-break:normal;}
</style>
<script type="text/javascript" src="/beet/resources/js/jquery-3.5.1.min.js"></script>
<script>
	function validate(){
		
	}

</script> 

<table class="tg">
<thead>
  <tr>
    <th>순번</th>
    <th>학년학기</th>
    <th>이수구분</th>
    <th>과목번호</th>
    <th>과목명</th>
    <th>수강인원</th>
    <th>학점</th>
    <th>출결입력</th>
  </tr>
</thead>
<tbody>
<% int i = 1; for (Atndn atndn : list) { %>

  <tr>
  	<td><%= i %></td><% i += 1; %>
    <td><%= atndn.getSemester() %></td>
    <td><%=atndn.getCategory() %></td>
  	 <td><%=atndn.getLcode() %></td>
	<td id="lname"><%=atndn.getLname()%></td>
	<td><%= atndn.getLpoint() %></td>
	<td><%= atndn.getCapacity() %></td>
	<td>
		<form action="/beet/atnedit.p" method="post">
			<input type="submit" style="width:60pt;height:20pt;" value="성적관리">
			<input type="hidden" name="userid" value="<%=loginmember.getId() %>">
			<input type="hidden" name="lname" value="<%=atndn.getLname() %>">
		</form>
	</td>
	<td><%=format1.format(lastmodified) %></td>
	<% } %>
  
  </tr>
</tbody>
</table>
<form action="/beet/atnlist" method="post">
<input type="hidden" name="userid" value="<%=loginmember.getId() %>">
<input type="text" onchange="td_copy(lname.value)" >
<input type="submit" class="btn-sm" value="성적수정">
 </form>
 
 <script type="text/javascript" src="/beet/resources/js/jQuery.js"></script>
 <script>
 $(function(){
	 $('#selectSemester').change(function(){
		 var test = $("#selectSemester option:selected").val();
		 document.querySelectorAll('tr').value = test;	
		 alert(test);
	 });
 });
 

 </script>
</body>
</html>