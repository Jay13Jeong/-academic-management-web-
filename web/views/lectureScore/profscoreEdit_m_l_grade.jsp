<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
<style type="text/css">
.tg  {border-collapse:collapse;border-spacing:0;border-color:inherit;text-align:left;vertical-align:top}
.tg td{border-color:black;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:14px;
  overflow:hidden;padding:10px 5px;word-break:normal;}
.tg th{border-color:black;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:14px;
  font-weight:normal;overflow:hidden;padding:10px 5px;word-break:normal;}
 input.insert{ width: 40px; height:20px; margin:0px}  

.in {width:30px;}
</style>
<h1>성적입력_ajax 등급입력 페이지 (팝업처리)</h1>
<!--과목정보 출력 -->
<input type="button" id="chn" value="변경" /><!-- ajax 쓸건데 굳이? -->
<table class="tg">
<thead>
  <tr>
    <th>등급</th>
    <th>A+</th>
    <th>A</th>
    <th>B+</th>
    <th>B</th>
    <th>C+</th>
    <th>C</th>
    <th>D+</th>
    <th>D</th>
    <th>F</th>
  </tr>
</thead>
<tbody>
  <tr>
  <form id="test">
  	<div id="layer">
    <th>등급기준</th>
    <td><input id="A+" class="in" type="text" value="4.5"></td>
    <td><input id="A" class="in" type="text" value="4.0"></td>
    <td><input id="B+" class="in" type="text" value="3.5"></td>
    <td><input id="B" class="in" type="text" value="3.0"></td>
    <td><input id="C+" class="in" type="text" value="2.5"></td>
    <td><input id="C" class="in" type="text" value="2.0"></td>
    <td><input id="D+" class="in" type="text" value="1.5"></td>
    <td><input id="D" class="in" type="text" value="1.0"></td>
    <td><input id="F" class="in" type="text" value="0"></td>
	</div>
</form>
  </tr>
  
  <tr>
    <th>가능인원</th>
    <td><input id="" readonly></td>
    <td><input id="" readonly></td>
    <td><input id="" readonly></td>
    <td><input id="" readonly></td>
    <td><input id="" readonly></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>누적분포</td>
	<td></td>
	<td></td>
	<td></td>
	<td></td>
	<td></td>
	<td></td>
	<td></td>
	<td></td>
	<td></td>
  </tr>
</tbody>
</table>
<input type="button" id="chnsave" value="저장" />
<input type="button" id="chncancel" value="취소" />
<script type="text/javascript" src="/beet/resources/js/jquery-3.5.1.min.js"></script>
<script>
	var n1 = parseInt(document.getElementById("A+").value);
	var n2 = parseInt(document.getElementById("A").value);
	var n3 = parseInt(document.getElementById("B+").value);
	var n4 = parseInt(document.getElementById("B").value);
	var n5 = parseInt(document.getElementById("C+").value);
	var n6 = parseInt(document.getElementById("C").value);
	var n7 = parseInt(document.getElementById("D+").value);
	var n8 = parseInt(document.getElementById("D").value);
	var n9 = parseInt(document.getElementById("F").value);
	
	
/* document.getElementById("plus").onclick= function(){
} */

/* $("#layer")


focusout(function() {
	  var vv = this.value; 
	  var price = $("#price").val();  //가격
	  tot_price = price * (1-rate/100); // 할인율 적용한 가격

	  $("#tot_price").val(tot_price);

	}); */

/* $("#test").addEventListner('onKeyup', function(){
	alert("작동!")
})

function calc(){
	test.t1.value = n1 + n2;
} */
</script>
</body>
</html>