<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="index.jsp">Click Here to Go to Home Page</a>
	<h1>List of WishList items:</h1>
	<table border="2">
		<tr>
			<th>Order Id
			<th>Product Id
			 
			<c:forEach items="${list}" var="wish">
					<tr>
						<td>${wish.userId }
						<td>${wish.productId }
						
				</c:forEach>
	</table>
</body>
</html>