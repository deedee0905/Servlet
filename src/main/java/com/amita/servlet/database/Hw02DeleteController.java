package com.amita.servlet.database;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.amita.servlet.common.MysqlService;
@WebServlet("/ret/hw02/delete")
public class Hw02DeleteController extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		String id = request.getParameter("id");
		
		MysqlService mysqlservice = MysqlService.getInstance();
		mysqlservice.connect();
		
		String query = "DELETE FROM `favorite` WHERE `id` = " + id +";";
		mysqlservice.update(query);
		
		mysqlservice.disConnect();
		
		// 리다이렉트
		response.sendRedirect("/ret/hw02.jsp");
		
		
	}

}
