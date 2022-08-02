package com.amita.servlet.database;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.amita.servlet.common.MysqlService;
@WebServlet("/db/test01")
public class DBTest01Controller extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/plain");
		
		//이름 생년월일 자기소개 이메일주소를 입력받아야함
		
		
		PrintWriter out = response.getWriter();
		
		MysqlService mysqlService = MysqlService.getInstance();
		
		mysqlService.connect();
		
		// 1번 예제
//		String insertQuery = "INSERT INTO `real_estate`\r\n"
//				+ "(`realtorId`, `address`, `area`, `type`, `price`, `rentPrice`, `createdAt`, `updatedAt`)\r\n"
//				+ "value\r\n"
//				+ "(3, '헤라펠리스 101동 5305호', 350, '매매', '150000', NULL, now(), now());";
//		
//		int count = mysqlService.update(insertQuery);
//		
//		out.println("삽입결과 : " + count);
//		
		
		String selectQuery = "SELECT `address`, `area`, `type`\r\n"
				+ "FROM `real_estate`\r\n"
				+ "ORDER BY `id` DESC\r\n"
				+ "LIMIT 10;";
		
		ResultSet resultSet = mysqlService.select(selectQuery);
		
		try {
			while(resultSet.next()) {
				
				out.print("매물주소 : " + resultSet.getString("address"));
				out.print(", 면적 : " + resultSet.getInt("area"));
				out.println(", 타입 : " + resultSet.getString("type"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		mysqlService.disConnect();
		
		
		
	}

}
