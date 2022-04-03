<%@ 
page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" 
import="java.util.ArrayList,lecture.model.vo.Lecture,lecture.model.vo.Major,student.model.vo.Member" 

%>
<% 
String who = (String)request.getAttribute("who"); 
ArrayList<Major> list = (ArrayList<Major>)request.getAttribute("list");
String userid = "";
String username = "";
String userssn = "";
String useraddress = "";
String phone = "";
String email = "";
String treasure = "";
String gender = "";
if(request.getAttribute("saved") != null){
	Member save = (Member)request.getAttribute("saved");
	userid = save.getId();
	username = save.getName();
	userssn = save.getSsn();
	useraddress = save.getAddress();
	phone = save.getPhone();
	email = save.getEmail();
	treasure = save.getTreasure();
	gender = save.getGender();
}
%>
<head>
  
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>

<script type="text/javascript">
<!--

//-->
function validate(){
	//유효성 검사 코드 작성함
	//서버 컨트롤러로 전송할 값들이 요구한 조건을 모두 만족하였는지 검사함

	//암호와 암호 확인이 일치하지 않는지 확인함
		var pwdValue = document.querySelector(".userpwd").value;
		var pwdValue2 = document.querySelector(".userpwd2").value;
		
		if(pwdValue !== pwdValue2){
			alert("암호 확인 값이 일치하지 않습니다.");
			document.querySelector(".userpwd").select();
			return false;  //전송 취소함
		}

		return true;  //전송함
	}
		 
	function check1() { //중복체크
		 var frm = document.joinscreen;

		 if (frm.id.value.length < 3) {
			  alert("아이디는 3자 이상 입력해주세요");
		 } else {
		  window.open("./joinid.jsp?id=" + frm.id.value, "","width=10px,height=10px");
		 }
	}	
</script>
<style>
img{
    position: absolute;
   height: 100%;
   
   background-color: rgba(0, 0, 0, 0.4);                                                                 
   z-index:-1;
}
.other{
position:relative;
float:right;
margin-right:5px;
}
.otherid{
margin-right:10%;
}
.btns{
background-color:#2f3640;
}
</style>
<body>
<img src="/beet/resources/images/school.jpg">
<%= who %>
<br><br><br><br><br><br>
<center>

<div style="background-color:white; width:70%; border-radius:50px;">
&nbsp;
<br>
<h1 align="center">회원 가입</h1>
<br>
<form method="post" action="/beet/minsert.cp" onsubmit="return validate();" >

