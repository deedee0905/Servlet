<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 기본 문법</title>
</head>
<body>

	<!-- html 주석 : 자바 코드를 포함시킨다 -->
	<%--jsp 주석 : 자바코드를 포함시킨다 --%>
	
	<h2>JSP 기본 문법</h2>
	
	<%
		// %%가 감싸고 있는 부분은 자바 공간이기 때문에 자바 // 주석 표시도 사용 가능함
		
		// 1~10까지의 합
		int sum = 0;
		for(int i = 1; i <= 10; i++){
			sum += i;
		}
	
	%>
	
	<h3>합계 : <%= sum %> </h3>
	
	
	<% //동물 이름 리스트
		List<String> animals = new ArrayList<>();
		animals.add("dog");
		animals.add("cat");
	%>
	
	<h3><%= animals.get(0) %></h3>
	<h3><%= animals.get(1) %></h3>


	<%
		//멤버변수
		private int number = 100;
	
		//메소드
		// hello world를 리턴하는 메소드 만들기
		public String getHelloWorld() {
			return "Hello World";
		}
		
	%>
	
	<h3><%= getHelloWorld() %></h3>

	
	

</body>
</html>