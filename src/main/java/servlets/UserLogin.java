package servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

import dao.UserDao;
import entities.User;
import helpers.ConnectionProvider;
import helpers.Message;

@WebServlet(name = "UserLogin", value = "/UserLogin")
public class UserLogin extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pWriter = response.getWriter();
		
		UserDao dao = new UserDao(ConnectionProvider.getConnection());
		User user = dao.getUserByEmailAndPassword(request.getParameter("email"), request.getParameter("password"));
		if (user==null) {
			Message m = new Message("Incorrect email or password", "Error!", "alert-danger");
			HttpSession session = request.getSession();
			session.setAttribute("msg", m);
			//System.out.println(m.getMsgContent());
			response.sendRedirect("login_page.jsp");
		}
		else {
			HttpSession session = request.getSession();
			session.setAttribute("currentUser", user);
			response.sendRedirect("user_profile.jsp");
		}
	}

}
