<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form action="product" modelAttribute="product" method="POST">

		<tr>
			<td>Product ID</td>
			<td><form:input path="productId" /></td>
		</tr>
		<tr>
			<td>Product Name</td>
			<td><form:input path="productName" /></td>
		</tr>
		<tr>
			<td>Product Price</td>
			<td><form:input path="productPrice" /></td>
		</tr>
		
		<tr>
		<td><input type="submit" value="Submit"></tr>
	</form:form>
</body>
</html>