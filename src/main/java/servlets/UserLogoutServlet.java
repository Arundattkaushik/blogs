package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import helpers.Message;

@WebServlet(name = "UserLogoutServlet", value = "/UserLogoutServlet")
public class UserLogoutServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		session.removeAttribute("currentUser");
		Message message = new Message("Logged out successfully!!", "success", "alert-success");
		session.setAttribute("msg", message);
		response.sendRedirect("login_page.jsp");
	}

	

}
