<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="student.model.vo.Member" %>
<% Member m1 = (Member)session.getAttribute("loginMember"); %>    
<!DOCTYPE html>
<html lang="ko-KR" class="js flexbox canvas canvastext webgl no-touch geolocation postmessage websqldatabase indexeddb hashchange history draganddrop websockets rgba hsla multiplebgs backgroundsize borderimage borderradius boxshadow textshadow opacity cssanimations csscolumns cssgradients cssreflections csstransforms csstransforms3d csstransitions fontface generatedcontent video audio localstorage sessionstorage webworkers applicationcache svg inlinesvg smil svgclippaths js_active  vc_desktop  vc_transform  vc_transform  js csstransitions skrollr skrollr-desktop" style="height: auto; overflow: auto;"><head>
 <meta charset="UTF-8">
 
 
<head>
<html lang="ko-KR" class="js flexbox canvas canvastext webgl no-touch geolocation postmessage websqldatabase indexeddb hashchange history draganddrop websockets rgba hsla multiplebgs backgroundsize borderimage borderradius boxshadow textshadow opacity cssanimations csscolumns cssgradients cssreflections csstransforms csstransforms3d csstransitions fontface generatedcontent video audio localstorage sessionstorage webworkers applicationcache svg inlinesvg smil svgclippaths js_active  vc_desktop  vc_transform  vc_transform  js csstransitions skrollr skrollr-desktop" style="height: auto; overflow: auto;"><head>
 <meta charset="UTF-8">
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

