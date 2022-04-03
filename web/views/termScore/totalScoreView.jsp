<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="termScore.model.vo.TermScore, student.model.vo.Member, java.util.ArrayList " %>	
<% TermScore tscore = (TermScore)request.getAttribute("tscore"); %> 
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
    <th>신청학점</th>
    <th>취득학점</th>
    <th>졸업이수학점</th>
    <th>평점평균</th>
  </tr>
</thead>
<tbody>
  <tr>
  	
    <td><%= tscore.getTermaplpoint() %></td>
    <td><%= tscore.getTermgetpoint() %></td>
    <td><%= tscore.getGrdpoint() %></td>
    <td><%= tscore.getTgpa() %></td>
  </tr>
</tbody>
</table>
</body>
</html>