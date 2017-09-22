<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% 
String S1=request.getParameter("firstname");
 String S2=request.getParameter("lastname");
 String S3=request.getParameter("username");
 String S4=request.getParameter("password");

 session.setAttribute("pqr", S1);
 session.setAttribute("def", S2);
 session.setAttribute("xyz", S3);
session.setAttribute("abc", S4); %>

<% response.sendRedirect("3rd.jsp");%>
</body>
</html>