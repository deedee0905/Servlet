package com.amita.servlet.servlet.homework;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/Hw03")
public class Hw03Controller extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		Date now = new Date();
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String dateTimeString = formatter.format(now);
		
		PrintWriter out = response.getWriter();
		out.println("<html>  <head> <title>annotation1</title> </head>  <body> <div> <h1> [단독] 고양이가 야옹해 </h1>");
		out.println("</div> <div> 기사 입력시간 : " + dateTimeString + "</div> <hr> <div>끝</div> </body> </html>");
		
	}
	
	
}
