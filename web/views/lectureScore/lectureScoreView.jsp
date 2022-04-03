<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.util.ArrayList, student.model.vo.Member, lectureScore.model.vo.LectureScore" %>
<% ArrayList<LectureScore> list = (ArrayList<LectureScore>)request.getAttribute("list"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
<style type="text/css">
.tg  {border-collapse:collapse;border-spacing:0;border-color:inherit;text-align:left;vertical-align:top}
.tg td{border-color:black;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:14px;
  overflow:hidden;padding:10px 5px;word-break:normal;}
.tg th{border-color:black;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:14px;
  font-weight:normal;overflow:hidden;padding:10px 5px;word-break:normal;}
</style>
<table class="tg">
<thead>
<tr>
<th>강의번호</th>
<th>교과목명</th>
<th>이수구분</th>
<th>학점</th>
<th>등급</th>
<th>재수강</th>
</tr>
</thead>
<tbody>
<% for (LectureScore lscore : list) { %>
<tr>
<td><%=lscore.getLcode() %></td>
<td><%=lscore.getLname()%></td>
<td><%=lscore.getCategory() %></td>
<td><%=lscore.getLpoint() %></td>
<td><%=lscore.getGrade() %></td>
<td><%=lscore.getRetake() %></td>
</tr>
<% } %>
</tbody>
</table>
</body>
</html>