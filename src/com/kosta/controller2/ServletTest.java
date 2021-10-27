package com.kosta.controller2;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//여러개로 요청이 가능할때, 배열로 나타내기
@WebServlet({"/stest", "/stest2"})
public class ServletTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String myname = request.getParameter("myname");
		System.out.println(myname);
	request.setAttribute("alias","찔레");	
	RequestDispatcher rd;
	rd = request.getRequestDispatcher("jsp/jspTest.jsp");
	rd.forward(request, response);
	
	
	
	
	
	}

}