</head>
<body>
    <header class="has_top has_header_fixed_right scroll_header_top_area dark stick scrolled_not_transparent page_header">
                <div class="header_inner clearfix">

                    <div class="header_top_bottom_holder">
                        <div class="header_top clearfix" style="background-color:rgba(19, 67, 107, 1);">
                            <div class="container">
                                <div class="container_inner clearfix">
                                    <div class="left">
                                        <div class="inner">
                                            <div class="header-widget widget_nav_menu header-left-widget">
                                                <div id="nav_menu-4">
                                                    <div class="menu-top_left_menu-container">
                                                        <ul id="menu-top_left_menu" class="menu">
                                                            <li id="menu-item-1160" class="menu-item menu-item-type-custom menu-item-object-custom menu-item-1160">
                                                            </li>
                                                            <li id="menu-item-495" class="menu-item menu-item-type-post_type menu-item-object-page menu-item-495">
                                                              	<%if(m1 != null){ %>
                                                              	<%if(m1.getId().substring(0, 1).equals("P")){ %>
																	<li><%= m1.getName() %>교수님   | </li>
																<% }else if(m1.getId().substring(0, 1).equals("A")){ %>
																		<li><%= m1.getName() %>관리자님   | </li>
																<% }else{ %>
																<li><%= m1.getName() %>님   | </li>
																	<%} %> 
                                                                </li>
                                                                <%}else{ %>
                                                                <%} %>
                                                            <li><a href="/beet/logout.cp" >로그아웃</a>  | </li>
                                                            
                                                            <li id="menu-item-12423" class="menu-item menu-item-type-custom menu-item-object-custom menu-item-12423">
                                                                <a target="_blank" href="/beet/views/main/main.jsp">나의학사관리시스템</a>
                                                            </li>
                                                        </ul>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="right">
                                        <div class="inner">
                                            <div class="header-widget widget_nav_menu header-right-widget">
                                                <div id="nav_menu-14">
                                                    <div class="menu-top_right_menu-container">
                                                        <ul id="menu-top_right_menu" class="menu">
                                                            <li id="menu-item-1161" class="menu-item menu-item-type-custom menu-item-object-custom menu-item-1161">
                                                            </li>
                                                            <li id="menu-item-4430" class="menu-item menu-item-type-post_type menu-item-object-page menu-item-4430">
                                                            </li>
                                                        </ul>
                                                    </div>
                                                </div>
                                            </div>
                                         
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="header_bottom clearfix" style=" background-color:rgba(255, 255, 255, 1);">
                            <div class="container">
                                <div class="container_inner clearfix">
                                    <div class="header_inner_left">
                                        <div class="mobile_menu_button">
                                            <span>
                                                <span aria-hidden="true" class="qode_icon_font_elegant icon_menu "></span>
                                            </span>
                                        </div>
                                        <div class="logo_wrapper">
                                            <div class="q_logo">
                                                <a itemprop="url" href="https://www.cha.ac.kr/" style="height: 47px; visibility: visible;">





                                                </a>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="header_inner_right">
                                        <div class="side_menu_button_wrapper right">
                                            <div class="side_menu_button">


                                            </div>
                                        </div>
                                    </div>

                                    <!--헤더메뉴 ★★★★★★ 두번씩 써야해요 반응형떄문에 -->
                                    

                                 <%if(m1 != null){ %>  
                                <%if(m1.getId().substring(0, 1).equals("P")){ //교수%>     
                                    
                                       <nav class="main_menu drop_down right">
                                        <ul id="menu-new-main-menu" class="">
                                            <li id="nav-menu-item-58753" class="">
                                                <a href="/beet/views/student/memberUpdatePage.jsp" class="current  active"><i class="menu_icon blank fa"></i><span>마이페이지</span><span class="plus"></span></a>
                                            </li>

                                            <li id="nav-menu-item-2753" class="">
                                                <a href="/beet/showplan.ss" class=""><i class="menu_icon blank fa"></i><span>강의</span><span class="plus"></span></a>
                                            </li>
                                            <li id="nav-menu-item-2369" class="">
                                                <a href="/beet/scmain.p?userid=<%= ((Member)session.getAttribute("loginMember")).getId() %>" class=""><i class="menu_icon blank fa"></i><span>출결/성적</span><span class="plus"></span></a>
                                            </li>
                                            
                                            <li id="nav-menu-item-2045" class="">
                                                <a target="_blank" href="/beet/nlist" class=""><i class="menu_icon blank fa"></i><span>학교소식</span><span class="plus"></span></a>
                                            </li>
                                            <li id="nav-menu-item-5823" class="">
                                                <a href="/beet/schlist" class="current  active"><i class="menu_icon blank fa"></i><span>학사일정</span><span class="plus"></span></a>
                                            </li>

                                        </ul>
                                    </nav>
                                    
                                    
                                   <%}else if(m1.getId().substring(0, 1).equals("A")){//관리자 %> 
                                   
                                    
                                    
                                    <nav class="main_menu drop_down right">
                                        <ul id="menu-new-main-menu" class="">
                                            <li id="nav-menu-item-58753" class="">
                                                <a href="/beet/views/student/memberUpdatePage.jsp" class="current  active"><i class="menu_icon blank fa"></i><span>마이페이지</span><span class="plus"></span></a>
                                            </li>

                                            <li id="nav-menu-item-2369" class="">
                                                <a href="/beet/views/attendance/sub4main.jsp" class=""><i class="menu_icon blank fa"></i><span>출결/성적</span><span class="plus"></span></a>
                                            </li>
                                            <li id="nav-menu-item-2492" class="">
                                                <a href="/beet/mlist.ad" class=""><i class="menu_icon blank fa"></i><span>등록/장학</span><span class="plus"></span></a>
                                            </li>
                                            <li id="nav-menu-item-13721" class="">
                                                <a href="/beet/toapply?who=<%= ((Member)session.getAttribute("loginMember")).getId() %>" class=""><i class="menu_icon blank fa"></i><span>수강신청</span><span class="plus"></span></a>
                                            </li>
                                            <li id="nav-menu-item-2368" class="">
                                                <a href="/beet/selectaball" class=""><i class="menu_icon blank fa"></i><span>휴학/복학</span><span class="plus"></span></a>
                                            </li>
                                            <li id="nav-menu-item-2045" class="">
                                                <a target="_blank" href="/beet/nlist" class=""><i class="menu_icon blank fa"></i><span>학교소식</span><span class="plus"></span></a>
                                            </li>
                                            <li id="nav-menu-item-5823" class="">
                                                <a href="/beet/schlist" class="current  active"><i class="menu_icon blank fa"></i><span>학사일정</span><span class="plus"></span></a>
                                            </li>

                                        </ul>
                                    </nav>
                                    
                                    	<%}else{ //학생 %>
                                    
 
                                    
                                      <nav class="main_menu drop_down right">
                                        <ul id="menu-new-main-menu" class="">
                                            <li id="nav-menu-item-58753" class="">
                                                <a href="/beet/views/student/memberUpdatePage.jsp" class="current  active"><i class="menu_icon blank fa"></i><span>마이페이지</span><span class="plus"></span></a>
                                            </li>

                                            <li id="nav-menu-item-2369" class="">
                                         
                                                <a href="/beet/mylctr?userid=<%= ((Member)session.getAttribute("loginMember")).getId() %>" class=""><i class="menu_icon blank fa"></i><span>출결/성적</span><span class="plus"></span></a>
                                            </li>
                                            <li id="nav-menu-item-2492" class="">
                                                <a href="/beet/s.t.list?who=<%= ((Member)session.getAttribute("loginMember")).getId() %>" class=""><i class="menu_icon blank fa"></i><span>등록/장학</span><span class="plus"></span></a>
                                            </li>
                                            <li id="nav-menu-item-13721" class="">
                                                <a href="/beet/toapply?who=<%= ((Member)session.getAttribute("loginMember")).getId() %>" class=""><i class="menu_icon blank fa"></i><span>수강신청</span><span class="plus"></span></a>
                                            </li>
                                            <li id="nav-menu-item-2368" class="">
                                                <a href="/beet/selectab?studentid=<%=m1.getId()%>" class=""><i class="menu_icon blank fa"></i><span>휴학/복학</span><span class="plus"></span></a>
                                            </li>
                                            <li id="nav-menu-item-2045" class="">
                                                <a target="_blank" href="/beet/nlist" class=""><i class="menu_icon blank fa"></i><span>학교소식</span><span class="plus"></span></a>
                                            </li>
                                            <li id="nav-menu-item-5823" class="">
                                                <a href="/beet/schlist" class="current  active"><i class="menu_icon blank fa"></i><span>학사일정</span><span class="plus"></span></a>
                                            </li>

                                        </ul>
                                    </nav>
                                   <%} %> 
                                   <%}else{ %>
                                                                <%} %>
                                    <!-- <nav class="mobile_menu">
                                        <ul id="menu-new-main-menu-1" class="" style="display: none;">
                                            서브메뉴 두번써야해요 여기에도 써야해요
                                            <li id="mobile-menu-item-58753" class="menu-item menu-item-type-post_type menu-item-object-page current-menu-item page_item page-item-980 current_page_item active">
                                                <a href="https://www.cha.ac.kr/%ed%96%89%ec%a0%95/%ec%a6%9d%eb%aa%85%ec%84%9c%eb%b0%9c%ea%b8%89/" class="current  active"><span>마이페이지</span></a><span class="mobile_arrow"><i class="fa fa-angle-right"></i><i class="fa fa-angle-down"></i></span>
                                            </li>



                                            <li id="mobile-menu-item-2753" class="menu-item menu-item-type-post_type menu-item-object-page ">
                                                <a href="https://www.cha.ac.kr/%eb%89%b4%ec%8a%a4/%ed%95%99%ea%b5%90%eb%8f%99%ec%a0%95/" class=""><span>강의</span></a><span class="mobile_arrow"><i class="fa fa-angle-right"></i><i class="fa fa-angle-down"></i></span>
                                            </li>
                                            <li id="mobile-menu-item-2369" class="menu-item menu-item-type-post_type menu-item-object-page ">
                                                <a href="../attendance/sub4main.jsp" class=""><span>출결/성적</span></a><span class="mobile_arrow"><i class="fa fa-angle-right"></i><i class="fa fa-angle-down"></i></span>
                                            </li>
                                            <li id="mobile-menu-item-2492" class="menu-item menu-item-type-post_type menu-item-object-page ">
                                                <a href="https://www.cha.ac.kr/%ec%97%b0%ea%b5%ac/%ec%b0%a8%eb%b3%91%ec%9b%90-%eb%84%a4%ed%8a%b8%ec%9b%8c%ed%81%ac/" class=""><span>등록/장학</span></a><span class="mobile_arrow"><i class="fa fa-angle-right"></i><i class="fa fa-angle-down"></i></span>
                                            </li>
                                            <li id="mobile-menu-item-13721" class="menu-item menu-item-type-post_type menu-item-object-page ">
                                                <a href="https://www.cha.ac.kr/%eb%8c%80%ed%95%99%ec%83%9d%ed%99%9c/%ed%95%99%ec%82%ac%ec%9d%bc%ec%a0%95-2020%ed%95%99%eb%85%84%eb%8f%84/" class=""><span>수강신청</span></a><span class="mobile_arrow"><i class="fa fa-angle-right"></i><i class="fa fa-angle-down"></i></span>
                                            </li>
                                            <li id="mobile-menu-item-2368" class="menu-item menu-item-type-post_type menu-item-object-page ">
                                                <a href="https://www.cha.ac.kr/%ed%95%99%ea%b5%90%ec%86%8c%ea%b0%9c/%ec%b4%9d%ec%9e%a5%ec%8b%a4/%ec%b4%9d%ec%9e%a5-%ec%9d%b8%ec%82%ac%eb%a7%90/" class=""><span>휴학/복학</span></a><span class="mobile_arrow"><i class="fa fa-angle-right"></i><i class="fa fa-angle-down"></i></span>
                                            </li>
                                            <li id="mobile-menu-item-2045" class="menu-item menu-item-type-custom menu-item-object-custom ">
                                                <a target="_blank" href="https://admission.cha.ac.kr/" class=""><span>학교소식</span></a><span class="mobile_arrow"><i class="fa fa-angle-right"></i><i class="fa fa-angle-down"></i></span>
                                            </li>
                                            <li id="mobile-menu-item-5823" class="menu-item menu-item-type-post_type menu-item-object-page current-menu-item page_item page-item-980 current_page_item active">
                                                <a href="https://www.cha.ac.kr/%ed%96%89%ec%a0%95/%ec%a6%9d%eb%aa%85%ec%84%9c%eb%b0%9c%ea%b8%89/" class="current  active"><span>학사일정</span></a><span class="mobile_arrow"><i class="fa fa-angle-right"></i><i class="fa fa-angle-down"></i></span>
                                            </li>


                                        </ul>
                                    </nav> -->
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

            </header>
</body>
</html>
