<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		// BMI =  몸무게 / ((키 / 100.0) * (키 / 100.0));
	
	
	double weight = Integer.parseInt(request.getParameter("weight"));
	double heigth = Integer.parseInt(request.getParameter("height"));
	
	double bmi = weight / ((heigth / 100.0) * (heigth / 100.0));
	String bmiString = "";
	
	if(bmi <= 20){
		bmiString = "저체중";
	} else if(bmi >= 21 && bmi <= 25){
		bmiString = "정상";
	} else if(bmi >= 26 && bmi <= 30){
		bmiString = "과체중";
	} else if(bmi >= 31){
		bmiString = "비만";
	}
	
	
	%>
	
	<div class="container">
		<h2 class="text-bold">BMI 측정 결과</h2>
		<h1>당신은 <label class="text-primary"><%= bmiString %></label> 입니다.</h1>
		<label>BMI 수치 : <%= bmi %></label>
	</div>
	
	

</body>
</html>