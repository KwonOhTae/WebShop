package com.kosta.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet2
 */
@WebServlet("/login5")
public class LoginServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public LoginServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("user_id");
		String pw = request.getParameter("user_pw");
		String ad = request.getParameter("user_address");
		System.out.println("id = "+id + " / " + "pw = "+ pw + " / " + "address = " + ad);
		
		//��û �߰� setAttribute
		request.setAttribute("major", "�İ�");
		request.setAttribute("phone", "010-1111-2222");
		//��û ������...�ּ�â�� �ٲ��� �ʰ� ���޹��� ��û�� ���������� �ٸ������� �����Ѵ�.
		RequestDispatcher rd = 
				request.getRequestDispatcher("jsp/result.jsp");
		
		rd.forward(request, response);
		
	}

}
