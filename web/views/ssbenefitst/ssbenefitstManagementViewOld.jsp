<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="ssbenefitst.model.vo.Ssbenefitst, java.util.ArrayList, scholarship.model.vo.Scholarship"%>
<%
	ArrayList<Ssbenefitst> list = (ArrayList<Ssbenefitst>)request.getAttribute("list");
	ArrayList<Scholarship> sslist = (ArrayList<Scholarship>)request.getAttribute("sslist");
	Ssbenefitst stst = (Ssbenefitst)request.getAttribute("ssst");
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>beet</title>
<script>
    function numberMaxLength(e){
        if(e.value.length > e.maxLength){
            e.value = e.value.slice(0, e.maxLength);
        }
    }
</script>
<style type="text/css">

  table {
    width: 50%;
    border-top: 1px solid #444444;
    border-collapse: collapse;
  }
  th, td {
    border-bottom: 1px solid #444444;
    padding: 10px;
  }

</style>
</head>
<body>
<header>
<%@ include file="../common/header.jsp"%>
</header>
<%@ include file="../common/side.jsp"%>
<div align="center">
<h1>장학금수혜학생 관리 페이지</h1>

<button onclick="javascript:location.href='/beet/selectbeneall'">전체 조회</button>
<% if(list != null){ %>
<table class="tg">
<tr><th colspan="3">조회테이블</th></tr>
<tr><th>수혜학기</th><th>학 번</th><th>장학금명</th></tr>

	<% for(Ssbenefitst ssst : list){ %>
	<tr><th><input type="radio" name="benefitterm" value="<%=ssst.getBenefitterm() %>" readonly><%=ssst.getBenefitterm() %></th>
		<td><%=ssst.getStudentid() %></td>
		<td><%=ssst.getSsname() %></td> </tr>
	<% } %>
</table>	
	<form action="/beet/selectonessst" method="post">
	학기입력<input class="form-control" type="number" placeholder="ex)202001" 
						name="benefitterm" maxlength="6" oninput="numberMaxLength(this);"/>
	학번입력<input type="text"  placeholder="학번 입력란" maxlength="9" oninput="numberMaxLength(this);" name="studentid">
	<input type="submit" value="검 색">
	</form>
<% } %>

<% if(stst != null){ %>
<form action="/beet/deletebenest" method="post">
<input type="hidden" name="benefitterm" value="<%=stst.getBenefitterm() %>">
<input type="hidden" name="studentid" value="<%=stst.getStudentid() %>">
	<% if(stst.getStudentid() != null){ %>
	<table class="tg">
		<tr><th colspan="3">조회하신 결과입니다</th></tr>
		<tr><th>수혜학기</th><th>학 번</th><th>장학금명</th></tr>
		<tr><th><%=stst.getBenefitterm() %></th>
			<td><%=stst.getStudentid() %></td>
			<td><%=stst.getSsname() %></td>
		</tr>
	</table>
	<input type="submit" value="삭제하기">
	<% }else{ %>
	조회하신 조건에 맞는 결과가 없습니다.
	<% } %>
</form>
<% }%>

<br><br><br><br>

<%-- <form action="javascript:location.href='/beet/updatebenest'" method="post">
<table class="tg">
<tr><th colspan="3">수정테이블</th> </tr>
<% if(list != null){ %>
	<% for(Ssbenefitst ssst : list){ %>
	<tr><th><input type="hidden" name="originterm" value="<%=ssst.getBenefitterm() %>"></th>
		<th><input type="hidden" name="originid" value="<%=ssst.getStudentid() %>"></th>
		
		<th><input type="text" name="benefitterm"><%=ssst.getBenefitterm() %></th>
		<td><input type="text" name="studentid"><%=ssst.getStudentid() %></td>
		<td><input type="number" name="ssname"><%=ssst.getSsname() %></td>
	</tr>
	<% } %>
	<tr><td colspan="3"><input type="submit" value="장학금수혜학생 수정"></td></tr>
<% } %>
</table>

</form> --%>

<% if(sslist != null){ %>
<table class="tg">
<tr><th>장학금명</th><th>수혜조건</th><th>장학금액</th></tr>
	<% for(Scholarship ss : sslist){ %>
	<tr><th><%=ss.getSsname() %></th><td><%= ss.getBenefitcon() %></td><td><%= ss.getValue() %></td> </tr>
	<% } %>
</table>
<% } %>
<button onclick="javascript:location.href='/beet/selectss'">장학금 관리페이지로 이동</button>
<br><br>

<form action="/beet/insertscoress" method="post">
<table class="tg">
<tr><th colspan="2">성적장학금 입력</th></tr>
<tr><th>성적검색할 학기</th><td><input class="form-control" type="number" placeholder="ex)202001" 
						name="term1" maxlength="6" oninput="numberMaxLength(this);"/></td></tr>
<tr><th>성적등수입력</th><td>시작등수<input type="number" name="startrank" maxlength="4" oninput="numberMaxLength(this);">
						 끝등수<input type="number" name="endrank" maxlength="4" oninput="numberMaxLength(this);"></td></tr>
<tr><th>장학금명</th><td><input type="text" name="ssname1"></td></tr>
<tr><td colspan="2" align="center"><input type="submit" value="장학금수혜학생 추가"></td></tr>
</table>
</form>


</div>

</body>
</html>