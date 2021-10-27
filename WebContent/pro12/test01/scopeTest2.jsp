<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>읽기</h1>
<h2>default : ${major }</h2>
<h2>pageContext : ${pageScope.major }</h2>
<h2>request : ${requestScope.major }</h2>
<h2>session : ${sessionScope.major }</h2>
<h2>application : ${applicationScope.major }</h2>
</body>
</html>