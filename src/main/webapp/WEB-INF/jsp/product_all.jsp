<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1> This is all products</h1>
	<c:forEach items="${products}" var = "product">
		<div>
			<p>Name : ${product.name } </p>
			<p>Price : ${product.price } </p>
			<p>Seller : ${product.seller } </p>
		</div>
	</c:forEach>
</body>
</html>