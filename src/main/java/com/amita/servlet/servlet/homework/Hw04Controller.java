package com.amita.servlet.servlet.homework;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/Hw04")
public class Hw04Controller extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		

		out.println("<html> <head> <title>annotaion2</title> </head>  <body> <div> <ul>");
		
		for(int i = 1; i <=30; i++) {
			String print = "번째 리스트";
			out.println("<li>" + (i) + print+ "</li>");
		}
		
		out.println("</ul> </div> </body>  </html>");
		
		
	}

}
