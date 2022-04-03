<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="student.model.vo.Member" isErrorPage="false" %>
<%@page import="java.util.Calendar, java.util.ArrayList, notice.model.vo.Notice"%>

<%@ page contentType="text/html; charset=UTF-8"%>

<% Member m = (Member)session.getAttribute("loginMember"); %>

<%   request.setCharacterEncoding("utf-8");
   Calendar now = Calendar.getInstance();
   int month = now.get(Calendar.MONTH)+1;
   ArrayList<Notice> list = (ArrayList<Notice>)request.getAttribute("list");

%>

<!DOCTYPE html>
<html lang="ko-KR" class="js flexbox canvas canvastext webgl no-touch geolocation postmessage websqldatabase indexeddb hashchange history draganddrop websockets rgba hsla multiplebgs backgroundsize borderimage borderradius boxshadow textshadow opacity cssanimations csscolumns cssgradients cssreflections csstransforms csstransforms3d csstransitions fontface generatedcontent video audio localstorage sessionstorage webworkers applicationcache svg inlinesvg smil svgclippaths js_active  vc_desktop  vc_transform  vc_transform  js csstransitions skrollr skrollr-desktop" style="height: auto; overflow: auto;"><head>
 <meta charset="UTF-8">
 <meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet" href="/beet/resourse/css/main.css" />
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
/* Remove the navbar's default margin-bottom and rounded borders */
.navbar {
	margin-bottom: 0;
	border-radius: 0;
}

</style>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 
 
 
	<!-- ★★★★★★★★title -->
	<title> </title>

<!-- 세션 아래 인클루드코드 복사해서 쓰세요! -->


<div class="fit-vids-style" id="fit-vids-style" style="display: none;">&shy;<style>                 .fluid-width-video-wrapper {                   width: 100%;                                position: relative;                         padding: 0;                      					 min-height: 1px;                         }                                                                                       .fluid-width-video-wrapper iframe,          .fluid-width-video-wrapper object,          .fluid-width-video-wrapper embed {             position: absolute;                         top: 0;                                     left: 0;                                    width: 100%;                                height: 100%;                            }                                         </style></div><script type="text/javascript" async="" src="https://www.google-analytics.com/analytics.js"></script><script src="https://www.cha.ac.kr/wp-includes/js/wp-emoji-release.min.js?ver=4.7.18" type="text/javascript" defer=""></script></head><body data-rsssl="1" class="page-template-default page page-id-980 page-child parent-pageid-1429  qode_grid_1300 side_menu_slide_with_content width_370 footer_responsive_adv qode-child-theme-ver-1.0.0 qode-theme-ver-11.1 qode-theme-bridge wpb-js-composer js-comp-ver-5.1.1 vc_responsive" itemscope="" itemtype="http://schema.org/WebPage" style="height: auto; overflow: auto;">

	
			
						<meta name="viewport" content="width=device-width,initial-scale=1,user-scalable=no">
		
	<link rel="profile" href="https://gmpg.org/xfn/11">
	<link rel="pingback" href="https://www.cha.ac.kr/xmlrpc.php">
	<link rel="shortcut icon" type="image/x-icon" href="https://www.cha.ac.kr/wp-content/uploads/2017/06/cha_favi.png">
	<link rel="apple-touch-icon" href="https://www.cha.ac.kr/wp-content/uploads/2017/06/cha_favi.png">
	<link href="//fonts.googleapis.com/css?family=Raleway:100,200,300,400,500,600,700,800,900,300italic,400italic" rel="stylesheet" type="text/css">
<script type="application/javascript">var QodeAjaxUrl = "https://www.cha.ac.kr/wp-admin/admin-ajax.php"</script><link rel="alternate" hreflang="ko-kr" href="https://www.cha.ac.kr/%ed%96%89%ec%a0%95/%ec%a6%9d%eb%aa%85%ec%84%9c%eb%b0%9c%ea%b8%89/">

<!-- WordPress KBoard plugin 5.3.3 - http://www.cosmosfarm.com/products/kboard -->
<link rel="alternate" href="https://www.cha.ac.kr/wp-content/plugins/kboard/rss.php" type="application/rss+xml" title="CHA University » KBoard 통합 피드">
<!-- WordPress KBoard plugin 5.3.3 - http://www.cosmosfarm.com/products/kboard -->

<link rel="dns-prefetch" href="//fonts.googleapis.com">
<link rel="dns-prefetch" href="//s.w.org">
<link rel="alternate" type="application/rss+xml" title="CHA University » 피드" href="https://www.cha.ac.kr/feed/">
<link rel="alternate" type="application/rss+xml" title="CHA University » 댓글 피드" href="https://www.cha.ac.kr/comments/feed/">
		<script type="text/javascript">
			window._wpemojiSettings = {"baseUrl":"https:\/\/s.w.org\/images\/core\/emoji\/2.2.1\/72x72\/","ext":".png","svgUrl":"https:\/\/s.w.org\/images\/core\/emoji\/2.2.1\/svg\/","svgExt":".svg","source":{"concatemoji":"https:\/\/www.cha.ac.kr\/wp-includes\/js\/wp-emoji-release.min.js?ver=4.7.18"}};
			!function(a,b,c){function d(a){var b,c,d,e,f=String.fromCharCode;if(!k||!k.fillText)return!1;switch(k.clearRect(0,0,j.width,j.height),k.textBaseline="top",k.font="600 32px Arial",a){case"flag":return k.fillText(f(55356,56826,55356,56819),0,0),!(j.toDataURL().length<3e3)&&(k.clearRect(0,0,j.width,j.height),k.fillText(f(55356,57331,65039,8205,55356,57096),0,0),b=j.toDataURL(),k.clearRect(0,0,j.width,j.height),k.fillText(f(55356,57331,55356,57096),0,0),c=j.toDataURL(),b!==c);case"emoji4":return k.fillText(f(55357,56425,55356,57341,8205,55357,56507),0,0),d=j.toDataURL(),k.clearRect(0,0,j.width,j.height),k.fillText(f(55357,56425,55356,57341,55357,56507),0,0),e=j.toDataURL(),d!==e}return!1}function e(a){var c=b.createElement("script");c.src=a,c.defer=c.type="text/javascript",b.getElementsByTagName("head")[0].appendChild(c)}var f,g,h,i,j=b.createElement("canvas"),k=j.getContext&&j.getContext("2d");for(i=Array("flag","emoji4"),c.supports={everything:!0,everythingExceptFlag:!0},h=0;h<i.length;h++)c.supports[i[h]]=d(i[h]),c.supports.everything=c.supports.everything&&c.supports[i[h]],"flag"!==i[h]&&(c.supports.everythingExceptFlag=c.supports.everythingExceptFlag&&c.supports[i[h]]);c.supports.everythingExceptFlag=c.supports.everythingExceptFlag&&!c.supports.flag,c.DOMReady=!1,c.readyCallback=function(){c.DOMReady=!0},c.supports.everything||(g=function(){c.readyCallback()},b.addEventListener?(b.addEventListener("DOMContentLoaded",g,!1),a.addEventListener("load",g,!1)):(a.attachEvent("onload",g),b.attachEvent("onreadystatechange",function(){"complete"===b.readyState&&c.readyCallback()})),f=c.source||{},f.concatemoji?e(f.concatemoji):f.wpemoji&&f.twemoji&&(e(f.twemoji),e(f.wpemoji)))}(window,document,window._wpemojiSettings);
		</script>
		<style type="text/css">
