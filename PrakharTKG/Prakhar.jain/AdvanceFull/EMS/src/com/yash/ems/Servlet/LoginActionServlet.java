package com.yash.ems.Servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionBindingListener;

import com.yash.ems.Domain.Enquiry;
import com.yash.ems.Domain.User;
import com.yash.ems.Service.UserServiceImplementation;
import com.yash.ems.Service.UserServiceImplementationInterface;

/**
 * Servlet implementation class LoginActionServlet
 */
@WebServlet("/LoginActionServlet")
public class LoginActionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		UserServiceImplementationInterface userService = new UserServiceImplementation();
		User user = (User) userService.authentication(userName, password);
		System.out.println(user);
		if (user != null) {
			HttpSession session = request.getSession();
			session.setAttribute("currentUser", user);
			if (user.getType() == 2 && user.getStatus() == 1)
				request.getRequestDispatcher("Admin.jsp").forward(request,
						response);
			else {
				try {
					List<Enquiry> enquiries = userService.getEnquries(user);
					session.setAttribute("Entries", enquiries);
				} catch (SQLException e) {
					e.printStackTrace();
				}

				request.getRequestDispatcher("User.jsp").forward(request,
						response);
			}
		} else {
			request.getRequestDispatcher("index.jsp")
					.forward(request, response);
		}

	}

}
