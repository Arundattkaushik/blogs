<%@page import="entities.Categories"%>
<%@page import="java.util.ArrayList"%>
<%@page import="helpers.ConnectionProvider"%>
<%@page import="java.sql.Connection"%>
<%@page import="dao.PostDao"%>
<%@page import="entities.User"%>
<%@include file="bootstrap.jsp"%>
<%
User u = (User) session.getAttribute("currentUser");
%>

<nav class="navbar navbar-expand-lg navbar-light bg-primary">
	<a class="navbar-brand text-light" href="index.jsp"><span
		class="fa fa-asterisk mr-2"></span>Techblog</a>
	<button class="navbar-toggler" type="button" data-toggle="collapse"
		data-target="#navbarSupportedContent"
		aria-controls="navbarSupportedContent" aria-expanded="false"
		aria-label="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
	</button>

	<div class="collapse navbar-collapse" id="navbarSupportedContent">
		<ul class="navbar-nav mr-auto">
			<li class="nav-item dropdown"><a
				class="nav-link dropdown-toggle text-white" href="#"
				id="navbarDropdown" role="button" data-toggle="dropdown"
				aria-haspopup="true" aria-expanded="false"> Categories </a>
				<div class="dropdown-menu" aria-labelledby="navbarDropdown">
					<a class="dropdown-item" href="#">Programming Language</a> <a
						class="dropdown-item" href="#">Daily Comments</a>
					<div class="dropdown-divider"></div>
					<a class="dropdown-item" href="#">Data Structure</a>
				</div></li>
			<li><a class="nav-link text-white" href="#">Contact Us</a></li>

			<li><a class="nav-link text-white" href="#" data-toggle="modal"
				data-target="#addnewpost"><i class="fa fa-solid fa-plus mr-2"></i></span>Create
					Post</a></li>

		</ul>
		<form class="form-inline my-2 my-lg-0">
			<a class="nav-link text-white" href="login_page.jsp"
				data-toggle="modal" data-target="#exampleModalCenter"><span
				class="fa fa-user-plus m-1"></span><%=u.getUserName()%></a> <a
				class="nav-link text-white" href="UserLogoutServlet"><span
				class="fa fa-user-plus m-1"></span>Logout</a>
		</form>
	</div>


	<!-- Modal start here -->
	<div class="modal fade" id="exampleModalCenter" tabindex="-1"
		role="dialog" aria-labelledby="exampleModalCenterTitle"
		aria-hidden="true">
		<div class="modal-dialog modal-dialog-centered" role="document">
			<div class="modal-content">


				<div class="modal-header bg-primary text-white">
					<h5 class="modal-title" id="exampleModalLongTitle">Edit
						details</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">

					<div class="container">
						<table class="table">
							<tbody>
								<tr>
									<th scope="row">ID:</th>
									<td><%=u.getUserId()%></td>
								</tr>
								<tr>
									<th scope="row">Name:</th>
									<td><%=u.getUserName()%></td>
								</tr>
								<tr>
									<th scope="row">Email:</th>
									<td><%=u.getUserEmail()%></td>
								</tr>

								<tr>
									<th scope="row">Gender:</th>
									<td><%=u.getUserGender()%></td>
								</tr>

								<tr>
									<th scope="row">DOJ:</th>
									<td><%=u.getCreateTime()%></td>
								</tr>
							</tbody>
						</table>

					</div>

				</div>

				<div class="modal-footer">
					<button type="button" class="btn btn-secondary"
						data-dismiss="modal">Close</button>
					<button type="button" class="btn btn-primary">Save changes</button>
				</div>
			</div>
		</div>
	</div>

	<!-- Profile Model Ends here -->

	<!-- Post Model Starts -->
	<div class="modal fade" id="addnewpost" tabindex="-1" role="dialog"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">New Post</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>


				<div class="modal-body">

					<form action="addnewpost" method="post" id="add-post-form">
						<div class="form-group">
							<select class="form-control" id="cid" name="category">
								<option selected disbled>---Select a category---</option>
								<%
								new PostDao(ConnectionProvider.getConnection());
								ArrayList<Categories> list = PostDao.getAllCategories();
								for (Categories c : list) {
								%>
								<option value="<%=c.getName()%>"><%=c.getName()%></option>
								<%
								}
								%>
							</select>
						</div>
						<br>

						<div class="form-group">
							<input name="post-title" type="text" placeholder="Post title"
								class="form-control">
						</div>

						<div class="form-group">
							<textarea name="post-content" style="height: 200px"
								class="form-control"
								placeholder="write post content here......."></textarea>
						</div>

						<div>
							<textarea name="post-code" class="form-control"
								placeholder="Post Code"></textarea>
						</div>
						<br>
						<div>
							<input name="post-pic" type="file">
						</div>

						<div class="modal-footer">
							<button type="submit" class="btn btn-secondary">Post</button>
						</div>

					</form>

				</div>



			</div>
		</div>
	</div>
	<!-- Post Model Ends here -->
</nav>