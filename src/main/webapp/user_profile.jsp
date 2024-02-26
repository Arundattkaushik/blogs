<%@page import="entities.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page errorPage="error_page.jsp" %>
<%
User user = (User)session.getAttribute("currentUser");

if(user==null){
	response.sendRedirect("login_page.jsp");	
};
%>

<!DOCTYPE html>
<html>
<head>
<%@include file="bootstrap.jsp" %>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
<%@include file="user_navbar.jsp" %>

<h1>Hi <%=user.getUserName() %> welcome to profile page</h1>
</body>
</html>