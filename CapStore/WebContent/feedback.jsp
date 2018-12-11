<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="for" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>feedBack form</title>
</head>
<body>

	<h1>Feedback Form:</h1>

	<for:form method="post" action="insertfeedback" modelAttribute="my">
		<table>
			<tr>
				<td>UserId:</td>
				<td><for:input path="userId" /></td>
				<td><for:errors path="userId"></for:errors></td>
			</tr>

			<tr>
				<td>OrderId:</td>
				<td><for:input path="orderId" /></td>
				<td><for:errors path="orderId"></for:errors></td>
			</tr>

			<tr>
				<td>ProductId:</td>
				<td><for:input path="productId" /></td>
				<td><for:errors path="productId"></for:errors></td>
			</tr>

			<tr>
				<td>Comment:</td>
				<td><for:input path="comment" /></td>
				<td><for:errors path="comment"></for:errors></td>
			</tr>

			<tr>
				<td>Rating:</td>
				<td><for:input path="rating" /></td>
				<td><for:errors path="rating"></for:errors></td>
			</tr>

			<tr>
				<td><input type="submit" value="Add Feedback" /></td>
			</tr>

		</table>
	</for:form>
</body>
</html>