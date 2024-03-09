package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpRequest;
import java.sql.Timestamp;

import dao.PostDao;
import entities.Posts;
import entities.User;
import helpers.ConnectionProvider;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(name = "addnewpost", value = "/addnewpost")
@MultipartConfig
public class Addpostservlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Posts posts = new Posts();
		PostDao postDao = new PostDao(ConnectionProvider.getConnection());
		HttpSession session = req.getSession();
		User user = (User)session.getAttribute("currentUser");
		String email = user.getUserEmail();
		

		posts.setpContent(req.getParameter("post-content"));
		posts.setPcode(req.getParameter("post-code"));
		posts.setCatid(0);
		posts.setPtitle(req.getParameter("post-title"));
		posts.setPpic(req.getParameter("post-pic"));
		posts.setCategory(req.getParameter("category"));
		posts.setUserId(email);
		postDao.savePost(posts);
		resp.sendRedirect("user_profile.jsp");
	}
	
}
