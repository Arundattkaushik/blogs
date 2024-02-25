package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import dao.UserDao;
import entities.User;
import helpers.ConnectionProvider;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "registration", value = "/registration")
public class UserRegistration extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher rDispatcher = req.getRequestDispatcher("registration_page.jsp");
		rDispatcher.include(req, resp);
		String name = req.getParameter("userName");
		String email = req.getParameter("userEmail");
		String password = req.getParameter("userPassword");
		String gender = req.getParameter("userGender");
		String termsAndConditions = req.getParameter("termsAndConditions");
		PrintWriter pWriter = resp.getWriter();
		
		User user = new User(name.trim(), email.trim(), password.trim(), gender);
		UserDao userDao = new UserDao(ConnectionProvider.getConnection());
		userDao.saveUser(user);	
		
		if(userDao.status) {
		pWriter.print("Hi "+name+" You have registered successfully!");				
		
		}
		else {
		pWriter.print("Something went wrong!");
		}
	}
}
