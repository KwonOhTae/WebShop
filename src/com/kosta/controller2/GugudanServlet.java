package com.kosta.controller2;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GugudanServlet
 */
@WebServlet("/day1018/gugu")
public class GugudanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public GugudanServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("gugudan.html");
		rd.forward(request, response);
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("post요청입니다.");
		String dan = request.getParameter("dan");
		request.setAttribute("message", dan + "단 구구단 출력");
		RequestDispatcher rd = request.getRequestDispatcher("gugudan.jsp");
		rd.forward(request, response);
	}

}
