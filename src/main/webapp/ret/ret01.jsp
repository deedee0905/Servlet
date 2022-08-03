<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.amita.servlet.common.MysqlService" %>
<%@ page import="java.sql.ResultSet" %>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		MysqlService mysqlService = MysqlService.getInstance();
		mysqlService.connect();
		
		String query = "SELECT * FROM `new_user`;";
		ResultSet resultSet = mysqlService.select(query);
		
	
	
	%>

	<div>
		<table border="1"> 
			<thead>
				<tr>
					<th>이름</th>
					<th>생년월일</th>
					<th>자기소개</th>
					<th>이메일</th>
				</tr>
			</thead>
		
			<tbody>
			<% while(resultSet.next()) { %>
				<tr>
					<td><%= resultSet.getString("name") %></td>
					<td><%= resultSet.getString("yyyymmdd") %></td>
					<td><%= resultSet.getString("introduce") %></td>
					<td><%= resultSet.getString("email") %></td>
					<td><a href="/db/ex02/delete?id=<%= resultSet.getInt("id") %>"> 삭제</a></td>
				</tr>
				
				<% } %>
			</tbody>
		
		</table>
	
		<a href="/ret/ret01_input.jsp">입력하기</a>
	
	</div>

</body>
</html>