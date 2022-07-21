package com.amita.servlet.servlet.homework;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/hw08")
public class Hw08Controller extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		// 검색할 데이터 입력 받기
		String keyword = request.getParameter("keyword");
		
		List<String> list = new ArrayList<>(Arrays.asList(
		        "강남역 최고 맛집 소개 합니다.", 
		        "오늘 기분 좋은 일이 있었네요.", 
		        "역시 맛집 데이트가 제일 좋네요.", 
		        "집에 가는 길에 동네 맛집 가서 안주 사갑니다.",
		        "자축 저 오늘 생일 이에요."));
		
		out.println("<html> <head> <title>get, form 연습 2</title> </head>");
		out.println("<body> <div>");
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).contains(keyword)) {
				String search = list.get(i).replaceAll(keyword, "<b>맛집</b>");
				out.println(search + "<br> <hr>");			
				
			}
		}
		
		// 선생님 코드
//		for(String sentence : list) {
//			if(sentence.contains(keyword)) {
//				sentence = sentence.replace(keyword, "<b>" + keyword + "</b>");
//				out.println("<hr>");
//			}
//		}
		
		out.println("</div> </body> </html>");
		
		
	}

}
