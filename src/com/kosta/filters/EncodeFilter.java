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
    	System.out.println("encodefilter ������");
    }

	
	public void destroy() {
		System.out.println("Encodefilter destroy");
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// ��û���� �� 
		long start = System.currentTimeMillis();
		System.out.println("��û���� ��");
		request.setCharacterEncoding("utf-8");
		// 
		chain.doFilter(request, response);
		// �����ϱ� ��
		long end = System.currentTimeMillis();
		System.out.println("���䰡�� ��: ��ûó�� �ҿ�ð��� "+ (end - start) +"ms");
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
