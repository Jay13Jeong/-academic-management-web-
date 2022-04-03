<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList, student.model.vo.Member, lectureScore.model.vo.LectureScore"%>
<% ArrayList<LectureScore> list = (ArrayList<LectureScore>)request.getAttribute("list"); %>
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
				
		<div class="container">
			<div class="container_inner default_template_holder clearfix page_container_inner">
			<div class="two_columns_75_25 background_color_sidebar grid2 clearfix">
			<!-------------★여기에 본문작성------------------------------------------------------------------------->
			<p class="page_tt"> 본문제목자리<!-- ★본문 제목 -------------------->

	<div class="column1" style="margin-left:3%;">
	<div class="column_inner">					
	<div class="vc_row wpb_row section vc_row-fluid " style=" text-align:left;">
	<div class=" full_section_inner clearfix"><div class="wpb_column vc_column_container vc_col-sm-12">
	<div class="vc_column-inner "><div class="wpb_wrapper">
	<div class="wpb_text_column wpb_content_element ">
	<div class="wpb_wrapper">
		

		<!-- 본문 내용 자리  -->












</div></div> </div></div></div></div></div></div></div> <!-- div column1 끝 -->


<!-- 서브메뉴★★★ 여기에 써주세요 -->
<!-- 안쓰면 바로아랫줄column2~ 서브메뉴끝까지  지워버리세요-->
<div class="column2">

<%@ include file = "side.jsp" %>
</div>
<!-- <div class="column_inner">
<aside class="sidebar">
							
		<div class="widget "><div id="dc_jqaccordion_widget-8">		
		<div class="dcjq-accordion" id="dc_jqaccordion_widget-8-item">

<ul id="menu-%ed%96%89%ec%a0%95" class="menu">
  <li id="menu-item-9101" class="menu001-9101"><a href="#">강의계획서</a></li>
  <li id="menu-item-9102" class="menu002-9102"><a href="#">수강신청</a></li>
  <li id="menu-item-9103" class="menu003-9103"><a href="#">시간표조회</a></li> <li id="menu-item-9104" class="menu004-9104"><a href="#">휴보강신청</a></li>
  <li id="menu-item-9105" class="menu005-9105"><a href="#">수강과목추가</a></li> 
  <li id="menu-item-9106" class="menu006-9106"><a href="#">첫화면으로</a></li>
</ul>		


		</div>
		</div></div>		</aside>-->
	</div>
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
//수정가능 

 
</script>
		</div> </div>
						</div>
					</div>
					
					
<!-- footer -->		
<center>			
<footer>
	<div class="footer_inner clearfix" >
	<div class="footer_bottom_holder" style="background-color:#555555 !important">
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