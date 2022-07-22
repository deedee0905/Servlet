package EncordingFilter;

import java.io

import javax.servlet.Filter;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Encording implements Filter {
	@Override
	public void doFilter(ServletRequest request, ServletResponse response) {
		
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		chain.doFilter(request, response);
		
	}

}
