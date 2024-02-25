<%@page import="helpers.ConnectionProvider"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import ="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@ include file="bootstrap.jsp" %>
<style>
	.clip-path{
	clip-path: polygon(50% 0%, 100% 0, 100% 85%, 65% 100%, 37% 94%, 0 100%, 0 0);
	}
</style>
<title>Home</title>
</head>
<body class="body">
<%@include file="navbar.jsp" %>
<!-- <%= ConnectionProvider.getConnection()%> -->
<!-- <%=ConnectionProvider.connectionStatus %> -->

<!-- Banner -->
<div class="container-fluid p-0 m-0 ">
	<div class="jambotron bg-primary text-white	clip-path">
	<div class="container">
		<h3 class="display-4">Welcome to Techblog</h3>
		<p class="text-justify">The term computer language is sometimes used interchangeably with programming language. However, the usage of both terms varies among authors, including the exact scope of each. One usage describes programming languages as a subset of computer languages. Similarly, languages used in computing that have a different goal than expressing computer programs are generically designated computer languages.</p>
		<button class="btn btn-outline-light mb-4"><span class="fa fa-external-link mt-2 mr-1"></span>Start! Its Free</button>
		<button class="btn btn-outline-light mb-4"><span class="fa fa-user-circle m-1"></span>Login</button>
	</div>	
	</div>
</div>
<br>
<!-- Page Content -->
<div class="container">
	<div class="row mb-3">
			<div class="col-md-4">
				<div class="card">
			  		<div class="card-body">
					    <h5 class="card-title">Java</h5>
					    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
					    <a href="#" class="btn btn-primary text-white">Read more</a>  
			  		</div>
				</div>
			
			</div>
			
			<div class="col-md-4">
				<div class="card">
			  		<div class="card-body">
					    <h5 class="card-title">Java</h5>
					    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
					    <a href="#" class="btn btn-primary text-white">Read more</a>  
			  		</div>
				</div>
			
			</div>
			
			<div class="col-md-4">
				<div class="card">
			  		<div class="card-body">
					    <h5 class="card-title">Java</h5>
					    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
					    <a href="#" class="btn btn-primary text-white">Read more</a>  
			  		</div>
				</div>
			
			</div>
	</div>
	
	<div class="row">
		<div class="col-md-4">
			<div class="card">
			  		<div class="card-body">
					    <h5 class="card-title">Java</h5>
					    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
					    <a href="#" class="btn btn-primary text-white">Read more</a>  
			  		</div>						
			</div>
		</div>
		
		<div class="col-md-4">
			<div class="card">
			  		<div class="card-body">
					    <h5 class="card-title">Java</h5>
					    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
					    <a href="#" class="btn btn-primary text-white">Read more</a>  
			  		</div>						
			</div>
		</div>
		
		<div class="col-md-4">
			<div class="card">
			  		<div class="card-body">
					    <h5 class="card-title">Java</h5>
					    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
					    <a href="#" class="btn btn-primary text-white">Read more</a>  
			  		</div>						
			</div>
		</div>

	</div>
 

 
 <!--Scripts-->
</body>
</html>