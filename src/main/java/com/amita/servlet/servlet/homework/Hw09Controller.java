package com.amita.servlet.servlet.homework;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/servlet/hw09")
public class Hw09Controller extends HttpServlet {
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String applicant = request.getParameter("applicant");
		String content = request.getParameter("content");
		
		out.println("<html> <head> <title>입사 지원</title> <head>");
		out.println("<body> <div> <h2>" + applicant + "님의 지원이 완료되었습니다.</h2> </div> <hr>");
		out.println("<div>" + content + " </div> </body> </html>");
		
	
		
	}

}
