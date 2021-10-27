package com.kosta.controller4;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kosta.model.MemberService;
import com.kosta.model.MemberVO;


@WebServlet("/html/loginpost")
public class LoginServlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	RequestDispatcher rd = request.getRequestDispatcher("login.html");
	rd.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		int user_id = Integer.parseInt(request.getParameter("user_id"));
		String user_pw = request.getParameter("user_pw");
		String phone = request.getParameter("phone");
		String address = request.getParameter("address");
		String email = request.getParameter("email");
		
		//id,pass가 맞는지? 맞으면 업무계속, 틀리면 로그인창 보여주기
		MemberService service = new MemberService();
		MemberVO member = service.loginChk(user_id, user_pw);
		if(member == null) {
			System.out.println("로그인실패");
			response.sendRedirect("loginpost");
		}else {
			HttpSession session = request.getSession();
			session.setAttribute("member", member);
			response.sendRedirect("../emp/emplist");
		}
	}

}
