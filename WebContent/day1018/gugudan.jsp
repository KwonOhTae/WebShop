<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>${message}</h1>
<%
String dan = request.getParameter("dan");
int idan = Integer.parseInt(dan);
out.print("<table border=1>");
for(int gop = 1 ; gop<=10 ; gop++){
	out.print("<tr><td>"+ idan + " * "+ gop + " = "+ idan*gop + "</td></tr>");
}
out.print("</table>");
%>
</body>
</html>