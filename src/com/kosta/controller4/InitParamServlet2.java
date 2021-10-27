package com.kosta.controller4;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet( urlPatterns = { "/InitParamServlet2"},
			initParams = {@WebInitParam(name = "tel", value = "010-1234-5678"),
						  @WebInitParam(name = "adress", value = "kimpo")	}	
		)
public class InitParamServlet2 extends HttpServlet {
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
