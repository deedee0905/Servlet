<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="java.text.SimpleDateFormat" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>


	<!-- bootstrap CDN link -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

  <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</head>
<body>

	<%
		Date now = new Date();
		SimpleDateFormat timeFormatter = new SimpleDateFormat("현재시간 H시 m분 s초");
		SimpleDateFormat dateFormatter = new SimpleDateFormat("오늘날짜 yyyy년 M월 d일");
		
		String timeString = timeFormatter.format(now);
		String dateString = dateFormatter.format(now);
		
		// 오늘날짜 알려줘
		// 현재시간 알려줘
		// /jsp/test02.jsp?what=date
		String what = request.getParameter("what");
		//  what 이 date 이면 날짜를 보여준다. 
		// what 이 time 이면 시간을 보여준다. 
		
		String targetString = null;
		//   /jsp/test02.jsp?what=date
		if(what.equals("date")) {
			targetString = dateString;
		} else { // /jsp/test02.jsp?what=time
			targetString = timeString;
		}
		
	%>

	<div class="container">
		<div class="display-1"><%= targetString %></div>

	
	</div>

</body>
</html>