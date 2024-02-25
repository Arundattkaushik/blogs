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

@WebServlet(name = "UserLogin", value = "/UserLogin")
public class UserLogin extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		RequestDispatcher rd = request.getRequestDispatcher("login_page.jsp");
		PrintWriter pWriter = response.getWriter();
		
		UserDao dao = new UserDao(ConnectionProvider.getConnection());
		User user = dao.getUserByEmailAndPassword(request.getParameter("email"), request.getParameter("password"));
		if (user==null) {
			rd.include(request, response);
			pWriter.print("Incorrect email or password");
			response.sendRedirect("login_page.jsp");
		}
		else {
			HttpSession session = request.getSession();
			session.setAttribute("currentUser", user);
			response.sendRedirect("user_profile.jsp");
			System.out.println("you have logged in successfully");
		}
	}

}
