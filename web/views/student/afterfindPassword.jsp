<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>beet</title>
</head>
<body>
<form class="form-horizontal" role="form" method="POST" action="/beet/findpwd">
		새비밀번호 만들기
		<div class="row">
			<div class="col-md-10 inputbb">
				<div class="form-group has-danger">
					<div class="input-group mb-2 mr-sm-2 mb-sm-0">
						<input type="text" name="password" class="form-control" id="password"
							placeholder="비밀번호" required autofocus>
					</div>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-md-10 inputbb">
				<div class="form-group">
					<div class="input-group mb-2 mr-sm-2 mb-sm-0">
						<input type="text" name="passwordcheck" class="form-control"
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