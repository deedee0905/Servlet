<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.util.*" %>
<%@ page import="java.text.SimpleDateFormat;" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
	
		Date now = new Date();
		SimpleDateFormat timeFormatter = new SimpleDateFormat("현재시간 H시 m분 s초");
		SimpleDateFormat dateFormatter = new SimpleDateFormat("현재시간 yyyy시 M분 d초");
		
		String timeString = timeFormatter.format(now);
		String dateString = timeFormatter.format(now);
		
		String what = request.getParameter("what");
		
		String targetString = null;
		if(what.equals("date")){
			targetString = dateString;
		} else {
			targetString = timeString;
		}
	
	%>
	
	<div class="container">
		<div class="display-1"><%= targetString %></div>
	</div>
	

</body>
</html>