package com.amita.servlet.database;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.amita.servlet.common.MysqlService;
@WebServlet("/ret/hw02/insert")
public class hw02InsertController extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		String site = request.getParameter("site");
		String url = request.getParameter("url");
		
		MysqlService mysqlService = MysqlService.getInstance();
		mysqlService.connect();
		
		String query="INSERT INTO `favorite`\r\n"
				+ "(`name`, `url`, `createdAt`, `updatedAt`)\r\n"
				+ "VALUES\r\n"
				+ "('" + site + "', '" + url +"', now(), now())";
		
		int count = mysqlService.update(query);
		
		mysqlService.disConnect();
		
		response.sendRedirect("/ret/hw02.jsp");
		
	}

}
