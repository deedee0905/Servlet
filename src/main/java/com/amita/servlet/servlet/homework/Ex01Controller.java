package com.amita.servlet.servlet.homework;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Ex01Controller extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// response header 조작
		response.setCharacterEncoding("utf-8");
		// 데이터 타입
		response.setContentType("text/plain");
		
		// 오늘 날짜 
		Date now = new Date();
		// 날짜 출력 형태 포맷 변환
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String dateTimeString = formatter.format(now);
		
		//데이터 가져오기
		PrintWriter out = response.getWriter();
		
		out.println("오늘의 날짜는 " + dateTimeString);
		
		
	}

}
