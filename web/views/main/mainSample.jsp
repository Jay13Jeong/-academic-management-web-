

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="student.model.vo.Member" isErrorPage="false" %>
<%@page import="java.util.Calendar"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<% Member m = (Member)session.getAttribute("loginMember"); %>
<% Member m1 = (Member)session.getAttribute("loginMember"); %>

<%	request.setCharacterEncoding("utf-8");
	Calendar now = Calendar.getInstance();
	int month = now.get(Calendar.MONTH)+1;%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>beet</title>
</head>

<!-- 
<style type="text/css">
/*   body {
  font-family: 'Poppins', sans-serif;
  margin: 0;
  padding: 0;
  display: flex; 
  flex-direction: column;
 /*  justify-content: center; */
/*   align-items: center;
  min-height: 100vh;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
}   */ 

/* #outer{
			width: 800px;
			margin-left: auto;
			margin-right: auto;
		} */

.quotes {
   /* width: 65vw; */
   min-height: 350px;  
   display: flex;
  /* flex-wrap: wrap; */
  /* justify-content: space-between; */
   z-index: 2; 
   
}
 .quotes .box {
  position: relative; 
  width: 230px;
  height: 230px;
  min-height: 0px;  
  background: #f2f2f2;
  padding: 30px;
  box-shadow: 10px 20px 30px rgba(0, 0, 0, 0.3) ;
} 





.quotes .box::after {
  content: '\201D';
  position: absolute;
  bottom: -10%;
  right: 5%;
  font-size: 120px;
  opacity: 0.2;
  background: transparent;
  filter: invert(1);
  pointer-events: none;
}

.quotes .box p {
  margin: 0;
  padding: 10px;
  font-size: 1.2rem;
}

.quotes .box h2 {
   position: absolute; 
   margin: 0;
  padding: 0;
  bottom: 10%;
  right: 10%;
  font-size: 1.5rem;
}

.quotes .bg {
  position: absolute;
  top: 0;
  left: 0;
  z-index: 1;
  opacity: 0;
  transition: all 0.5s ease-in;
  pointer-events: none;
  width: 100%;
  height: 200%;
  overflow: hidden;
} 
</style>  -->
<style>



.box{
    width: 55%;
    min-height: 300px;  
    margin: 10px auto;
    display: flex;
    

}
.a{
    border: 1px solid ;
    flex:1;
    width:25%;
    box-sizing: border-box;
    font-size: 0.5rem;
}

.b{
    border: 1px solid ;
    flex:1;
    margin: 0px 7%;
    width:25%;
    box-sizing: border-box;
}

.c{
    border: 1px solid ;
    flex:1;
    width:25%;
    box-sizing: border-box;
}
.d{
    border: 1px solid ;
    flex:1;
    width:25%;
    box-sizing: border-box;
}

.e{
    border: 1px solid ;
    flex:1;
    margin: 0px 7%;
    width:25%;
    box-sizing: border-box;
}

.f{
    border: 1px solid ;
    flex:1;
    width:25%;
    box-sizing: border-box;
}


table.cal_calendar{
	padding:0px;margin:0 auto;

}
table.cal_calendar th{
	border:1px solid #c0c0c0;
	background-color:#e0e0e0;
	width:36px;
	font-family:돋움;
	font-size:11px;padding:3px;

}
table.cal_calendar td{
	border:1px solid #e0e0e0;
	background-color:#ffffff;
	text-align:center;
	width:20px;
	height:25px;
	font-family:tahoma;
	font-size:11px;padding:3px;
}
.cal_today{
	color:#ff0000;
	font-weight:bold;
}
.cal_days_bef_aft{
	color:#5a779e;
}


</style>

