package com.amita.servlet.database;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.amita.servlet.common.MysqlService;

public class DBTest02DeleteController extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		String id  = request.getParameter("id");
		
		MysqlService mysqlService = MysqlService.getInstance();
		
		mysqlService.connect();
		
		String query = "DELETE FROM `favorite` WHERE `id` =" + id + ";";
		mysqlService.update(query);
		
		mysqlService.disConnect();
		
		response.sendRedirect("/ret/hw01.jsp");
		
		
	}

}
