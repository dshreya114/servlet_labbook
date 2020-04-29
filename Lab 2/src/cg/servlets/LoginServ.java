package cg.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class LoginServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("username");
		String pass = request.getParameter("password");

		if (username.equals("Shreya") && pass.equals("shreyadubey")) {
			response.sendRedirect("Success.jsp");
		} else {
			response.sendRedirect("LoginForm.jsp?invalid=true");
		}
	}

	
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
	}

}