img.wp-smiley,
img.emoji {
	display: inline !important;
	border: none !important;
	box-shadow: none !important;
	height: 1em !important;
	width: 1em !important;
	margin: 0 .07em !important;
	vertical-align: -0.1em !important;
	background: none !important;
	padding: 0 !important;
}
</style>
<link rel="stylesheet" id="layerslider-css" href="https://www.cha.ac.kr/wp-content/plugins/LayerSlider/static/layerslider/css/layerslider.css?ver=6.5.1" type="text/css" media="all">
<link rel="stylesheet" id="ls-google-fonts-css" href="https://fonts.googleapis.com/css?family=Roboto+Condensed:300,regular,700%7CNunito:300,regular,200,600&amp;subset=latin%2Clatin-ext" type="text/css" media="all">
<link rel="stylesheet" id="bbse-popup-view-css" href="https://www.cha.ac.kr/wp-content/plugins/bbs-e-popup/css/bbse-popup-style.css?ver=4.7.18" type="text/css" media="all">
<link rel="stylesheet" id="default_style-css" href="https://www.cha.ac.kr/wp-content/themes/bridge/style.css?ver=4.7.18" type="text/css" media="all">
<link rel="stylesheet" id="qode_font_awesome-css" href="https://www.cha.ac.kr/wp-content/themes/bridge/css/font-awesome/css/font-awesome.min.css?ver=4.7.18" type="text/css" media="all">
<link rel="stylesheet" id="qode_font_elegant-css" href="https://www.cha.ac.kr/wp-content/themes/bridge/css/elegant-icons/style.min.css?ver=4.7.18" type="text/css" media="all">
<link rel="stylesheet" id="qode_linea_icons-css" href="https://www.cha.ac.kr/wp-content/themes/bridge/css/linea-icons/style.css?ver=4.7.18" type="text/css" media="all">
<link rel="stylesheet" id="stylesheet-css" href="https://www.cha.ac.kr/wp-content/themes/bridge/css/stylesheet.min.css?ver=4.7.18" type="text/css" media="all">
<link rel="stylesheet" id="qode_print-css" href="https://www.cha.ac.kr/wp-content/themes/bridge/css/print.css?ver=4.7.18" type="text/css" media="all">
<link rel="stylesheet" id="webkit-css" href="https://www.cha.ac.kr/wp-content/themes/bridge/css/webkit_stylesheet.css?ver=4.7.18" type="text/css" media="all">
<link rel="stylesheet" id="style_dynamic-css" href="https://www.cha.ac.kr/wp-content/themes/bridge/css/style_dynamic.css?ver=1579137436" type="text/css" media="all">
<link rel="stylesheet" id="responsive-css" href="https://www.cha.ac.kr/wp-content/themes/bridge/css/responsive.min.css?ver=4.7.18" type="text/css" media="all">
<link rel="stylesheet" id="style_dynamic_responsive-css" href="https://www.cha.ac.kr/wp-content/themes/bridge/css/style_dynamic_responsive.css?ver=1579137436" type="text/css" media="all">
<link rel="stylesheet" id="js_composer_front-css" href="https://www.cha.ac.kr/wp-content/plugins/js_composer/assets/css/js_composer.min.css?ver=5.1.1" type="text/css" media="all">
<link rel="stylesheet" id="custom_css-css" href="https://www.cha.ac.kr/wp-content/themes/bridge/css/custom_css.css?ver=1579137436" type="text/css" media="all">
<link rel="stylesheet" id="childstyle-css" href="https://www.cha.ac.kr/wp-content/themes/bridge-child/style.css?ver=4.7.18" type="text/css" media="all">
<link rel="stylesheet" id="main-style-css" href="https://www.cha.ac.kr/wp-content/themes/bridge-child/assets/main.css?ver=4.7.18" type="text/css" media="all">
<link rel="stylesheet" id="common-style-css" href="https://www.cha.ac.kr/wp-content/themes/bridge-child/assets/css/common.css?ver=4.7.18" type="text/css" media="all">
<link rel="stylesheet" id="animated-style-css" href="https://www.cha.ac.kr/wp-content/themes/bridge-child/assets/css/animated.css?ver=4.7.18" type="text/css" media="all">
<link rel="stylesheet" id="bsf-Defaults-css" href="https://www.cha.ac.kr/wp-content/uploads/smile_fonts/Defaults/Defaults.css?ver=4.7.18" type="text/css" media="all">
<link rel="stylesheet" id="kboard-comments-skin-default-css" href="https://www.cha.ac.kr/wp-content/plugins/kboard-comments/skin/default/style.css?ver=4.4.2" type="text/css" media="all">
<link rel="stylesheet" id="kboard-editor-media-css" href="https://www.cha.ac.kr/wp-content/plugins/kboard/template/css/editor_media.css?ver=5.3.3" type="text/css" media="all">
<link rel="stylesheet" id="kboard-skin-default-css" href="https://www.cha.ac.kr/wp-content/plugins/kboard/skin/default/style.css?ver=5.3.3" type="text/css" media="all">
<link rel="stylesheet" id="kboard-skin-avatar-css" href="https://www.cha.ac.kr/wp-content/plugins/kboard/skin/avatar/style.css?ver=5.3.3" type="text/css" media="all">
<script type="text/javascript" src="https://www.cha.ac.kr/wp-includes/js/jquery/jquery.js?ver=1.12.4"></script>
<script type="text/javascript" src="https://www.cha.ac.kr/wp-includes/js/jquery/jquery-migrate.min.js?ver=1.4.1"></script>
<script type="text/javascript" src="https://www.cha.ac.kr/wp-content/plugins/jquery-vertical-accordion-menu/js/jquery.hoverIntent.minified.js?ver=4.7.18"></script>
<script type="text/javascript" src="https://www.cha.ac.kr/wp-content/plugins/jquery-vertical-accordion-menu/js/jquery.cookie.js?ver=4.7.18"></script>
<script type="text/javascript" src="https://www.cha.ac.kr/wp-content/plugins/jquery-vertical-accordion-menu/js/jquery.dcjqaccordion.2.9.js?ver=4.7.18"></script>
<script type="text/javascript">
/* <![CDATA[ */
var LS_Meta = {"v":"6.5.1"};
/* ]]> */
</script>
<script type="text/javascript" data-cfasync="false" src="https://www.cha.ac.kr/wp-content/plugins/LayerSlider/static/layerslider/js/greensock.js?ver=1.19.0"></script>
<script type="text/javascript" data-cfasync="false" src="https://www.cha.ac.kr/wp-content/plugins/LayerSlider/static/layerslider/js/layerslider.kreaturamedia.jquery.js?ver=6.5.1"></script>
<script type="text/javascript" data-cfasync="false" src="https://www.cha.ac.kr/wp-content/plugins/LayerSlider/static/layerslider/js/layerslider.transitions.js?ver=6.5.1"></script>
<script type="text/javascript" src="https://www.cha.ac.kr/wp-content/plugins/bbs-e-popup/js/bbse-popup-common.js?ver=4.7.18"></script>
<meta name="generator" content="Powered by LayerSlider 6.5.1 - Multi-Purpose, Responsive, Parallax, Mobile-Friendly Slider Plugin for WordPress.">
<!-- LayerSlider updates and docs at: https://layerslider.kreaturamedia.com -->
<link rel="https://api.w.org/" href="https://www.cha.ac.kr/wp-json/">
<link rel="EditURI" type="application/rsd+xml" title="RSD" href="https://www.cha.ac.kr/xmlrpc.php?rsd">
<link rel="wlwmanifest" type="application/wlwmanifest+xml" href="https://www.cha.ac.kr/wp-includes/wlwmanifest.xml"> 
<meta name="generator" content="WordPress 4.7.18">
<link rel="canonical" href="https://www.cha.ac.kr/%ed%96%89%ec%a0%95/%ec%a6%9d%eb%aa%85%ec%84%9c%eb%b0%9c%ea%b8%89/">
<link rel="shortlink" href="https://www.cha.ac.kr/?p=980">
<link rel="alternate" type="application/json+oembed" href="https://www.cha.ac.kr/wp-json/oembed/1.0/embed?url=https%3A%2F%2Fwww.cha.ac.kr%2F%25ed%2596%2589%25ec%25a0%2595%2F%25ec%25a6%259d%25eb%25aa%2585%25ec%2584%259c%25eb%25b0%259c%25ea%25b8%2589%2F">
<link rel="alternate" type="text/xml+oembed" href="https://www.cha.ac.kr/wp-json/oembed/1.0/embed?url=https%3A%2F%2Fwww.cha.ac.kr%2F%25ed%2596%2589%25ec%25a0%2595%2F%25ec%25a6%259d%25eb%25aa%2585%25ec%2584%259c%25eb%25b0%259c%25ea%25b8%2589%2F&amp;format=xml">
<meta name="generator" content="WPML ver:3.8.3 stt:1,29;">
		<style type="text/css">.recentcomments a{display:inline !important;padding:0 !important;margin:0 !important;}</style>
		<meta name="generator" content="Powered by Visual Composer - drag and drop page builder for WordPress.">