인증번호<br><br>
<input class="form-control" type="text" name="code" required autofocus style="width:20%;">
<br>
<% if(who.equals("admin")){ %>
<table id="outer" align="center" width="500" cellspacing="5" cellpadding="0">
<tr class="">
	<th width="120">*이 름</th>
	<td><input class="form-control" id="usr" type="text" name="username" value="<%= username %>" placeholderrequired>
	<br>
	</td>
</tr>
<tr class="">
	<th>*아이디</th>
	<td><input class="form-control" id="usr" type="text" name="userid" value="<%= userid %>" required> <br> 
	</td>
</tr>
<tr>
	<th>*암 호</th>
	<td><input class="form-control userpwd" id="pwd" type="password" name="userpwd"required> <br> </td>
</tr>
<tr>
	<th>*암호확인</th>
	<td><input type="password"  class="form-control userpwd2" id="pwd" required> <br> </td>
</tr>
<tr>
	<th>*주민등록번호</th>
	<td><input class="form-control" type="ssn" name="userssn"  value="<%= userssn %>" required> <br> </td>
</tr>
<tr>
	<th>*주소</th>
	<td><input type="address" name="useraddress"  class="form-control" id="usr" value="<%= useraddress %>" required> <br> </td>
</tr>
<tr>
	<th>전화번호</th>
	<td><input class="form-control" type="tel" name="phone" value="<%= phone %>"> <br> </td>
</tr>
<tr>
	<th>*성별</th>
	<td>
		<select class="form-control" name="gender">
			<option value="M">남</option>
			<option value="F">여</option>
		</select>
		 <br> 
	</td>
</tr>
<tr>
	<th>*이메일</th>
	<td><input class="form-control" type="email" name="email" value="<%= email %>" required> <br> </td>
</tr>
<tr>
	<th>*나의보물1호</th>
	<td><input class="form-control" type="treasure" name="treasure" value="<%= treasure %>" required> <br> </td>
</tr>
<tr>
	<th width="120">임직원 입사일</th>
	<td>
	<input class="form-control" type="date" name="adminhiredate" required> <br> 
	</td>
</tr>
</tr>
<tr Style="display:none;">
<th></th><td><input class="form-control" type="radio" name="who" value="<%= who %>" checked> <br> </td>
</tr>
<tr>
	<th colspan="2" >
	<center>
	<button  type="submit" value="가입하기" class="btn btn-outline-light btns">가입하기</button>&nbsp; 
	<form>
	<button onclick="javascript:location.href='/beet/'" class="btn btn-outline-light btns down_default" target="_blank" value="작성취소">작성취소</button>
	</form>
	</center>
	</th>
</tr>
</table>
<% }else if(who.equals("professor")){ %>
<table id="outer" align="center" width="500" cellspacing="5" cellpadding="0">
<br>
<tr>
	<th>*학과</th>
	<td>
		<select class="form-control" name="major" required>
		<% for(Major m : list){ %>
		<option  value="<%= m.getMajorno() + "," + m.getCategoryname() + "," + who %>">
		<%= m.getMajorname() %>
		</option>
		<% } %>
		</select>
		<br>
	</td>
</tr>
<tr class="">
	<th width="120">*이 름</th>
	<td><input class="form-control" id="usr" type="text" name="username" value="<%= username %>" placeholderrequired>
	<br>
	</td>
</tr>
<tr class="">
	<th>*아이디</th>
	<td><input class="form-control" id="usr" type="text" name="userid" value="<%= userid %>" required> <br> 
	</td>
</tr>
<tr>
	<th>*암 호</th>
	<td><input class="form-control userpwd" id="pwd" type="password" name="userpwd"required> <br> </td>
</tr>
<tr>
	<th>*암호확인</th>
	<td><input type="password"  class="form-control userpwd2" id="pwd" required> <br> </td>
</tr>
<tr>
	<th>*주민등록번호</th>
	<td><input class="form-control" type="ssn" name="userssn"  value="<%= userssn %>" required> <br> </td>
</tr>
<tr>
	<th>*주소</th>
	<td><input type="address" name="useraddress"  class="form-control" id="usr" value="<%= useraddress %>" required> <br> </td>
</tr>
<tr>
	<th>전화번호</th>
	<td><input class="form-control" type="tel" name="phone" value="<%= phone %>"> <br> </td>
</tr>
<tr>
	<th>*성별</th>
	<td>
		<select class="form-control" name="gender">
			<option value="M">남</option>
			<option value="F">여</option>
		</select>
		 <br> 
	</td>
</tr>
<tr>
	<th>*이메일</th>
	<td><input class="form-control" type="email" name="email" value="<%= email %>" required> <br> </td>
</tr>
<tr>
	<th>*나의보물1호</th>
	<td><input class="form-control" type="treasure" name="treasure" value="<%= treasure %>" required> <br> </td>
</tr>
</tr>
<tr Style="display:none;">
<th></th><td><input type="radio" name="who" value="<%= who %>" checked></td>
</tr>
<tr>
	<th colspan="2" >
	<center>
	<button  type="submit" value="가입하기" class="btn btn-outline-light btns">가입하기</button>&nbsp; 
	<form>
	<button onclick="javascript:location.href='/beet/'" class="btn btn-outline-light btns down_default" target="_blank" value="작성취소">작성취소</button>
	</form>
	</center>
	</th>
</tr>
</table>
<% }else{ %>
<table id="outer" align="center" width="500" cellspacing="5" cellpadding="0">
<br>
<tr>
	<th>*학과</th>
	<td>
		<select class="form-control" name="major" required>
		<% for(Major m : list){ %>
		<option  value="<%= m.getMajorno() + "," + m.getCategoryname() + "," + who %>">
		<%= m.getMajorname() %>
		</option>
		<% } %>
		</select>
		<br>
	</td>
</tr>
<tr class="">
	<th width="120">*이 름</th>
	<td><input class="form-control" id="usr" type="text" name="username" value="<%= username %>" placeholderrequired>
	<br>
	</td>
</tr>
<tr class="">
	<th>*아이디</th>
	<td><input class="form-control" id="usr" type="text" name="userid" value="<%= userid %>" required> <br> 
	</td>
</tr>
<tr>
	<th>*암 호</th>
	<td><input class="form-control userpwd" id="pwd" type="password" name="userpwd"required> <br> </td>
</tr>
<tr>
	<th>*암호확인</th>
	<td><input type="password"  class="form-control userpwd2" id="pwd" required> <br> </td>
</tr>
<tr>
	<th>*주민등록번호</th>
	<td><input class="form-control" type="ssn" name="userssn"  value="<%= userssn %>" required> <br> </td>
</tr>
<tr>
	<th>*주소</th>
	<td><input type="address" name="useraddress"  class="form-control" id="usr" value="<%= useraddress %>" required> <br> </td>
</tr>
<tr>
	<th>전화번호</th>
	<td><input class="form-control" type="tel" name="phone" value="<%= phone %>"> <br> </td>
</tr>
<tr>
	<th>*성별</th>
	<td>
		<select class="form-control" name="gender">
			<option value="M">남</option>
			<option value="F">여</option>
		</select>
		 <br> 
	</td>
</tr>
<tr>
	<th>*이메일</th>
	<td><input class="form-control" type="email" name="email" value="<%= email %>" required> <br> </td>
</tr>
<tr>
	<th>*나의보물1호</th>
	<td><input class="form-control" type="treasure" name="treasure" value="<%= treasure %>" required> <br> </td>
</tr>
<tr class="pp" class="aa">
	<th width="120">입학날짜</th>
	<td>
	<input class="form-control" type="date" name="entrancedate" required>
	<br>
	</td>
</tr>
<tr class="pp" class="aa">
	<th width="120">장학금 이름</th>
	<td><input class="form-control" type="text" name="ssname"> <br> </td>
</tr>
<tr Style="display:none;">
<th></th><td><input class="form-control" type="radio" name="who" value="<%= who %>" checked></td>
</tr>
<tr>
	<th colspan="2" >
	<center>
	<button  type="submit" value="가입하기" class="btn btn-outline-light btns">가입하기</button>&nbsp; 
	<form>
	<button onclick="javascript:location.href='/beet/'" class="btn btn-outline-light btns down_default" target="_blank" value="작성취소">작성취소</button>
	</form>
	</center>
	</th>
</tr>
</table>
<% } %>
</form>
<br>

<b style="color:blue;font-size:13pt">
<% if(request.getAttribute("result") == null){ %>
회원가입 버튼을 눌러주세요!
<% }else if(who.equals("professor")){ %>
인증코드 불일치 또는 교수Id는 앞에 P가 반드시 붙어야 합니다.
<% }else{ %>
인증코드 불일치 또는 임직원(관리자)Id는 앞에 A가 반드시 붙어야 합니다.
<% } %>
</b>
<br>
&nbsp;
</div>
</center>		



</body>
</html>