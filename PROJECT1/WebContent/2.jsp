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

String S1=(String)request.getAttribute("abc");
out.println(S1);
String S2=(String)session.getAttribute("xyz");
out.println(S2);
session.removeAttribute("xyz"); 
String S3=(String)application.getAttribute("pqr");
out.println(S3); 

/* response.sendRedirect("3.jsp"); */
%>

<a href="3.jsp">click to request</a> 
</body>
</html>