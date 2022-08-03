package com.amita.servlet.database;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.amita.servlet.common.MysqlService;

public class DBTest02InsertController extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		String site = request.getParameter("site");
		String url = request.getParameter("url");
		
		MysqlService mysqlservice =  MysqlService.getInstance();
		mysqlservice.connect();
		
		String query = "INSERT INTO `favorite`\r\n"
				+ "(`name`, `url`, `createdAt`, `updatedAt`)\r\n"
				+ "VALUES\r\n"
				+ "('"+ site + "', '" + url +"', now(), now());";
		
		mysqlservice.update(query);
		
		mysqlservice.disConnect();
		
		response.sendRedirect("/ret/hw01.jsp");
		
		
	}

}
