package com.amita.servlet.database;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.amita.servlet.common.MysqlService;
@WebServlet("/db/ex02/insert")
public class DBEx02InsertController extends HttpServlet {
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		//이름, 생년월일, 자기소개, 이메일
		String name = request.getParameter("name");
		String birthDay = request.getParameter("birthday");
		String introduce = request.getParameter("introduce");
		String email = request.getParameter("email");
		
	
		MysqlService mysqlService = MysqlService.getInstance();
		mysqlService.connect();
		
		String query = "INSERT INTO `new_user`\r\n"
				+ "(`name`, `userId`, `yyyymmdd`, `introduce`, `email`, `createdAt`, `updatedAt`)\r\n"
				+ "VALUES\r\n"
				+ "('우영우', 'ooh', '20010312', '우영우 기러기 스위스', 'ooh@gmail.com', now(), now());";
		
		int count = mysqlService.update(query);
		
		
		mysqlService.disConnect();
		
		// 페이지를 리스트 페이지로 이동한다.
		//redirect
		
		response.sendRedirect("/db/ex02.jsp");
		
		
	
	}
	
	

}
