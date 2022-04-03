<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.Date, java.text.SimpleDateFormat, java.util.*,
				attendance.model.vo.Atndn, student.model.vo.Member"  %>   
 
<%
Member lmember = (Member)session.getAttribute("loginMember");
Date lastmodified = new Date();
SimpleDateFormat format1 = new SimpleDateFormat ( "yyyy-MM-dd HH:mm:ss");

Set<String> set = new HashSet<String>();
for (Atndn a : list) {
	session.setAttribute("semester", a.getSemester());
}
Iterator<String> it = set.iterator();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>