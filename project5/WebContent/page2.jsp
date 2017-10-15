<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c_rt" %>
<%@ taglib uri="http://java.sun.com/jstl/sql_rt" prefix="sql_rt"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c_rt:set var="firstname" value="${param.firstname}"> </c_rt:set>
	<c_rt:set var="lastname" value="${param.lastname}"> </c_rt:set>
	<c_rt:set var="username" value="${param.username}"> </c_rt:set>
	<c_rt:set var="pass" value="${param.pass}"> </c_rt:set>

	<c_rt:out value="${param.firstname}"></c_rt:out><br>
	<c_rt:out value="${param.lastname}"></c_rt:out><br>
	<c_rt:out value="${param.username}"></c_rt:out><br>
	<c_rt:out value="${param.pass}"></c_rt:out>

	<sql_rt:setDataSource var="connection" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost/test" password="root" user="root"/>
	
	<sql_rt:update dataSource="${connection}" var="count"> 
		INSERT INTO login(firstname,lastname,username,pass) values('${firstname}','${lastname}','${username}','${pass}');
	</sql_rt:update> 

</body>
</html>