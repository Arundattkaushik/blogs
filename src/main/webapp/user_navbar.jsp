<%@page import="entities.User"%>
<link rel="stylesheet" href="css/navbar.css">
<%
User u = (User)session.getAttribute("currentUser");
%>

<nav class="navbar navbar-expand-lg navbar-light bg-primary">
  <a class="navbar-brand text-light" href="index.jsp"><span class="fa fa-asterisk"></span>Techblog</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle text-white" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Categories
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
          <a class="dropdown-item" href="#">Programming Language</a>
          <a class="dropdown-item" href="#">Daily Comments</a>
          <div class="dropdown-divider"></div>
          <a class="dropdown-item" href="#">Data Structure</a>
        </div>
      </li>
      <li>
        <a class="nav-link text-white" href="#">Contact Us</a>
      </li>
    </ul>
    <form class="form-inline my-2 my-lg-0">
       	<a class="nav-link text-white" href="login_page.jsp"><span class="fa fa-user-plus m-1"></span><%=u.getUserName() %></a>
      	<a class="nav-link text-white" href="UserLogoutServlet"><span class="fa fa-user-plus m-1"></span>Logout</a>
      	
    </form>
  </div>
</nav>