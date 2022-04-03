<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    <%@ page
	import="attendance.model.vo.Atndn, java.util.*, student.model.vo.Member,
java.util.Date, java.text.SimpleDateFormat"%>
<%
	Member loginmember = (Member) session.getAttribute("loginMember");
	ArrayList<Atndn> list = (ArrayList<Atndn>) request.getAttribute("list");
%>
<!DOCTYPE html>
<html lang="ko-KR" class="myhaksa" style="height: auto; overflow: auto;">

<head>
	<meta charset="UTF-8">

<!-- ★타이틀여기에써주세요 -->
	<title>beet</title>
	
	<link href="//fonts.googleapis.com/css?family=Raleway:100,200,300,400,500,600,700,800,900,300italic,400italic" rel="stylesheet" type="text/css">
	<link href="https://fonts.googleapis.com/earlyaccess/notosanskr" rel="stylesheet" type="text/css">
	<link href="https://fonts.googleapis.com/earlyaccess/nanumgothic" rel="stylesheet" type="text/css">
	<link href="https://fonts.googleapis.com/css?family=Roboto" rel="stylesheet" type="text/css">
	<link href="https://fonts.googleapis.com/css?family=Kaushan+Script" rel="stylesheet">
	<link rel="stylesheet" href="//cdn.jsdelivr.net/npm/xeicon@2.3.3/xeicon.min.css">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>

<body class="responsive" style="height: auto; overflow: auto;">
	
<style type="text/css" id="wp-custom-css">

.major_info_text botton{
border: 2px solid #13436B;
background: #13436B;
color: #fff;
font-size: 16px;
padding: 5px 15px;
font-weight: 600;
cursor: pointer;
}		


p {
        margin: 0 0 1em;
    }
     
input.insert{ width: 40px; height:20px; margin:0px}  

select {width: 40px; height:20px; margin:0px}


/* ★ css style은 여기에 써주세요------------------------------------------------- */


</style>

<div class="wrapper">
	<div class="wrapper_inner">
	
	<!-- 헤더 header -->
		<%@ include file="/views/common/header.jsp" %>
		
		
		<div class="content " style="min-height: 755px; padding-top: 0px;">
		<div class="content_inner ">
		<div class="title_outer title_without_animation" data-animation="yes" data-height="350">
			<!-- ★배경 이미지 (변경시 backgroud-image, src 두군데 수정해야해요 --------------->
		<div class="title title_size_medium position_left has_fixed_background " style="background-size: 1920px; background-image: url(/beet/resources/images/test.jpg); 
			height: 350px; background-color: rgb(153, 153, 153); background-position: center 2.205px;">
		<div class="image not_responsive">
			<img itemprop="image" src="/beet/resources/images/test.jpg" alt="&nbsp;">
		</div>
		<div class="title_holder skrollable skrollable-between" data-0="opacity:1" data-300="opacity:0" style="padding-top: 133px; height: 217px; opacity: 1;">
					
					
		<div class="container">
		<div class="container_inner clearfix">
		<div class="title_subtitle_holder">
		<div class="title_subtitle_holder_inner">

		<h1 style="margin-top:75px"><span >출결/성적</span></h1> <!-- ★h1 이름 (메뉴이름 여기에 써주세요) ------------------------------------------>
		</div> </div> </div> </div> </div> </div> </div>
				
		<div class="container">
			<div class="container_inner default_template_holder clearfix page_container_inner">
			<div class="two_columns_75_25 background_color_sidebar grid2 clearfix">
			<!-------------★여기에 본문작성------------------------------------------------------------------------->
			<p class="page_tt">출결입력</p>  <!-- ★본문 제목 -------------------->
				
<p class="page_tt">전체출결조회</p>		







	<p class="page_tt">출결입력</p>

<form action="/beet/atnupdate" method="post">
	<table id="stable" class="main_default" cellpadding="10px">
		<tr>
			<select id="selected" name="selectweek">
				<% for (int i = 1; i <= 16; i++) { %>
				<option value="week<%= i %>"><%=i%>주차
				</option>
				<% } %>
			</select>

		</tr>
		<tr>
			<th> - </th>
			<th>순번</th>
			<th>학번</th>
			<th>학과</th>
			<th>이름</th>
			<th>출결입력</th>

		</tr>
			<%
				int i = 1;
				for (Atndn a : list) {
			%>
			<tr>
				<td><input name="chk" type="checkbox" style="height:20px;"></button></td>
				<td><%= i %></td>
				<td><%=a.getSid()%><input type="text" name="who<%= i %>" value="<%= a.getSid() %>" style="display:none;"></td>
				<td><%=a.getMajorname()%><input type="text" name="lcode" value="<%= a.getLcode() %>" style="display:none;"></td>
				<td><%=a.getSname()%></td>
				<td><select class="atndt" name="selectfour<%= i %>" style="width: 80px; height: 30px">
						<option value="-" selected disabled hidden>-</option>
						<option value="1">출석</option>
						<option value="2">결석</option>
						<option value="3">조퇴</option>
						<option value="4">지각</option>
				</select></td>
				</td>
			</tr>
			<%
				}
			%>
		
	</table>
	<p style="position:relative;float:center;margin-top:50px" align="center">
		<input class="btn btn-outline-secondary" type="submit" value="저장"> &nbsp;
		<input class="btn btn-outline-secondary" type="reset" value="취소"> &nbsp;
	</p>
	
</form>	
				
				
				
				
				
				
													
<script type="text/javascript" src="/beet/resources/js/jQuery.js"></script>
<script>
<!-- 스크립트 쓰는곳   -->
function selectfield(obj) {
	jQuery('input[name=semester]').attr('value', obj.value);
	
	jQuery("#field").click(function() {
	     this.form.submit();
	});

}

</script>
</div> </div></div></div>
					
					
<!-- footer -->		
<center>			
<footer>
	<div class="footer_inner clearfix" >
	<div class="footer_bottom_holder" style="background-color:#13436b !important">
	<div class="container" style="background-color:#13436B;color:#ffffff;padding-top:10px">
	NAEHAKSA ©202008 KH Information Educational Semi Project 6DDUKE
	</div>
	</div>
	</div>
</footer>
		</center>		
		</div>
	</div>
</div> <!-- wrapper 닫음 -->
</body>
</html>