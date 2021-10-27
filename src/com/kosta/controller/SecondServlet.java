package com.kosta.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondServlet
 */
@WebServlet("/html/getpost")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("get요청 입니다.");
		getData(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Post요청 입니다.");
		request.setCharacterEncoding("utf-8");
		getData(request, response);
	}
	private void getData(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String id = request.getParameter("user_id");
		String pw = request.getParameter("user_pw");
		String[] subjects = request.getParameterValues("subject");
		System.out.println("id = "+ id);
		System.out.println("pw = "+ pw);
		String str ="";
		for (String sub : subjects) {
			System.out.println("subject = "+ sub);
			str += "<p>subject = " + sub + "</p>";
		}
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		//getWriter가 document이다 웹브라우저에 표현 하는 방법
		out.print("<p>"+ "id=" + id +"</p>");
		out.print("<p>"+ "pw=" + pw +"</p>");
		out.print(str);
	}

}