<!--[if lte IE 9]><link rel="stylesheet" type="text/css" href="https://www.cha.ac.kr/wp-content/plugins/js_composer/assets/css/vc_lte_ie9.min.css" media="screen"><![endif]-->		<style type="text/css" id="wp-custom-css">
			/*
여기에 자신의 CSS를 추가할 수 있습니다.

도움 아이콘을 클릭하면 더 알아볼 수 있습니다.
*/



.major_info_text botton{
border: 2px solid #13436B;
background: #13436B;
color: #fff;
font-size: 16px;
padding: 5px 15px;
font-weight: 600;
cursor: pointer;
}		</style>

	<script type="text/javascript" src="https://www.cha.ac.kr/wp-includes/js/wp-embed.min.js?ver=4.7.18"></script>
<noscript><style type="text/css"> .wpb_animate_when_almost_visible { opacity: 1; }</style></noscript>
	<link href="https://fonts.googleapis.com/earlyaccess/notosanskr" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/earlyaccess/nanumgothic" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Roboto" rel="stylesheet" type="text/css">
	<link href="https://fonts.googleapis.com/css?family=Kaushan+Script" rel="stylesheet">
	<link rel="stylesheet" href="//cdn.jsdelivr.net/npm/xeicon@2.3.3/xeicon.min.css">




<style>


/* 
.box{
    width: 1000px;
    min-height: 300px;  
    margin: 10px auto;
    display: flex;


}


.box h2{
   align: center;
   font-size: 18px;
   font-family: cursive;
   color: slategray;
/*     line-height: 25px;
    margin: 0; */
    
}
.a{
 
    border: 2px solid #dfe4ea;
    flex:1;
    width: 30%;
    box-sizing: border-box;
    font-size: 0.5rem;
    background-image: url("/beet/resources/images/a.jpg");
    min-height: 100%;
    background-position: center;
    background-size: cover
   
    
} 

aa{
 	
    color: white;
    font-size: 14pt;
}

/* 

.b{
    border: 2px solid #dfe4ea;
    flex:1;
    margin: 0px;
    width:30%;
    box-sizing: border-box;
     background-image: url("/beet/resources/images/a2.jpg");
    min-height: 100%;
    background-position: center;
    background-size: cover
   
}

.c{
    border: 2px solid #dfe4ea;
    flex:1;
     width:30%;
    box-sizing: border-box;
    background-image: url("/beet/resources/images/a.jpg");
    min-height: 100%;
    background-position: center;
    background-size: cover
   
} */
#mainNotice td{
	text-align: left;"
}


.d ul{
   

   font-family:돋움;
   font-size:17px;
   padding:50px;

}
/* 
.d{
    border: 2px solid #dfe4ea;
    flex:1;
     width:30%;
    box-sizing: border-box;
     background-image: url("/beet/resources/images/a2.jpg");
    min-height: 100%;
    background-position: center;
    background-size: cover
    text-align: left;"
   
} */


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

a:link {text-decoration: none; color: black;}
a:visited {text-decoration: none; color: black;}
a:active {text-decoration: none; color: black;}
a:hover {text-decoration: none; color: red;}



</style>


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
            + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td><td><a href='/beet/schlist" +"'>" 
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
            values += "<tr><td><a href='/beet/ndetail?noticeno=" + json.list[i].no + "'>" 
            + decodeURIComponent(json.list[i].title).replace(/\+/gi, " ")
            + "</a></td><td>"+ json.list[i].date + "</td></tr><br>";
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
            + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td><td>" + json.list[i].TERMGETPOINT + "</td></tr><br>";
            
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
          
         $('.강수량').html("강수량 : "+ msg.response.body.items.item[2].obsrValue +"mm"); 
          
          $('.기온').html("기온 : "+ T1H + " ℃");
        
      
      },
      error: function(jqXHR, textstatus, errorthrown){
         console.log("error : "+ jqXHR + ","+textstatus + "," + errorthrown);
      }
      
     });    

});
   
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



	<script type="text/javascript" src="https://www.cha.ac.kr/wp-includes/js/wp-embed.min.js?ver=4.7.18"></script>
