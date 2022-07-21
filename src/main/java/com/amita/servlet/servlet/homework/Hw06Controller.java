package com.amita.servlet.servlet.homework;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/hw06")
public class Hw06Controller extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		
		PrintWriter out = response.getWriter();
		
		String numberString1 = request.getParameter("numberString1");
		String numberString2 = request.getParameter("numberString2");
		
		int number1 = Integer.parseInt(numberString1);
		int number2 = Integer.parseInt(numberString2);
		
		int addition = number1 + number2;
		int substraction = number1 - number2;
		int multiplication = number1 * number2;
		int division = number1 / number2;
		
		// json
//		{"addition":10, "substraction":5, "multiplication":25, "division":1}
		
		out.println("{\"addition\":" + addition + ", \"substraction\":" + substraction + " , \"multiplication\":" + multiplication + ", \"division\":" + division + "}");
		
		
	}

}
