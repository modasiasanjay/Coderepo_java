<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="ControllerFile" method="post">
	<input type="hidden" name="flag" value="state">
	CountryName<select name="CountryId">
				<c_rt:forEach items="${sessionScope.data}" var="a">
				<option value="${a.cid}">${a.countryName}</option>
			</c_rt:forEach>
	</select><br>
	StateName<input type="text" name="StateName"><br>
	StateDescription<input type="text" name="StateDescription"><br>
	<input type="submit" value="save">

</form>

</body>
</html>