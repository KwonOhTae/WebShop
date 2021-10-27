package com.kosta.controller3;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kosta.model.EmpService;


@WebServlet("/emp/empdelete")
public class EmpDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//직원 정보 삭제
		int empid = Integer.parseInt(request.getParameter("empid"));
		EmpService service = new EmpService();
		int result = service.empDelete(empid);
		String message = result>0?"삭세성공":"삭제실패";
		//2.sendRedirect
		//한글 encoding필요
		response.sendRedirect("emplist?message="+message);

//		1. dispatcher
//		request.setAttribute("message", service.empDelete(empid)>0?"삭제성공":"삭제실패");
//		RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
//		rd.forward(request, response);
	}

}