<noscript><style type="text/css"> .wpb_animate_when_almost_visible { opacity: 1; }</style></noscript>
	<link href="https://fonts.googleapis.com/earlyaccess/notosanskr" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/earlyaccess/nanumgothic" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Roboto" rel="stylesheet" type="text/css">
	<link href="https://fonts.googleapis.com/css?family=Kaushan+Script" rel="stylesheet">
	<link rel="stylesheet" href="//cdn.jsdelivr.net/npm/xeicon@2.3.3/xeicon.min.css">
	
			<div class="wrapper">
	<div class="wrapper_inner">
<%@ include file = "/views/common/header.jsp" %>
<a id="back_to_top" href="#" class="off">
			
		</a>

<div class="content " style="min-height: 755px; padding-top: 0px; margin-top:45px;">
<!-- 메인페이지작성 -->
						<div class="content_inner  ">
									<div class="title_outer title_without_animation" data-animation="yes" data-height="350">
		<div class="title title_size_medium  position_left  has_fixed_background beetimg" style="background-size: 1920px;height: 600px; background-color: rgb(153, 153, 153); background-position: center 2.205px;">
			<div class="image not_responsive"><img itemprop="image" src="https://new.cha.ac.kr/wp-content/uploads/2017/09/title_default-1.jpg" alt="&nbsp;"> </div>
										<div class="title_holder skrollable skrollable-between" data-0="opacity:1" data-300="opacity:0" style="padding-top: 133px; height: 217px; opacity: 1;">
					<div class="container">
						<div class="container_inner clearfix">
								<div class="title_subtitle_holder">
                                                                									<div class="title_subtitle_holder_inner">
																										<h1><span>학사관리 포털</span></h1>
																										</div>

              <%if(m.getId().substring(0, 1).equals("P")){ %>
                <aa> 코드 : <%= m.getId() %><br>
                    <%=m.getCategoryname() %>&nbsp;&nbsp;
                      <strong><%= m.getName() %>교수님 </strong><br>
                        내학사에 오신것을 환영합니다.</aa>
                      
            <% }else if(m.getId().substring(0, 1).equals("A")){ %>
                <aa>관리자 코드 : <%= m.getId() %><br>
                     <strong> <%= m.getName() %>관리자님 </strong><br>
                      내학사에 오신것을 환영합니다.</aa>
                      
            <% }else{ %>
                <aa>내 학번 : <%= m.getId() %><br>
                 <%=m.getCategoryname() %>&nbsp;&nbsp;
                      <strong><%= m.getName() %>님</strong> <br>
                      내학사에 오신것을 환영합니다.</aa>
            <%} %>
            <br>
          <div class="title_subtitle_holder_inner" id="mainScore" style="color: white;">
  			 <%if((!(m.getId().substring(0, 1).equals("P")) && !(m.getId().substring(0, 1).equals("A")))){ %>
         	<br>
         	<br><br>
              <h1><span>나의 학점 현황</span></h1>
        		<br>
               <th style="color: #4682B4; text-align: left;"><strong>학기</strong>
               &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>
               <th style="color: #4682B4"><strong> 취득학점 </strong></th>
         		<br>
        	 
        	 <%}else{ %>
        
       		 <%} %>
        </div>
					
																									
								                                                            </div>
								                                                            
			                                                            
								                                                            
								                                                            
						</div>
					</div>
				</div>
								</div>
			</div>





<!-- <<<<<<< HEAD:web/views/main/mainSample.jsp -->
<br>
 
		
		
		
		<div class="row main-row" style=" height: 330px; margin:0 auto;" >
			<div class="col-sm-3">
				<div class="panel panel-primary"
					style="border-color: #edeef1;" >
					<div class="panel-footer">캘린더</div>
					<div class="panel-body">
					
					   <script type="text/javascript">
            calendar();
         </script>
					</div>
				</div>
			</div>
			<div class="col-sm-3">
				<div class="panel panel-primary"
					style="border-color: #edeef1; height: 330px">
					<div class="panel-footer">날씨</div>
					<div class="panel-body">
					     <table style="width:20; margin:auto; padding-top:10px;" id="mainWeather" cellspacing="0">
        <ul>
         	
            <li class="강수량"></li>
   
            <li class="기온"></li>
        
            <li class="습도"></li>
         
        </ul>
        </table>
					</div>
				</div>
			</div>
		
			
			<div class="col-sm-3">
				<div class="panel panel-primary"
					style="border-color: #edeef1; height: 330px">
					<div class="panel-footer">공지사항</div>
					<div class="panel-body">
					 <table style="width:20; margin:auto; padding-top:10px;" id="mainNotice"  cellspacing="0">
         <tr>
            <th style="color: #4682B4; text-align: left;">제목</th><th style="color: #4682B4">작성 날짜</th>
            
         </tr>
         </table>
					</div>
				</div>
			</div>
			<div class="col-sm-3">
				<div class="panel panel-primary"
					style="border-color: #edeef1; height: 330px">
					<div class="panel-footer"><%=month %>월 학사일정</div>
					<div class="panel-body">
					  <table style="width:20; margin:auto; padding-top:10px;" id="mainSchedule" cellspacing="0">
  
         <tr>
            <th style="color: #4682B4">일 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp</th><th style="color: #4682B4"> 일정 </th>
         </tr>
         
         </table>
					</div>
				</div>
			</div>
		</div> 
		
		
		
	<!-- </div> -->
	<br>




<%-- <div id="outer">

<br>
<br>
 <div class="box">

        
        <div class="a" style="padding-top: 30px; padding-left: 0px;" >
           <h2 align="center"; >캘린더</h2>
           <script type="text/javascript">
            calendar();
         </script>
        </div>
        
        <div class="b" style="padding-top: 30px; padding-left: 0px;">
         <table style="width:20; margin:auto; padding-top:10px;" id="mainSchedule" cellspacing="0">
        <h2 align="center";> <%=month %>월 학사일정</h2>
         <tr>
            <th style="color: #4682B4">일 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp</th><th style="color: #4682B4"> 일정 </th>
         </tr>
         
         </table>
        </div>
 </div>
 <br>
 <br>
 
  <div class="box">
        <div class="c" style="padding-top: 30px; padding-left: 0px;" >
          <h2 align="center";>최신 공지글</h2>
         <table style="width:20; margin:auto; padding-top:10px;" id="mainNotice"  cellspacing="0">
         <tr>
            <th style="color: #4682B4; text-align: left;">제목</th><th style="color: #4682B4">작성 날짜</th>
            
         </tr>
         </table>
  
        </div>
    
        
        
        <div class="d" style="padding-top: 30px; padding-left: 0px;">
               <h2 align="center";>날씨</h2>
          
      
          <table style="width:20; margin:auto; padding-top:10px;" id="mainWeather" cellspacing="0">
        <ul>
         	
            <li class="강수량"></li>
   
            <li class="기온"></li>
        
            <li class="습도"></li>
         
        </ul>
        </table>
        </div>
 </div>



 </div>
 --%>






