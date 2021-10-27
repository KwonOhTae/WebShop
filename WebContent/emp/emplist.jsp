<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%
//EL문법 ===> ${emplist} 
		//ScriptLet문법 (List<EmployeeVO>)request.getAttribute("emplist")
		//JSTL문법  ==> tag를 이용한 자바스크립트 사용 <forEach items="${ }"></forEach> 
%>
<!-- script : 가장 오래된 문법 (%= 출력) -->
<body>
	<h1>직원목록...scriptLet, EL문법, JSTL문법(looping)</h1>
	<a href="empinsert">신규직원등록</a><br><br>
	<!-- JSP가 합쳐져서 컴파일된다. -->
	<%@ include file="logininfo.jsp" %>
	<h3>${member }</h3>
	<h3>${member.mname }님 환영합니다.</h3>
	<h3>${param.message}</h3>
	<h1>request:${data1}</h1>
<h1>session:${data2}</h1>
<h1>application:${data3}</h1>
	<!-- $ :  -->
	<table border="1">
		<tr>
			<td>직원 번호</td>
			<td>성</td>
			<td>이름</td>
			<td>부서</td>
			<td>직책</td>
			<td>전화번호</td>
			<td>E메일</td>
			<td>메니져</td>
			<td>커미션</td>
			<td>급여</td>
			<td>입사일</td>
			<td>삭제</td>
		</tr>
		<c:forEach items="${emplist}" var="emp">
			<tr>
				<td><a href="empdetail?empid=${emp.employee_id }">${emp.employee_id }</a></td>
				<td>${emp.first_name }</td>
				<td>${emp.last_name }</td>
				<td>${emp.department_id }</td>
				<td>${emp.job_id }</td>
				<td>${emp.phone_number }</td>
				<td>${emp.email}</td>
				<td>${emp.manager_id }</td>
				<td>${emp.commission_pct }</td>
				<td>${emp.salary }</td>
				<td>${emp.hire_date }</td>
				<td><button onclick="call(${emp.employee_id })">삭제하기</button></td>
			</tr>
		</c:forEach>

	</table>
	<script>
	function call(empid){
		location.href = "empdelete?empid=" + empid;
	}</script>
</body>
</html>