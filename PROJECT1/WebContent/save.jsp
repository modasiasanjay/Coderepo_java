<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
fn<input type="text" name="firstname" value="<% 
String S1=request.getParameter("firstname");
out.println(S1);%>">
<br>
ln<input type="text" name="lastname">
<% String S2=request.getParameter("lastname");
out.println(S2);%><br>
<% String S3=request.getParameter("username");
out.println(S3);%><br>
<% String S4=request.getParameter("password");
out.println(S4);
%>


</body>
</html>