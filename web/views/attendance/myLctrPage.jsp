<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
 <%@ page
	import="attendance.model.vo.Atndn, java.util.*, student.model.vo.Member,
java.util.Date, java.text.SimpleDateFormat"%>
<%
	Member loginmember = (Member) session.getAttribute("loginMember");
	ArrayList<Atndn> list = (ArrayList<Atndn>) request.getAttribute("list");

	Set<String> set = new HashSet<String>();
	for (Atndn a : list) {
		set.add(a.getSemester());
	}
	Iterator<String> it = set.iterator();
	
	
	SimpleDateFormat sdf = new SimpleDateFormat("E");
	SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
	Date today = new Date();
	String day = sdf.format(today);
	Date enter = sdf2.parse("2020-03-02");

	long diff = today.getTime() - enter.getTime();
	long diffWeeks = diff / (24 * 60 * 60 * 1000) / 7 * 2;
					
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
		<div class="title title_size_medium position_left has_fixed_background " style="background-size: 1920px; background-image: url(/beet/resources/images/page.jpg); 
			height: 350px; background-color: rgb(153, 153, 153); background-position: center 2.205px;">
		<div class="image not_responsive">
			<img itemprop="image" src="/beet/resources/images/page.jpg" alt="&nbsp;">
		</div>
		<div class="title_holder skrollable skrollable-between" data-0="opacity:1" data-300="opacity:0" style="padding-top: 133px; height: 217px; opacity: 1;">
					
					
		<div class="container">
		<div class="container_inner clearfix">
		<div class="title_subtitle_holder">
		<div class="title_subtitle_holder_inner">

		<h1 style="margin-top:75px"><span >출결/성적</span></h1> <!-- ★h1 이름 (메뉴이름 여기에 써주세요) ------------------------------------------>
		</div> </div> </div> </div> </div> </div> </div>
				</p>
		<div class="container">
			<div class="container_inner default_template_holder clearfix page_container_inner">
			<div class="two_columns_75_25 background_color_sidebar grid2 clearfix">
							<div class="column1">
				<div class="column_inner">
			<div class="vc_row wpb_row section vc_row-fluid " style=" text-align:left;">
			<div class=" full_section_inner clearfix">
			<div class="wpb_column vc_column_container vc_col-sm-12">
			<div class="vc_column-inner "><div class="wpb_wrapper">
	<div class="wpb_text_column wpb_content_element ">
		<div class="wpb_wrapper">
			<!-------------★여기에 본문작성------------------------------------------------------------------------->
			<p class="page_tt"> 출결/성적 관리</p>  <!-- ★본문 제목 -------------------->
							
			<table class="main_default">

<tbody>
<% for (Atndn a : list) {
	if (a.getLtime().equals(day) && a.getSemester().equals("202001")) {
		%>
		<p>≫ 오늘의 강의</p>
<colgroup>
<col style="width:20%">
<col style="width:20%">
<col style="width:20%">
<col style="width:10%">
<col style="width:30%">
</colgroup>
<tr >
	<td colspan="4" style="">
	<div style="float:center;font-size:2.0em"><%=a.getLname()%></div></td>
	<!-- <td style="width=30%"><button class=button>강의실로 이동</button></td> -->
	<td><div style="float:left;margin-left:15px;margin-top:20px;font-size:0.9em"><%=a.getLcode()%> / <%=a.getCategory()%> / <%=a.getLtime()%> / <%=a.getCapacity()%>명</div></td>
</tr>
<tr>
	<td colspan="4" style="color: green;"><progress id="prog"
		value="<%=diffWeeks%>" max="100"></td>
	<td id="progress">진도율: <%=diffWeeks%>%
	</td>
</tr>
	<% }}%>
</tbody>
</table>

<br>
<br>
<p>≫ 나의 강의목록</p>
<table class="main_default" cellpadding="10px">
		<tr>
			<form action="/beet/mylctrSeme" method="get">
			<input type="hidden" name="userid" value="<%=loginmember.getId()%>"> 
			<input type="hidden" name="semester" value=""> 
			<select id="field" onchange="javascript:selectfield(this);" style="width: 80px">
				<%-- <%
					while (it.hasNext()) {
				%>
				<option><%=it.next()%></option>
				<% 
					}
				%>
 --%>
 				<option>202001</option>
 				<option>201902</option>
 				<option>201901</option>
			</select>
			</form>
		</tr>
		<tr style="font-size:15px">
			<th>과목번호</th>
			<th>이수구분</th>
			<th>과목명</th>
			<th>강의시간</th>
			<th>학점</th>
			<th>수강인원</th>
			<th>담당교수</th>
			<th>출결</th>

		</tr>
		<%
			for (Atndn a : list) {
		%>
		<tr>

			<td><%=a.getLcode()%></td>
			<td><%=a.getCategory()%></td>
			<td><%=a.getLname()%></td>
			<td><%=a.getLtime()%></td>
			<td><%=a.getLpoint()%></td>
			<td><%=a.getCapacity()%></td>
			<td><%=a.getPname()%></td>
			<td>
		<form id="hi" action="/beet/dlAtndn" method="get">
		<input class="down_default" type="hidden" name="userid" value="<%= ((Member)session.getAttribute("loginMember")).getId() %>"> 
		<input type="hidden" name="lcode" value="<%= a.getLcode() %>"> 
		<input type="hidden" name="semester" value=""> 
		<input type="submit" class="btn-sm btn btn-outline-secondary" value="출결조회">
    
    
				</form>
			</td>
		</tr>
		<%
			}
		%>
	</table>
							
</div> 
	</div> </div></div></div></div></div></div></div>

<!-- 서브메뉴★★★ 여기에 써주세요 -->
<!-- 안쓰면 바로아랫줄column2~ 서브메뉴끝까지  지워버리세요-->
<div class="column2">	
<%@ include file = "side.jsp" %>

</div> 
<!-- 서브메뉴 끝 -->
						</div>
								
		</div>
        	</div>
				
	</div>
</div>							
							
													
<script type="text/javascript" src="/beet/resources/js/jQuery.js"></script>
<script>
<!-- 스크립트 쓰는곳   -->
jQuery( '#hi' ).click( function() {
	 var str = ""
           var tdArr = new Array();    // 배열 선언
           var checkBtn = $(this);
	
           var no = td.eq(0).text();
	} );

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