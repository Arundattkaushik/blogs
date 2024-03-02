
<%@page import="entities.User"%>
<%@page import="helpers.Message"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%

%>

<meta charset="UTF-8">
<%@ include file="bootstrap.jsp"%>
<title>Login</title>
</head>
<body>
<%@include file="navbar.jsp" %>


	<!-- Form Area -->
	<main class="d-flex align-items-center bg-primary" style="clip-path: polygon(50% 0%, 100% 0, 100% 85%, 65% 100%, 37% 94%, 0 100%, 0 0);">
	<br/>	
		<div class="container" style="height: 35rem;">
		</br></br>
			<div class="row">
				<div class="col-md-4 offset-md-4">
					<div class="card" style="width: 25rem; ">
						<div class="header text-center font-weight-bold bg-light">
						<br>
						<span class="fa fa-user-circle fa-3x"></span>
							<p>Login here</p>
						</div>
						<%
							Message msg = (Message)session.getAttribute("msg");
							if(msg!=null){
								%>
								<div class="alert <%=msg.getMsgCss() %>" role="alert">
								 <%=msg.getMsgContent() %>
								</div>
								<%
								session.removeAttribute("msg");
							}
						%>

						<div class="card-body">
							<form action="UserLogin" method="post">
								<div class="mb-3">
									<label for="exampleInputEmail1" class="form-label">Email address</label> 
									<input type="email" name="email" required="required" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
								</div>
								<div class="mb-3">
									<label for="exampleInputPassword1" class="form-label">Password</label>
									<input type="password" required="required" class="form-control"
										name="password" id="exampleInputPassword1">
								</div>
								<div class="container text-center pt-2">
								<button type="submit" class="btn btn-primary">Submit</button>
								</div>
								
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</main>
</body>
</html>