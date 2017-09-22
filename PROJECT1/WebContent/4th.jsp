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
String S1=(String)session.getAttribute("xyz");
String S2=request.getParameter("username");
String S3=(String)session.getAttribute("abc");
String S4=request.getParameter("password");

if(S1.equals(S2) && S3.equals(S4))
{
	response.sendRedirect("5th.jsp");
}
else
{
	response.sendRedirect("3rd.jsp");
}
%>

</body>
</html>