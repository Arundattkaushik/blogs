<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
<%@include file="bootstrap.jsp"%>
</head>
<body>
<%@include file="navbar.jsp" %>

	<main class="bg-primary" style="clip-path: polygon(50% 0%, 100% 0, 100% 91%, 65% 100%, 30% 95%, 0 100%, 0 0); height: 39rem">
		</br>
		<div class="col-md-4 offset-md-4">
			<div class="card ">
				<div class="card-header text-center">
					<span class="fa fa-user-plus fa fa-3x"></span>
					<p>Register</p>
				</div>

				<div class="card-body pb-1">
					<form action="registration" method="post" class="pb-2">
						<div class="form-group">
							<label for="exampleInputUserName" >User Name</label> 
							<input type="text" class="form-control" required="required" id="user_name" name="userName"
								aria-describedby="emailHelp" placeholder="Enter username">
						
							<label for="exampleInputEmail1" class="pt-3">Email address</label> 
							<input
								type="email" class="form-control" required="required" id="exampleInputEmail1" name="userEmail"
								aria-describedby="emailHelp" placeholder="Enter email">
							
						</div>
						<div class="form-group">
							<label for="exampleInputPassword1">Password</label>
							 <input
								type="password" class="form-control" required="required" id="exampleInputPassword1" name="userPassword"
								placeholder="Password">
								
							<label for="exampleInputPassword1" class="pt-3">Gender</label>
							</br>
							 <input type="radio" id="gender" required="required" name="userGender" value="male"> Male &nbsp
							 <input type="radio" id="gender" required="required" name="userGender" value="female"> Female
							 
						</div>
						<div class="form-check">
							<input type="checkbox" class="form-check-input" id="exampleCheck1" name="termsAndConditions"> 
								<label class="form-check-label" for="exampleCheck1">Agree terms and conditions</label>
						</div>
						</br>
						<button type="submit" class="btn btn-primary">Submit</button>
					</form>

				</div>
			</div>

		</div>
	</main>
</body>
</html>