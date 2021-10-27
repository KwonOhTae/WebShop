<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    //scope: pagecontext(현재 페이지) < request(요청마다) < session(브라우저) < allication(웹프로그램)
    request.setAttribute("major", "JspServlet박사...request");
    session.setAttribute("major", "JspServlet박사...session");
    application.setAttribute("major", "JspServlet박사...application");
    pageContext.setAttribute("major", "JspServlet박사....pageContext");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>저장하기</h1>
<h2>default : ${major }</h2>
<h2>pageContext : ${pageScope.major }</h2>
<h2>request : ${requestScope.major }</h2>
<h2>session : ${sessionScope.major }</h2>
<h2>application : ${applicationScope.major }</h2>
<hr>
<%-- <jsp:forward page="scopeTest2.jsp"></jsp:forward> --%>
<!-- 갔다가 다시 온다. include -->
<jsp:include page="scopeTest2.jsp"></jsp:include>
</body>
</html>