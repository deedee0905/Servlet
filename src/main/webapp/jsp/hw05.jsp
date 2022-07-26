<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
	
	int centimeter = Integer.parseInt(request.getParameter("centimeter"));
	double inch = centimeter * 0.393701;
	double yard = centimeter * 0.010936;
	double feet = centimeter * 0.032808;
	double meter = centimeter * 0.01;
	
	String[] units = request.getParameterValues("unit");
	String unitPrintOut = "";
	
	for(int i = 0; i < units.length; i++){
		
		String targetUnit = units[i];
		
		
		if(units[i].equals("inch")){
			unitPrintOut += inch + "in<br>";
			
		} else if(units[i].equals("yard")){
			unitPrintOut += yard + "yard<br>";
			
		} else if(units[i].equals("feet")){
			unitPrintOut += feet + "feet<br>";
			
		} else if(units[i].equals("meter")){
			unitPrintOut += meter + "meter<br>";
		}
		
	}
	
	
	%>
	
	<div>
		<h2>변환 결과</h2>
		<%= centimeter %> cm
		<hr>
	</div>
	<div><%= unitPrintOut %></div>
	



</body>
</html>