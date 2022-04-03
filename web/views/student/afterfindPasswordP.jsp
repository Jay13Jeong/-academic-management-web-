<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="student.model.vo.Professor"%>
<%
	Professor professor = (Professor)request.getAttribute("professor");
	System.out.println(professor.getId()+"888888888888888888");
%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<meta charset="UTF-8">
<title>beet</title>
<script>
function validate(){

	//암호와 암호 확인이 일치하지 않는지 확인함
		var pwdValue = document.getElementById("userpwd").value;
		var pwdValue2 = document.getElementById("userpwd2").value;
		
		if(pwdValue !== pwdValue2){
			alert("암호와 암호 확인의 값이 일치하지 않습니다.");
			document.getElementById("userpwd").select();
			return false;  //전송 취소함
		}

		return true;
}
</script>
</head>
<style>


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







						
		
			<div class="wrapper">
	<div class="wrapper_inner">
<%@ include file = "/views/common/header222.jsp" %>
<a id="back_to_top" href="#" class="off">
			
		</a>
	    	
    
	

    
<div class="content " style="min-height: 755px; padding-top: 0px;">
						<div class="content_inner  ">
									<div class="title_outer title_without_animation" data-animation="yes" data-height="350">
		<div class="title title_size_medium  position_left  has_fixed_background " style="background-size: 1920px; background-image: url(&quot;/beet/resources/images/page.jpg&quot;); height: 350px; background-color: rgb(153, 153, 153); background-position: center 2.205px;">
			<div class="image not_responsive"><img itemprop="image" src="/beet/resources/images/page.jpg" alt="&nbsp;"> </div>
										<div class="title_holder skrollable skrollable-between" data-0="opacity:1" data-300="opacity:0" style="padding-top: 133px; height: 217px; opacity: 1;">
					<div class="container">
						<div class="container_inner clearfix">
								<div class="title_subtitle_holder">
                                                                					
						</div>
					</div>
				</div>
								</div>
			</div>
				<div class="container">
            			<div class="container_inner default_template_holder clearfix page_container_inner">
						
					
						
						<div class="two_columns_75_25 background_color_sidebar grid2 clearfix">
							<div class="column1">
																				<div class="column_inner">
								
								<div class="vc_row wpb_row section vc_row-fluid " style=" text-align:left;"><div class=" full_section_inner clearfix"><div class="wpb_column vc_column_container vc_col-sm-12"><div class="vc_column-inner "><div class="wpb_wrapper">
	<div class="wpb_text_column wpb_content_element ">
		<div class="wpb_wrapper">

</style>

<body>
<form class="form-horizontal" role="form" method="POST" action="/beet/professorfindpwd.cp" onsubmit="return validate()">
	<input type="hidden" name="id" value="<%=professor.getId() %>">
		새비밀번호 만들기
		<div class="row">
			<div class="col-md-10 inputbb">
				<div class="form-group has-danger">
					<div class="input-group mb-2 mr-sm-2 mb-sm-0">
						<input type="password" name="userpwd" class="form-control" id="password"
							placeholder="비밀번호" required autofocus>
					</div>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-md-10 inputbb">
				<div class="form-group">
					<div class="input-group mb-2 mr-sm-2 mb-sm-0">
						<input type="password" name="userpwd2" class="form-control"
							id="passwordcheck" placeholder="비밀번호 확인" required>
					</div>
				</div>
			</div>
		</div>

		<div class="row">
			<div class="col-md-10 inputbb">
				<button type="submit">확인</button>
				<button onclick="javascript:location.href='/beet/index.jsp'">취소</button>
				
			</div>
		</div>
		
	</form>
</body>
</html>