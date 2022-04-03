<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
 <%@ page
	import="attendance.model.vo.Atndn, java.util.*, student.model.vo.Member,
java.util.Date, java.text.SimpleDateFormat"%>
<%
	Member loginmember = (Member) session.getAttribute("loginMember");
	Atndn atndn = (Atndn)request.getAttribute("atndn");
	
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
				</p>
		<div class="container">
			<div class="container_inner default_template_holder clearfix page_container_inner">
			<div class="two_columns_75_25 background_color_sidebar grid2 clearfix">
			<!-------------★여기에 본문작성------------------------------------------------------------------------->
				<div class="column1">
				<div class="column_inner">
			<div class="vc_row wpb_row section vc_row-fluid " style=" text-align:left;">
			<div class=" full_section_inner clearfix">
			<div class="wpb_column vc_column_container vc_col-sm-12">
			<div class="vc_column-inner "><div class="wpb_wrapper">
	<div class="wpb_text_column wpb_content_element ">
		<div class="wpb_wrapper">
		
<!-- --------------------------------------------------------------------------- -->		
		
      <!--★★★★★★★★★★★★★★★여기에 본문작성★★★★★★★ -->

<p class="page_tt">출결조회 : <%=atndn.getLname()%>
<div style="display:inline;font-size:0.9em">
<%=atndn.getLcode()%> / <%=atndn.getCategory()%> / 
<%=atndn.getLtime()%> / <%=atndn.getCapacity()%>명</div></p>
<p><progress id="prog" value="<%=diffWeeks%>" max="100" style="display:inline;"><div id="progress">진도율: <%=diffWeeks%>%</div></p>


<p>≫ 출결조회</p>				
<table class="main_default">
<thead>
<tr>
<th>WEEK1</th>
<th>WEEK2</th>
<th>WEEK3</th>
<th>WEEK4</th>
<th>WEEK5</th>
<th>WEEK6</th>
<th>WEEK7</th>
<th>WEEK8</th>
</tr>
<tr>
<td><%=atndn.getWeek1() %></td>
<td><%=atndn.getWeek2() %></td>
<td><%=atndn.getWeek3() %></td>
<td><%=atndn.getWeek4() %></td>
<td><%=atndn.getWeek5() %></td>
<td><%=atndn.getWeek6() %></td>
<td><%=atndn.getWeek7() %></td>
<td><%=atndn.getWeek8() %></td>
</tr>
<tr>
<th>WEEK9</th>
<th>WEEK10</th>
<th>WEEK11</th>
<th>WEEK12</th>
<th>WEEK13</th>
<th>WEEK14</th>
<th>WEEK15</th>
<th>WEEK16</th>
</tr>
<tr>
<td><%=atndn.getWeek9() %></td>
<td><%=atndn.getWeek10() %></td>
<td><%=atndn.getWeek11() %></td>
<td><%=atndn.getWeek12() %></td>
<td><%=atndn.getWeek13() %></td>
<td><%=atndn.getWeek14() %></td>
<td><%=atndn.getWeek15() %></td>
<td><%=atndn.getWeek16() %></td>
</tr>
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
				
</script>]

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