</div>



	<footer>
		<div class="footer_inner clearfix " style="margin-top:45px;">
				<div class="footer_top_holder">
            			
					</div>
							<div class="footer_bottom_holder">
                								<div class="container">
					<div class="container_inner">
									<div class="footer_bottom">
				<div id="text-27">			<div class="textwidget">
				<div>NAEHAKSA ©202008 KH Information Educational Semi Project 6DDUKE </div></div>
		</div>			</div>
									</div>
			</div>
						</div>
				</div>
	</footer>
		
</div>
</div>
<div id="text-13" class="widget-container widget_text">			<div class="textwidget"></div>
		</div><style type="text/css">
    p {
        margin: 0 0 1em;
    }

</style>
			<script type="text/javascript">
				jQuery(document).ready(function($) {
					jQuery('#dc_jqaccordion_widget-4-item .menu').dcAccordion({
						eventType: 'click',
						hoverDelay: 0,
						menuClose: false,
						autoClose: true,
						saveState: false,
						autoExpand: true,
						classExpand: 'current-menu-item',
						classDisable: '',
						showCount: false,
						disableLink: true,
						cookie: 'dc_jqaccordion_widget-4',
						speed: 'normal'
					});
				});
			</script>
		
						<script type="text/javascript">
				jQuery(document).ready(function($) {
					jQuery('#dc_jqaccordion_widget-5-item .menu').dcAccordion({
						eventType: 'click',
						hoverDelay: 0,
						menuClose: false,
						autoClose: true,
						saveState: false,
						autoExpand: true,
						classExpand: 'current-menu-item',
						classDisable: '',
						showCount: false,
						disableLink: false,
						cookie: 'dc_jqaccordion_widget-5',
						speed: 'slow'
					});
				});
			</script>
		
						<script type="text/javascript">
				jQuery(document).ready(function($) {
					jQuery('#dc_jqaccordion_widget-6-item .menu').dcAccordion({
						eventType: 'click',
						hoverDelay: 0,
						menuClose: false,
						autoClose: true,
						saveState: false,
						autoExpand: true,
						classExpand: 'current-menu-item',
						classDisable: '',
						showCount: false,
						disableLink: true,
						cookie: 'dc_jqaccordion_widget-6',
						speed: 'normal'
					});
				});
			</script>
		
						<script type="text/javascript">
				jQuery(document).ready(function($) {
					jQuery('#dc_jqaccordion_widget-7-item .menu').dcAccordion({
						eventType: 'click',
						hoverDelay: 0,
						menuClose: false,
						autoClose: true,
						saveState: false,
						autoExpand: true,
						classExpand: 'current-menu-item',
						classDisable: '',
						showCount: false,
						disableLink: true,
						cookie: 'dc_jqaccordion_widget-7',
						speed: 'normal'
					});
				});
			</script>
		
						<script type="text/javascript">
				jQuery(document).ready(function($) {
					jQuery('#dc_jqaccordion_widget-8-item .menu').dcAccordion({
						eventType: 'click',
						hoverDelay: 0,
						menuClose: false,
						autoClose: true,
						saveState: false,
						autoExpand: true,
						classExpand: 'current-menu-item',
						classDisable: '',
						showCount: false,
						disableLink: true,
						cookie: 'dc_jqaccordion_widget-8',
						speed: 'normal'
					});
				});
			</script>
		
						<script type="text/javascript">
				jQuery(document).ready(function($) {
					jQuery('#dc_jqaccordion_widget-9-item .menu').dcAccordion({
						eventType: 'click',
						hoverDelay: 0,
						menuClose: true,
						autoClose: true,
						saveState: false,
						autoExpand: false,
						classExpand: 'current-menu-item',
						classDisable: '',
						showCount: false,
						disableLink: true,
						cookie: 'dc_jqaccordion_widget-9',
						speed: 'normal'
					});
				});
			</script>
		
						<script type="text/javascript">
				jQuery(document).ready(function($) {
					jQuery('#dc_jqaccordion_widget-10-item .menu').dcAccordion({
						eventType: 'click',
						hoverDelay: 0,
						menuClose: true,
						autoClose: true,
						saveState: false,
						autoExpand: false,
						classExpand: 'current-menu-item',
						classDisable: '',
						showCount: false,
						disableLink: true,
						cookie: 'dc_jqaccordion_widget-10',
						speed: 'slow'
					});
				});
			</script>
		
			<script type="text/javascript" src="https://www.cha.ac.kr/wp-includes/js/jquery/jquery.form.min.js?ver=3.37.0"></script>