<script type="text/javascript">
function setStyle(id,style,value)
{
    id.style[style] = value;
}
function opacity(el,opacity)
{
        setStyle(el,"filter:","alpha(opacity="+opacity+")");
        setStyle(el,"-moz-opacity",opacity/100);
        setStyle(el,"-khtml-opacity",opacity/100);
        setStyle(el,"opacity",opacity/100);
}
function calendar()
{
        var date = new Date();
        var day = date.getDate();
        var month = date.getMonth();
        var year = date.getYear();
        if(year<=200)
        {
                year += 1900;
        }
        months = new Array('1', '2', '3', '4', '5', '6', '7', '8', '9', '10', '11', '12');
        days_in_month = new Array(31,28,31,30,31,30,31,31,30,31,30,31);
        if(year%4 == 0 && year!=1900)
        {
                days_in_month[1]=29;
        }
        total = days_in_month[month];
        var date_today = year+'년'+months[month]+'월 '+day+'일';
        beg_j = date;
        beg_j.setDate(1);
        if(beg_j.getDate()==2)
        {
                beg_j=setDate(0);
        }
        beg_j = beg_j.getDay();
        document.write('<table class="cal_calendar" onload="opacity(document.getElementById(\'cal_body\'),20);"><tbody id="cal_body"><tr><th colspan="7">'+date_today+'</th></tr>');
        document.write('<tr class="cal_d_weeks"><th>일</th><th>월</th><th>화</th><th>수</th><th>목</th><th>금</th><th>토</th></tr><tr>');
        week = 0;
        for(i=1;i<=beg_j;i++)
        {
                document.write('<td class="cal_days_bef_aft">'+(days_in_month[month-1]-beg_j+i)+'</td>');
                week++;
        }
        for(i=1;i<=total;i++)
        {
                if(week==0)
                {
                        document.write('<tr>');
                }
                if(day==i)
                {
                        document.write('<td class="cal_today">'+i+'</td>');
                }
                else
                {
                        document.write('<td>'+i+'</td>');
                }
                week++;
                if(week==7)
                {
                        document.write('</tr>');
                        week=0;
                }
        }
        for(i=1;week!=0;i++)
        {
                document.write('<td class="cal_days_bef_aft">'+i+'</td>');
                week++;
                if(week==7)
                {
                        document.write('</tr>');
                        week=0;
                }
        }
        document.write('</tbody></table>');
        opacity(document.getElementById('cal_body'),70);
        return true;
}
</script>


<script type="text/javascript" src="/beet/resources/js/jquery-3.5.1.min.js"></script>

<script type="text/javascript"> 

$(function(){

	
	//스케줄
	$.ajax({
		url: "/beet/smonth",
		type: "get", 
		dataType: "json",
		success: function(data){
			
			console.log("success : "+ data);
			
			
			var jsonStr = JSON.stringify(data);
		
			var json = JSON.parse(jsonStr);
			
			var values = "";
			for(var i in json.list){
				values += "<tr><td>"+ json.list[i].schstartdate
				+ "</td><td><a href='/beet/schlist" +"'>" 
				 + decodeURIComponent(json.list[i].schname).replace(/\+/gi, " ")+ "</td></tr>";
			} 
			
			
			$("#mainSchedule").html($("#mainSchedule").html() + values); 
		
			
			
		},
		error: function(jqXHR, textstatus, errorthrown){
			console.log("error : "+ jqXHR + ","+textstatus + "," + errorthrown);
		}
	}); 
	
	//공지사항 
	$.ajax({
		url: "/beet/ntop5",
		type: "get", 
		dataType: "json",
		success: function(data){
			
			console.log("success : "+ data);
			
		
			var jsonStr = JSON.stringify(data);
			
			var json = JSON.parse(jsonStr);
			
			var values = "";
			for(var i in json.list){
				values += "<tr><td>"+ json.list[i].no 
				+ "</td><td><a href='/beet/ndetail?noticeno=" + json.list[i].no + "'>" 
				+ decodeURIComponent(json.list[i].title).replace(/\+/gi, " ")
				+ "</a></td><td>"+ json.list[i].date + "</td></tr>";
			} 
			
			
			$("#mainNotice").html($("#mainNotice").html() + values); //html을 적용해야 태그를 적용할 수 있다.
		
			
			
		},
		error: function(jqXHR, textstatus, errorthrown){
			console.log("error : "+ jqXHR + ","+textstatus + "," + errorthrown);
		}
	}); 
	
	//학점
 	$.ajax({
		url: "/beet/stusco?id=<%= m.getId() %>",
		type: "get", 
		dataType: "json",
		success: function(data){
			
			console.log("success : "+ data);
			
		
			var jsonStr = JSON.stringify(data);
			
			var json = JSON.parse(jsonStr);
			
			var values = "";
			for(var i in json.list){
				values += "<tr><td>"+ json.list[i].SEMESTER
				+ "</td><td>" + json.list[i].TERMGETPOINT + "</td></tr>";
			} 
			
			
			$("#mainScore").html($("#mainScore").html() + values); //html을 적용해야 태그를 적용할 수 있다.
		
			
			
		},
		error: function(jqXHR, textstatus, errorthrown){
			console.log("error : "+ jqXHR + ","+textstatus + "," + errorthrown);
		}
	});   
	


	//날씨
	$.ajax({
		url: "/beet/weather",
		type: "get", 
		dataType: "json",
		success: function(msg){
			
			console.log("success : "+ msg);
			
	
			
			var REH = msg.response.body.items.item[1].obsrValue;
		    var RN1 = msg.response.body.items.item[2].obsrValue;
		    var T1H = msg.response.body.items.item[3].obsrValue;
		     
		    
		  
		 
		  
		     $('.습도').html("습도 : "+ msg.response.body.items.item[1].obsrValue +"%"); 
		    
		   $('.강수량').html("강수량 : "+ RN1 +"mm"); 
		    
		    $('.기온').html("기온 : "+ T1H + " ℃");
		  
		},
		error: function(jqXHR, textstatus, errorthrown){
			console.log("error : "+ jqXHR + ","+textstatus + "," + errorthrown);
		}
     });    

	
});
	
	
</script>


