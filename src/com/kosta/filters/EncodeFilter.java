package com.kosta.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;


@WebFilter("/*")
public class EncodeFilter implements Filter {

  
    public EncodeFilter() {
    	System.out.println("encodefilter 생성자");
    }

	
	public void destroy() {
		System.out.println("Encodefilter destroy");
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// 요청가기 전 
		long start = System.currentTimeMillis();
		System.out.println("요청가기 전");
		request.setCharacterEncoding("utf-8");
		// 
		chain.doFilter(request, response);
		// 응답하기 전
		long end = System.currentTimeMillis();
		System.out.println("응답가기 전: 요청처리 소요시간은 "+ (end - start) +"ms");
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
