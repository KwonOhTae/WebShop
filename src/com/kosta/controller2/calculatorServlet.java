package com.kosta.controller2;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/day1018/calc")
public class calculatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public calculatorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//page보여주기
		RequestDispatcher rd;
		rd = request.getRequestDispatcher("calculator.html");
		rd.forward(request, response);
	
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//계산하기
		System.out.println("post요청");
		String won = request.getParameter("won");
		String operator = request.getParameter("operator");
		
		double result = 0;
		if (operator.equals("dollar")) {
			result = Double.parseDouble(won) * 1.2;
		}else {
			result = Double.parseDouble(won) * 1.1;
		}
		request.setAttribute("won", won);
		request.setAttribute("result", result);
		
		RequestDispatcher rd;
		rd = request.getRequestDispatcher("claculatorResult.jsp");
		rd.forward(request, response);
	}

}