<script type="text/javascript">
/* <![CDATA[ */
var qodeLike = {"ajaxurl":"https:\/\/www.cha.ac.kr\/wp-admin\/admin-ajax.php"};
/* ]]> */
</script>
<script type="text/javascript" src="https://www.cha.ac.kr/wp-content/themes/bridge/js/qode-like.min.js?ver=4.7.18"></script>
<script type="text/javascript" src="https://www.cha.ac.kr/wp-includes/js/jquery/ui/core.min.js?ver=1.11.4"></script>
<script type="text/javascript" src="https://www.cha.ac.kr/wp-includes/js/jquery/ui/widget.min.js?ver=1.11.4"></script>
<script type="text/javascript" src="https://www.cha.ac.kr/wp-includes/js/jquery/ui/accordion.min.js?ver=1.11.4"></script>
<script type="text/javascript" src="https://www.cha.ac.kr/wp-includes/js/jquery/ui/position.min.js?ver=1.11.4"></script>
<script type="text/javascript" src="https://www.cha.ac.kr/wp-includes/js/jquery/ui/menu.min.js?ver=1.11.4"></script>
<script type="text/javascript" src="https://www.cha.ac.kr/wp-includes/js/wp-a11y.min.js?ver=4.7.18"></script>
<script type="text/javascript">
/* <![CDATA[ */
var uiAutocompleteL10n = {"noResults":"\uacb0\uacfc \uc5c6\uc74c.","oneResult":"1\uacb0\uacfc \ucc3e\uc74c. \uc704\uc544\ub798\ub85c \uc774\ub3d9\ud558\ub824\uba74 \ud654\uc0b4\ud45c \ud0a4\ub97c \uc0ac\uc6a9\ud558\uc138\uc694.","manyResults":"%d \uacb0\uacfc \ucc3e\uc74c. \uc704 \uc544\ub798\ub85c \uc774\ub3d9\ud558\ub824\uba74 \ud654\uc0b4\ud45c \ud0a4\ub97c \uc0ac\uc6a9\ud558\uc138\uc694.","itemSelected":"\uc544\uc774\ud15c \uc120\ud0dd\ub428."};
/* ]]> */
</script>
<script type="text/javascript" src="https://www.cha.ac.kr/wp-includes/js/jquery/ui/autocomplete.min.js?ver=1.11.4"></script>
<script type="text/javascript" src="https://www.cha.ac.kr/wp-includes/js/jquery/ui/button.min.js?ver=1.11.4"></script>
<script type="text/javascript" src="https://www.cha.ac.kr/wp-includes/js/jquery/ui/datepicker.min.js?ver=1.11.4"></script>
<script type="text/javascript">
jQuery(document).ready(function(jQuery){jQuery.datepicker.setDefaults({"closeText":"\ub2eb\uae30","currentText":"\uc624\ub298","monthNames":["1\uc6d4","2\uc6d4","3\uc6d4","4\uc6d4","5\uc6d4","6\uc6d4","7\uc6d4","8\uc6d4","9\uc6d4","10\uc6d4","11\uc6d4","12\uc6d4"],"monthNamesShort":["1\uc6d4","2\uc6d4","3\uc6d4","4\uc6d4","5\uc6d4","6\uc6d4","7\uc6d4","8\uc6d4","9\uc6d4","10\uc6d4","11\uc6d4","12\uc6d4"],"nextText":"\ub2e4\uc74c","prevText":"\uc774\uc804","dayNames":["\uc77c\uc694\uc77c","\uc6d4\uc694\uc77c","\ud654\uc694\uc77c","\uc218\uc694\uc77c","\ubaa9\uc694\uc77c","\uae08\uc694\uc77c","\ud1a0\uc694\uc77c"],"dayNamesShort":["\uc77c","\uc6d4","\ud654","\uc218","\ubaa9","\uae08","\ud1a0"],"dayNamesMin":["\uc77c","\uc6d4","\ud654","\uc218","\ubaa9","\uae08","\ud1a0"],"dateFormat":"yy\ub144 MM d\uc77c","firstDay":0,"isRTL":false});});
</script>
<script type="text/javascript" src="https://www.cha.ac.kr/wp-includes/js/jquery/ui/mouse.min.js?ver=1.11.4"></script>
<script type="text/javascript" src="https://www.cha.ac.kr/wp-includes/js/jquery/ui/resizable.min.js?ver=1.11.4"></script>
<script type="text/javascript" src="https://www.cha.ac.kr/wp-includes/js/jquery/ui/draggable.min.js?ver=1.11.4"></script>
<script type="text/javascript" src="https://www.cha.ac.kr/wp-includes/js/jquery/ui/dialog.min.js?ver=1.11.4"></script>
<script type="text/javascript" src="https://www.cha.ac.kr/wp-includes/js/jquery/ui/droppable.min.js?ver=1.11.4"></script>
<script type="text/javascript" src="https://www.cha.ac.kr/wp-includes/js/jquery/ui/progressbar.min.js?ver=1.11.4"></script>
<script type="text/javascript" src="https://www.cha.ac.kr/wp-includes/js/jquery/ui/selectable.min.js?ver=1.11.4"></script>
<script type="text/javascript" src="https://www.cha.ac.kr/wp-includes/js/jquery/ui/sortable.min.js?ver=1.11.4"></script>
<script type="text/javascript" src="https://www.cha.ac.kr/wp-includes/js/jquery/ui/slider.min.js?ver=1.11.4"></script>
<script type="text/javascript" src="https://www.cha.ac.kr/wp-includes/js/jquery/ui/spinner.min.js?ver=1.11.4"></script>
<script type="text/javascript" src="https://www.cha.ac.kr/wp-includes/js/jquery/ui/tooltip.min.js?ver=1.11.4"></script>
<script type="text/javascript" src="https://www.cha.ac.kr/wp-includes/js/jquery/ui/tabs.min.js?ver=1.11.4"></script>
<script type="text/javascript" src="https://www.cha.ac.kr/wp-includes/js/jquery/ui/effect.min.js?ver=1.11.4"></script>
<script type="text/javascript" src="https://www.cha.ac.kr/wp-includes/js/jquery/ui/effect-blind.min.js?ver=1.11.4"></script>
<script type="text/javascript" src="https://www.cha.ac.kr/wp-includes/js/jquery/ui/effect-bounce.min.js?ver=1.11.4"></script>
<script type="text/javascript" src="https://www.cha.ac.kr/wp-includes/js/jquery/ui/effect-clip.min.js?ver=1.11.4"></script>
<script type="text/javascript" src="https://www.cha.ac.kr/wp-includes/js/jquery/ui/effect-drop.min.js?ver=1.11.4"></script>
<script type="text/javascript" src="https://www.cha.ac.kr/wp-includes/js/jquery/ui/effect-explode.min.js?ver=1.11.4"></script>
<script type="text/javascript" src="https://www.cha.ac.kr/wp-includes/js/jquery/ui/effect-fade.min.js?ver=1.11.4"></script>
<script type="text/javascript" src="https://www.cha.ac.kr/wp-includes/js/jquery/ui/effect-fold.min.js?ver=1.11.4"></script>
<script type="text/javascript" src="https://www.cha.ac.kr/wp-includes/js/jquery/ui/effect-highlight.min.js?ver=1.11.4"></script>
<script type="text/javascript" src="https://www.cha.ac.kr/wp-includes/js/jquery/ui/effect-pulsate.min.js?ver=1.11.4"></script>
<script type="text/javascript" src="https://www.cha.ac.kr/wp-includes/js/jquery/ui/effect-size.min.js?ver=1.11.4"></script>
<script type="text/javascript" src="https://www.cha.ac.kr/wp-includes/js/jquery/ui/effect-scale.min.js?ver=1.11.4"></script>
<script type="text/javascript" src="https://www.cha.ac.kr/wp-includes/js/jquery/ui/effect-shake.min.js?ver=1.11.4"></script>
<script type="text/javascript" src="https://www.cha.ac.kr/wp-includes/js/jquery/ui/effect-slide.min.js?ver=1.11.4"></script>
<script type="text/javascript" src="https://www.cha.ac.kr/wp-includes/js/jquery/ui/effect-transfer.min.js?ver=1.11.4"></script>
<script type="text/javascript" src="https://www.cha.ac.kr/wp-content/themes/bridge/js/plugins.js?ver=4.7.18"></script>
<script type="text/javascript" src="https://www.cha.ac.kr/wp-content/themes/bridge/js/jquery.carouFredSel-6.2.1.min.js?ver=4.7.18"></script>
<script type="text/javascript" src="https://www.cha.ac.kr/wp-content/themes/bridge/js/lemmon-slider.min.js?ver=4.7.18"></script>
<script type="text/javascript" src="https://www.cha.ac.kr/wp-content/themes/bridge/js/jquery.fullPage.min.js?ver=4.7.18"></script>
<script type="text/javascript" src="https://www.cha.ac.kr/wp-content/themes/bridge/js/jquery.mousewheel.min.js?ver=4.7.18"></script>
<script type="text/javascript" src="https://www.cha.ac.kr/wp-content/themes/bridge/js/jquery.touchSwipe.min.js?ver=4.7.18"></script>
<script type="text/javascript" src="https://www.cha.ac.kr/wp-content/plugins/js_composer/assets/lib/bower/isotope/dist/isotope.pkgd.min.js?ver=5.1.1"></script>
<script type="text/javascript" src="https://www.cha.ac.kr/wp-content/themes/bridge/js/jquery.stretch.js?ver=4.7.18"></script>
<script type="text/javascript" src="https://www.cha.ac.kr/wp-content/themes/bridge/js/default_dynamic.js?ver=1579137436"></script>
<script type="text/javascript">
/* <![CDATA[ */
var QodeAdminAjax = {"ajaxurl":"https:\/\/www.cha.ac.kr\/wp-admin\/admin-ajax.php"};
/* ]]> */
</script>
<script type="text/javascript" src="https://www.cha.ac.kr/wp-content/themes/bridge/js/default.min.js?ver=4.7.18"></script>
<script type="text/javascript" src="https://www.cha.ac.kr/wp-content/themes/bridge/js/custom_js.js?ver=1579137436"></script>
<script type="text/javascript" src="https://www.cha.ac.kr/wp-includes/js/comment-reply.min.js?ver=4.7.18"></script>
<script type="text/javascript" src="https://www.cha.ac.kr/wp-content/plugins/js_composer/assets/js/dist/js_composer_front.min.js?ver=5.1.1"></script>
<script type="text/javascript" src="https://www.cha.ac.kr/wp-content/themes/bridge-child/custom.js?ver=4.7.18"></script>
<script type="text/javascript" src="https://www.cha.ac.kr/wp-content/themes/bridge-child/assets/js/waypoint.js?ver=4.7.18"></script>
<script type="text/javascript" src="https://www.cha.ac.kr/wp-content/themes/bridge-child/assets/js/jquery.hoverdir.js?ver=4.7.18"></script>
<script type="text/javascript" src="https://www.cha.ac.kr/wp-content/themes/bridge-child/assets/js/modernizr.custom.97074.js?ver=4.7.18"></script>
<script type="text/javascript" src="https://www.cha.ac.kr/wp-content/themes/bridge-child/assets/js/tween.js"></script>
<script type="text/javascript" src="https://www.cha.ac.kr/wp-content/themes/bridge-child/assets/js/greensock-js/minified/TweenMax.min.js"></script>
<script type="text/javascript" src="https://www.cha.ac.kr/wp-content/themes/bridge-child/assets/js/greensock-js/minified/TimelineMax.min.js?ver=20161110"></script>
<script type="text/javascript" src="https://www.cha.ac.kr/wp-content/themes/bridge-child/assets/js/menu.min.js?ver=20161110"></script>
<script type="text/javascript" src="https://www.cha.ac.kr/wp-content/themes/bridge-child/assets/js/scrollmagic/minified/ScrollMagic.min.js?ver=20161110"></script>
<script type="text/javascript" src="https://www.cha.ac.kr/wp-content/themes/bridge-child/assets/js/scrollmagic/minified/plugins/debug.addIndicators.min.js?ver=20161110"></script>
<script type="text/javascript" src="https://www.cha.ac.kr/wp-content/themes/bridge-child/assets/js/scrollmagic/minified/plugins/animation.gsap.min.js?ver=20161110"></script>
<script type="text/javascript">
/* <![CDATA[ */
var kboard_settings = {"version":"5.3.3","home_url":"\/","site_url":"\/","post_url":"https:\/\/www.cha.ac.kr\/wp-admin\/admin-post.php","alax_url":"https:\/\/www.cha.ac.kr\/wp-admin\/admin-ajax.php","plugin_url":"https:\/\/www.cha.ac.kr\/wp-content\/plugins\/kboard","media_group":"5f349dea5008a","ajax_security":"b5fe8b3aaf"};
var kboard_localize_strings = {"kboard_add_media":"KBoard \ubbf8\ub514\uc5b4 \ucd94\uac00","next":"\ub2e4\uc74c","prev":"\uc774\uc804","please_enter_the_title":"\uc81c\ubaa9\uc744 \uc785\ub825\ud574\uc8fc\uc138\uc694.","please_enter_the_author":"\uc791\uc131\uc790\ub97c \uc785\ub825\ud574\uc8fc\uc138\uc694.","please_enter_the_password":"\ube44\ubc00\ubc88\ud638\ub97c \uc785\ub825\ud574\uc8fc\uc138\uc694.","please_enter_the_CAPTCHA":"\uc606\uc5d0 \ubcf4\uc774\ub294 \ubcf4\uc548\ucf54\ub4dc\ub97c \uc785\ub825\ud574\uc8fc\uc138\uc694.","please_enter_the_name":"\uc774\ub984\uc744 \uc785\ub825\ud574\uc8fc\uc138\uc694.","please_enter_the_email":"\uc774\uba54\uc77c\uc744 \uc785\ub825\ud574\uc8fc\uc138\uc694.","you_have_already_voted":"\uc774\ubbf8 \ud22c\ud45c\ud588\uc2b5\ub2c8\ub2e4.","please_wait":"\uc7a0\uc2dc\ub9cc \uae30\ub2e4\ub824\uc8fc\uc138\uc694.","newest":"\ucd5c\uc2e0\uc21c","best":"\ucd94\ucc9c\uc21c","updated":"\uc5c5\ub370\uc774\ud2b8\uc21c","viewed":"\uc870\ud68c\uc21c","yes":"\uc608","no":"\uc544\ub2c8\uc694","did_it_help":"\ub3c4\uc6c0\uc774 \ub418\uc5c8\ub098\uc694?","hashtag":"\ud574\uc2dc\ud0dc\uadf8","tag":"\ud0dc\uadf8","add_a_tag":"\ud0dc\uadf8 \ucd94\uac00","removing_tag":"\ud0dc\uadf8 \uc0ad\uc81c","changes_you_made_may_not_be_saved":"\ubcc0\uacbd\uc0ac\ud56d\uc774 \uc800\uc7a5\ub418\uc9c0 \uc54a\uc744 \uc218 \uc788\uc2b5\ub2c8\ub2e4.","email":"\uc774\uba54\uc77c","address":"\uc8fc\uc18c","postcode":"\uc6b0\ud3b8\ubc88\ud638","phone_number":"\ud734\ub300\ud3f0\ubc88\ud638","mobile_phone":"\ud734\ub300\ud3f0\ubc88\ud638","phone":"\ud734\ub300\ud3f0\ubc88\ud638","company_name":"\ud68c\uc0ac\uba85","vat_number":"\uc0ac\uc5c5\uc790\ub4f1\ub85d\ubc88\ud638","bank_account":"\uc740\ud589\uacc4\uc88c","name_of_deposit":"\uc785\uae08\uc790\uba85","find":"\ucc3e\uae30","rate":"\ub4f1\uae09","ratings":"\ub4f1\uae09","waiting":"\ub300\uae30","complete":"\uc644\ub8cc","question":"\uc9c8\ubb38","answer":"\ub2f5\ubcc0","notify_me_of_new_comments_via_email":"\uc774\uba54\uc77c\ub85c \uc0c8\ub85c\uc6b4 \ub313\uae00 \uc54c\ub9bc \ubc1b\uae30","ask_question":"\uc9c8\ubb38\ud558\uae30","categories":"\uce74\ud14c\uace0\ub9ac","pages":"\ud398\uc774\uc9c0","all_products":"\uc804\uccb4\uc0c1\ud488","your_orders":"\uc8fc\ubb38\uc870\ud68c","your_sales":"\ud310\ub9e4\uc870\ud68c","my_orders":"\uc8fc\ubb38\uc870\ud68c","my_sales":"\ud310\ub9e4\uc870\ud68c","new_product":"\uc0c1\ud488\ub4f1\ub85d","edit_product":"\uc0c1\ud488\uc218\uc815","delete_product":"\uc0c1\ud488\uc0ad\uc81c","seller":"\ud310\ub9e4\uc790","period":"\uae30\uac04","period_of_use":"\uc0ac\uc6a9\uae30\uac04","last_updated":"\uc5c5\ub370\uc774\ud2b8 \ub0a0\uc9dc","list_price":"\uc815\uc0c1\uac00\uaca9","price":"\ud310\ub9e4\uac00\uaca9","total_price":"\ucd1d \uac00\uaca9","amount":"\uacb0\uc81c\uae08\uc561","quantity":"\uc218\ub7c9","use_points":"\ud3ec\uc778\ud2b8 \uc0ac\uc6a9","my_points":"\ub0b4 \ud3ec\uc778\ud2b8","available_points":"\uc0ac\uc6a9 \uac00\ub2a5 \ud3ec\uc778\ud2b8","apply_points":"\uc801\uc6a9\ub41c \ud3ec\uc778\ud2b8","buy_it_now":"\uad6c\ub9e4\ud558\uae30","sold_out":"\ud488\uc808","for_free":"\ubb34\ub8cc","pay_s":"%s \uacb0\uc81c","payment_method":"\uacb0\uc81c\uc218\ub2e8","credit_card":"\uc2e0\uc6a9\uce74\ub4dc","make_a_deposit":"\ubb34\ud1b5\uc7a5\uc785\uae08","reward_point":"\uc801\ub9bd \ud3ec\uc778\ud2b8","download_expiry":"\ub2e4\uc6b4\ub85c\ub4dc \uae30\uac04","checkout":"\uc8fc\ubb38\uc815\ubcf4\ud655\uc778","buyer_information":"\uc8fc\ubb38\uc790","applying_cash_receipts":"\ud604\uae08\uc601\uc218\uc99d \uc2e0\uccad","privacy_policy":"\uac1c\uc778 \uc815\ubcf4 \uc815\ucc45","i_agree_to_the_privacy_policy":"\uac1c\uc778 \uc815\ubcf4 \uc815\ucc45\uc5d0 \ub3d9\uc758\ud569\ub2c8\ub2e4.","i_confirm_the_terms_of_the_transaction_and_agree_to_the_payment_process.":"\uac70\ub798\uc870\uac74\uc744 \ud655\uc778\ud588\uc73c\uba70 \uacb0\uc81c\uc9c4\ud589\uc5d0 \ub3d9\uc758\ud569\ub2c8\ub2e4."};
var kboard_comments_localize_strings = {"reply":"\ub2f5\uae00","cancel":"\ucde8\uc18c","please_enter_the_author":"\uc791\uc131\uc790\uba85\uc744 \uc785\ub825\ud574\uc8fc\uc138\uc694.","please_enter_the_password":"\ube44\ubc00\ubc88\ud638\ub97c \uc785\ub825\ud574\uc8fc\uc138\uc694.","please_enter_the_CAPTCHA":"\ubcf4\uc548\ucf54\ub4dc\ub97c \uc785\ub825\ud574\uc8fc\uc138\uc694.","please_enter_the_content":"\ub0b4\uc6a9\uc744 \uc785\ub825\ud574\uc8fc\uc138\uc694.","are_you_sure_you_want_to_delete":"\uc0ad\uc81c \ud558\uc2dc\uaca0\uc2b5\ub2c8\uae4c?","please_wait":"\uc7a0\uc2dc\ub9cc \uae30\ub2e4\ub824\uc8fc\uc138\uc694.","email":"\uc774\uba54\uc77c","address":"\uc8fc\uc18c","postcode":"\uc6b0\ud3b8\ubc88\ud638","phone_number":"\uc5f0\ub77d\ucc98","find":"\ucc3e\uae30","rate":"\ub4f1\uae09","ratings":"\ub4f1\uae09","waiting":"\ub300\uae30","complete":"\uc644\ub8cc","question":"\uc9c8\ubb38","answer":"\ub2f5\ubcc0","notify_me_of_new_comments_via_email":"\uc774\uba54\uc77c\ub85c \uc0c8\ub85c\uc6b4 \ub313\uae00 \uc54c\ub9bc \ubc1b\uae30"};
/* ]]> */
</script>
<script type="text/javascript" src="https://www.cha.ac.kr/wp-content/plugins/kboard/template/js/script.js?ver=5.3.3"></script>
<!-- We need this for debugging themes using Speed Booster Pack Plugin v3.5 -->


