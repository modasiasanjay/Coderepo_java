<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
hiiiii

<br>
<% String S1=(String)session.getAttribute("pqr");
	out.println(S1);%>
	<br>
  <% String S2=(String)session.getAttribute("def");
    out.println(S2);%>
    
</body>
</html>