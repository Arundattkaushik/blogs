<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Error</title>
<%@include file="bootstrap.jsp" %>
</head>
<body class="text-warning">
<div class="container text-center">
<img src="D:\projects\tech-blog\tech-blog\img\error-905.svg" class="img-fluid">
<h1>Oops! Something went wrong</h1>
<p class="text-bold">Please try again!</p>
<%= exception %>
<a  href="index.jsp">Back to home page</a>
</div>
</body>
</html>