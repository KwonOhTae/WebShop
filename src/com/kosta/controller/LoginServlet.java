package com.kosta.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/html/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("user_id");
		String pw = request.getParameter("user_pw");
		System.out.println(id+"/"+pw);
		PrintWriter out = response.getWriter();
		//getWriter가 document이다 웹브라우저에 표현 하는 방법
		out.print("<p>"+ "id=" + id +"</p>");
		out.print("<p>"+ "pw=" + pw +"</p>");
	
	}

	


}
