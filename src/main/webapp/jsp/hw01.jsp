<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 스크립트 요소</title>
</head>
<body>

	<div>
		<%
		int[] scores = {80, 90, 100, 95, 80};
		int sum = 0;
		for(int i = 0; i < scores.length; i++){
			sum += scores[i];
		}
		
		double average = sum / (double)scores.length;
		
		%>
	
	
		<h2> 1. 점수들의 평균 구하기</h2>
		<h2>점수 평균은 <%= average %> 입니다.</h2>
	</div>
	
	<div>
		<h2> 2. 채점 결과 </h2>
	</div>

</body>
</html>