<body>
<<<<<<< HEAD
<button onclick="javascript:location.href='mainSample.jsp'">메인테스트</button>
<button onclick="javascript:location.href='../common/sample5.jsp'">샘플5</button>
<button onclick="javascript:location.href='../common/main2123.jsp'">메인ㅇ</button>
=======
<button onclick="javascript:location.href='../main/mainSample.jsp'">메인테스트</button>
<button onclick="javascript:location.href='../common/contentSample.jsp'">컨텐츠샘플</button>
<button onclick="javascript:location.href='../common/side.jsp'">사이드메뉴</button>
<button onclick="javascript:location.href='../common/header.jsp'">헤더메뉴</button>
>>>>>>> 0b137335e730fd0402cba1d489f2b6be8f803e32
<button onclick="javascript:location.href='../common/sample3.jsp'">샘플페이지</button>
<button onclick="javascript:location.href='../common/sample2.jsp'">샘플페이지</button>
<h2>테스트 메뉴 버튼</h2>
<button onclick="javascript:location.href='../lecture/menu.jsp'">수강신청 메뉴테스트</button>
<button onclick="javascript:location.href='../attendance/sub4main.jsp'">출결 목록 테스트</button>
<button onclick="javascript:location.href='../absence/absenceRequestView.jsp'">학생신청페이지</button>
<button onclick="javascript:location.href='/beet/nlist'">공지사항</button>
<button onclick="javascript:location.href='../student/회원가입선택.jsp'">회원가입</button>
<button onclick="javascript:location.href='../student/findId.jsp'">아이디찾기</button>
<button onclick="javascript:location.href='../student/findPassword.jsp'">비밀번호찾기</button>
<button onclick="javascript:location.href='../student/memberUpdatePage.jsp'">마이페이지</button>
<hr>

<header>
<%@ include file="../common/header.jsp" %>

</header>

<div id="outer">

<br>
<br>
 <div class="box">
        <div class="a">first
        		<%if(m1.getId().substring(0, 1).equals("P")){ %>
					 <h1> 코드 : <%= m.getId() %><br>
					 	 <%=m.getCategoryname() %><br>
      					 <%= m.getName() %>교수님 <br>
      					   내학사에 오신것을 환영합니다.</h1>
      					 
				<% }else if(m1.getId().substring(0, 1).equals("A")){ %>
					 <h1>관리자 코드 : <%= m.getId() %><br>
      					 <%= m.getName() %>관리자님 <br>
      					 내학사에 오신것을 환영합니다.</h1>
      					 
				<% }else{ %>
					 <h1>내 학번 : <%= m.getId() %><br>
					  <%=m.getCategoryname() %><br>
      					 <%= m.getName() %>님 <br>
      					 내학사에 오신것을 환영합니다.</h1>
				<%} %>
        	 
        </div>
        
        <div class="b">second
       	 <h2 >캘린더</h2>
        	<script type="text/javascript">
				calendar();
			</script>
        </div>
        
        <div class="c">third
         <table id="mainSchedule" border="1" cellspacing="0">
        <h2> <%=month %>월 학사일정</h2>
      	<tr>
      		<th> &nbsp;일&nbsp;</th><th> 일정 </th>
      	</tr>
      	
      	</table>
        </div>
 </div>
 <br>
 <br>
 
  <div class="box">
        <div class="d">first
        	 <table id="mainScore" border="1" cellspacing="0">
      		  <h2>나의 학점 현황</h2>
        
      			<th>학기</th><th> 취득학점 </th>
      	
      	</table>
        </div>
        <div class="e">second
        		<h2>최신 공지글</h2>
      	<section>
      	<table id="mainNotice" border="1" cellspacing="0">
      	<tr>
      		<th>번호<th>제목</th><th>날짜</th>
      	</tr>
      	</table>
      	</section>
        </div>
        <div class="f">third
        	    <h2>날씨</h2>
       	
      
       	<table id="mainWeather" border="1" cellspacing="0">
        <ul>
          
            <li class="강수량"></li>
            <li class="기온"></li>
            <li class="습도"></li>
            
        </ul>
        </table>
        </div>
 </div>
