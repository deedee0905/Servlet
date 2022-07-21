package com.amita.servlet.servlet.homework;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/hw07")
public class Hw07Controller extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		//주소, 결제카드, 가격 데이터 입력받기
		String address = request.getParameter("address");
		String payCard = request.getParameter("payCard");
		String price = request.getParameter("price");
		
		// 오류조건 만들기
		if(address.contains("서울시") == false) {
			out.println("배달 불가 지역입니다.");
		} 
		
		else if(payCard.equals("신한카드")) {
			out.println("결제 불가 카드입니다.");
		} 
		// 정상 경우
		else {
			
			out.println("<html> <head><title>get, form 연습 1</title></head>");
			
			out.println("<body> <div> <b>" + address + "배달 준비중 </b></div>");
			
			out.println("<hr>");
			
			out.println("<div> 결제금액 : " + price + "</div> </body> </html>");
			
		}
		

		
	}

}
