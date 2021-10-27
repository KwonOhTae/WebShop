package com.kosta.controller;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
//이 부분이 수정됨.
@WebServlet({ "/FirstServlet", "/first", "/monday/one" })
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public FirstServlet() {
       System.out.println("FirstServlet 생성자");
    }

	public void init(ServletConfig config) throws ServletException {
		System.out.println("FirstServlet init(초기화)");
	}

	public void destroy() {
		System.out.println("FirstServlet 소멸");
	}

//	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println("FirstServlet Service");
//	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("myname");
		
		System.out.println("FirstServlet doGet..." + name);
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		response.getWriter().append("Served at: ").append(request.getContextPath()).append("<h1>"+ name + "</h1>");
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("FirstServlet doPost");
	}

}