<!-- Global site tag (gtag.js) - Google Analytics -->
<script async="" src="https://www.googletagmanager.com/gtag/js?id=UA-104925667-1"></script>
<script>
  window.dataLayer = window.dataLayer || [];
  function gtag(){dataLayer.push(arguments);}
  gtag('js', new Date());

  gtag('config', 'UA-104925667-1');
</script>

<!-- Naver Analytics -->
<script type="text/javascript" src="https://wcs.naver.net/wcslog.js"></script>
<script type="text/javascript">
if(!wcs_add) var wcs_add = {};
wcs_add["wa"] = "4ee24a9a806764";
wcs_do();
</script>

<script  type="text/javascript">
/////by jaegu
const imgClass = document.querySelector(".beetimg");
var source = "/beet/resources/university/u";
var num = 1;
var source2 = ".jpg"

var img = document.createElement("img");

function cg(){
imgClass.style.backgroundImage= "url(" + source + num + source2 + ")";
if(++num > 4){num = 1;}
}
cg();
setInterval(cg,4000);
////by jaegu
</script>

<div id="wp-a11y-speak-polite" aria-live="polite" aria-relevant="additions text" aria-atomic="true" class="screen-reader-text wp-a11y-speak-region"></div><div id="wp-a11y-speak-assertive" aria-live="assertive" aria-relevant="additions text" aria-atomic="true" class="screen-reader-text wp-a11y-speak-region"></div></body></html></html>


