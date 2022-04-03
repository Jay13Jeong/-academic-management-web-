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


</script> 


 
 <script type="text/javascript" src="/beet/resources/js/jQuery.js"></script>
 <script>
<!--스크립트 이곳에 -->
 </script>
</body>
</html>