package com.kosta.model;

import java.util.List;

//사용자요청-->Controller-->Service--->DAO-->DB
//Service:하나의 업무단위 (예, 이체하기(출금,입금), 상품입고하기(입고insert,재고update)
public class EmpService {
    EmpDAO dao = new EmpDAO();  
    public int empDelete(int empid) {
		return dao.empDelete(empid);
	}
   
    public int empUpdate(EmployeeVO emp) {
		return dao.empUpdate2(emp);
	}   
    public int empInsert(EmployeeVO emp) {
    	return dao.empInsert(emp);
    }
 
    //dao에 가지않을수도있다.
    public void test() {
    	System.out.println("db에 가지않아도 되는 Business logic작성");
    }
    //dao에 여러작업을 호출할수도 있다. 
	public void 이체하기() {
		dao.withdraw();
		dao.deposit();
	}
	//dao에 가서 수행하고 받은 값을 Controller에게 보낸다.  
	public List<EmployeeVO> selectAll() {
		return dao.selectAll();
	}
	public List<EmployeeVO> selectById(int deptid) {
		return dao.selectById(deptid);
	}
	public List<EmployeeVO> selectBySalary(int salary) {
		return dao.selectBySalary(salary);
	}
	public List<EmployeeVO> selectByJob(String job) {
		return dao.selectByJob(job);
	}
	public List<EmployeeVO> selectByCondition(int deptid, String job, int sal, String hdate) {
		return dao.selectByCondition(deptid, job, sal, hdate);
	}

	public Object selectByEmpid(int empid) {
		return dao.selectByEmpid(empid);
	}

	public List<EmployeeVO> selectAllManager() {
		return dao.selectAllManager();
	}
	
}




