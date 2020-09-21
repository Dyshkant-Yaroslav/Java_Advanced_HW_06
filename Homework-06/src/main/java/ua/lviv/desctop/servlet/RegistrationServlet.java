package ua.lviv.desctop.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ua.lviv.desctop.domain.User;
import ua.lviv.desctop.domain.UserRole;
import ua.lviv.desctop.service.UserService;
import ua.lviv.desctop.service.impl.UserServiceImpl;



public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserService userService = UserServiceImpl.getUserService();

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		if (!email.isEmpty() && !firstName.isEmpty() && !lastName.isEmpty() && !password.isEmpty()) {
			
			userService.create(new User( email,firstName, lastName, UserRole.USER.toString(), password));
		}
		request.setAttribute("userEmail", email);
		request.getRequestDispatcher("cabinet.jsp").forward(request, response);
	}

}
