package com.yash.ems.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yash.ems.Domain.User;
import com.yash.ems.Service.UserServiceImplementation;
import com.yash.ems.Service.UserServiceImplementationInterface;

/**
 * Servlet implementation class RegestrationActionServlet
 */
@WebServlet("/RegestrationActionServlet")
public class RegestrationActionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		User user = new User();
		user.setName(request.getParameter("name"));
		user.setEmail(request.getParameter("email"));
		user.setType(Integer.parseInt(request.getParameter("type")));
		user.setUserName(request.getParameter("userName"));
		user.setPassword(request.getParameter("password"));
		UserServiceImplementationInterface userService = new UserServiceImplementation();
		userService.register(user);
		response.sendRedirect("index.jsp");
	}

}