<br>
<br>
 <%--  <div class="quotes">
    <div class="card">
      <div class="box box1">
      <h1>내 학번 : <%= m.getId() %>, <%=m.getCategoryname() %>
       <%= m.getName() %>님 내학사에 오신것을 환영합니다.</h1>
		 
		  <table id="mainLecture" border="1" cellspacing="0">
      	<tr>
      		
      	</tr>
      	
      	</table>
      </div>
      
      <div class="bg"></div>
    </div>
    <div class="card">
      <div class="box box2">
      <h2 >캘린더</h2>
                  <table width="250" border="0" cellpadding="1" cellspacing="2">
                <tr height="30">
                    <td align="center">
                         <a href="calendar.jsp?year=<%=year%>&month=<%=month-1%>">◀</a> 
                        <b><%=year %>년 <%=month %>월</b>
                        <a href="calendar.jsp?year=<%=year%>&month=<%=month+1%>">▶</a>
                    </td>
                </tr>
            </table>
           
            <table width="210" border="0" cellpadding="2" cellspacing="1" bgcolor="#cccccc">
                <tr height="25">
                    <td align="center" bgcolor="#e6e4e6"><font color="red">일</font></td>
                    <td align="center" bgcolor="#e6e4e6">월</td>
                    <td align="center" bgcolor="#e6e4e6">화</td>
                    <td align="center" bgcolor="#e6e4e6">수</td>
                    <td align="center" bgcolor="#e6e4e6">목</td>
                    <td align="center" bgcolor="#e6e4e6">금</td>
                    <td align="center" bgcolor="#e6e4e6"><font color="blue">토</font></td>
                </tr>
                <%
                    int newLine = 0;
                    //1일이 어느 요일에서 시작하느냐에 따른 빈칸 삽입
                    out.println("<tr height='25'>");
                    for(int i=1; i<w; i++)
                    {
                        out.println("<td bgcolor='#ffffff'>&nbsp;</td>");
                        newLine++;
                    }
                   
                    String fc, bg;
                    for(int i=1; i<=end; i++)
                    {
                       
                        fc = (newLine == 0)?"red":(newLine==6?"blue":"#000000");
                        bg = "#ffffff";
                        out.println("<td align='center' bgcolor=" + bg + "><font color=" + fc + ">"
                                + i + "</font></td>");
                        newLine++;
                        if(newLine == 7 && i != end)
                        {
                            out.println("</tr>");
                            out.println("<tr height='25'>");
                            newLine = 0;
                        }
                    }
                   
                    while(newLine>0 && newLine<7)
                    {
                        out.println("<td bgcolor='ffffff'>&nbsp;</td>");
                        newLine++;   
                    }
                    out.println("</tr>");
                %>
                
            </table>
      </div>
      <div class="bg"></div>
    </div>
    <div class="card">
      <div class="box box3">
        
     
        <table id="mainSchedule" border="1" cellspacing="0">
        <h2> <%=month %>월 학사일정</h2>
      	<tr>
      		<th> &nbsp;일&nbsp;</th><th> 일정 </th>
      	</tr>
      	
      	</table>
      	
      </div>
      <div class="bg"></div>
    </div>
  </div>


  <div class="quotes">
    <div class="card">
      <div class="box box1" >
      <table id="mainScore" border="1" cellspacing="0">
        <h2>나의 학점 현황</h2>
        
      		<th>학기</th><th> 취득학점 </th>
      	
      	</table>
      </div>
      <div class="bg"></div>
    </div>
    <div class="card">
      <div class="box box2">
      	<h2>최신 공지글</h2>
      	<section>
      	<table id="mainNotice" border="1" cellspacing="0">
      	<tr>
      		<th>번호<th>제목</th><th>날짜</th>
      	</tr>
      	</table>
      	</section>
        <p></p>
        
      </div>
      <div class="bg"></div>
    </div>
    <div class="card">
      <div class="box box3">
       <h2>날씨</h2>
       	
      
       	<table id="mainWeather" border="1" cellspacing="0">
        <ul>
          
            <li class="강수량"></li>
            <li class="기온"></li>
            <li class="습도"></li>
            
        </ul>
        </table>
    </div>
 
      </div>
      <div class="bg"></div>
    </div>
  </div>
  <br>
  
  <br>
 
  </div>
  <br> --%>
<br>
<br>
<br>
<br>
<br>

</body>
  <footer>

</footer>

</html>