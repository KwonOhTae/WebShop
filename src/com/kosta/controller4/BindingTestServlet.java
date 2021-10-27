package com.kosta.controller4;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/*
 * 바인딩 : 서블릿관련 개게에 데이터를 저장
 * application(웹프로그램당) ... ServletContext 객체 ... 서버가 살아있는 동안 유효하다.
 * session(Browse당) ... HttpSession객체 ... Browser가 살아있는 동안 유효하다.
 * request(요청문서) ... HttpServletRequest ... request가 살아있는 동안 유효하다.
 * */
@WebServlet("/bind")
public class BindingTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public BindingTestServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	HttpSession session = request.getSession();
	ServletContext application = getServletContext();
	request.setAttribute("data1", "오태request");
	session.setAttribute("data2", "오태session");
	application.setAttribute("data3", "오태application");
	//2. 요청미전달 .. 다른 요청으로 바뀐다.
	//수정후 다시 조회, 삭제후 다시 조회, 입력후 다시 보여주기
	//response.sendRedirect("emp/emplist");
	//1. 요청전달...view와 연결 하기
	//조회후 보여주기, 입력창 보여주기, 상세보기 보여주기
	
	RequestDispatcher rd = request.getRequestDispatcher("jsp/bindtest.jsp");
	rd.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
