<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Update User Profile</h1>
	<table>
		<sf:form action="updateAction" modelAttribute="my">
			<tr>
				<td>User Id:<sf:input path="userId" readonly="true" />
			<tr>
				<td>First Name:<sf:input path="firstName" />
			<tr>
				<td>Last Name:<sf:input path="lastName" />
			<tr>
				<td>Phone No.:<sf:input path="phoneNo" />
			<tr>
				<td>Email Id:<sf:input path="emailId" />
			<tr>
				<td>Password:<sf:input path="password" />
			<tr>
				<td><input type="submit" value="Update">
		</sf:form>
	</table>
</body>
</html>