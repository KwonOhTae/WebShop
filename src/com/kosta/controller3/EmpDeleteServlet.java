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
		//���� ���� ����
		int empid = Integer.parseInt(request.getParameter("empid"));
		EmpService service = new EmpService();
		int result = service.empDelete(empid);
		String message = result>0?"�輼����":"��������";
		//2.sendRedirect
		//�ѱ� encoding�ʿ�
		response.sendRedirect("emplist?message="+message);

//		1. dispatcher
//		request.setAttribute("message", service.empDelete(empid)>0?"��������":"��������");
//		RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
//		rd.forward(request, response);
	}

}