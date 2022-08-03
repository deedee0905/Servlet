<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사용자 정보 입력</title>
</head>
<body>

		<form method="post" action="/db/ex02/insert">
			<label>이름</label> <input type="text" name="name"> <br>
			<label>생년월일</label> <input type="text" name="birthday" > <br>
			<label>자기소개</label> <textarea name="introduce" rows="3" col="20"></textarea> <br>
			<label>이메일</label> <input name="email" type="text"> <br>
			<button type="submit">입력</button>
			
		
		</form>



</body>
</html>