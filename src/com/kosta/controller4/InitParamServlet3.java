package com.kosta.controller4;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//어너테이션을 지우고, web.xml 설정으로 내용을 불러드림.
public class InitParamServlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	String tel = getInitParameter("tel");
	String adress = getInitParameter("adress");
	
	System.out.println(tel);
	System.out.println(adress);
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
