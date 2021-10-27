package com.kosta.controller3;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kosta.model.EmpService;
import com.kosta.model.EmployeeVO;
import com.kosta.util.DateUtil;

/**
 * Servlet implementation class EmpDetailServlet
 */
@WebServlet("/emp/empdetail")
public class EmpDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//���� ���� �󼼺���
		
		//�α������� ������ ���� �Ұ�.
		HttpSession session = request.getSession();
		Object obj = session.getAttribute("member");
		if(obj == null) {
			System.out.println("�α������� ������ ���� �Ұ�");
			response.sendRedirect("../html/loginpost");
			return;
		}
		int empid = Integer.parseInt(request.getParameter("empid"));
		EmpService service = new EmpService();
		request.setAttribute("emp", service.selectByEmpid(empid));
		RequestDispatcher rd = request.getRequestDispatcher("empdetail.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmployeeVO emp = makeEmp(request);
		EmpService service = new EmpService();
		int result = service.empUpdate(emp);
//		request.setAttribute("message", result>0?"��������":"��������");
//		response.addHeader("refresh", "1;url=emplist");
//		RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
//		rd.forward(request, response);
		response.sendRedirect("emplist");//�ٽÿ�û�Ѵ�. ��û�������ϱ�
		//�������� �������� �ٽ� ������ ��û�Ѵ�. �ּ�â�� �ٲ��.
		//�������� ��û������...jsp�� forward
	}

	private EmployeeVO makeEmp(HttpServletRequest request) {
		int empid = Integer.parseInt(request.getParameter("employee_id"));
		String first_name = request.getParameter("first_name");
		String last_name = request.getParameter("last_name");
		int department_id = Integer.parseInt(request.getParameter("department_id"));
		String job_id = request.getParameter("job_id");
		String phone_number = request.getParameter("phone_number");
		String email = request.getParameter("email");
		int manager_id = Integer.parseInt(request.getParameter("manager_id"));
		double commission_pct = Double.parseDouble(request.getParameter("commission_pct"));
		int salary = Integer.parseInt(request.getParameter("salary"));
		Date hire_date = DateUtil.convertToDate(request.getParameter("hire_date"));
		EmployeeVO emp = new EmployeeVO();
		
		emp.setEmployee_id(empid);
		emp.setFirst_name(first_name);
		emp.setLast_name(last_name);
		emp.setDepartment_id(department_id);
		emp.setJob_id(job_id);
		emp.setPhone_number(phone_number);
		emp.setEmail(email);
		emp.setManager_id(manager_id);
		emp.setCommission_pct(commission_pct);
		emp.setSalary(salary);
		emp.setHire_date(hire_date);
		System.out.println(emp);
		return emp;
	}

}
