package com.yash.ems.Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.yash.ems.Domain.Enquiry;
import com.yash.ems.Domain.User;
import com.yash.ems.Service.UserServiceImplementation;
import com.yash.ems.Service.UserServiceImplementationInterface;

/**
 * Servlet implementation class DeleteServlet
 */
@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("enquireId");
		System.out.println(id);
		HttpSession session = request.getSession();
		User currentUser = (User) session.getAttribute("currentUser");
		UserServiceImplementationInterface userService = new UserServiceImplementation();
		List<Enquiry> users = userService.Delete(Integer.parseInt(id),
				currentUser);
		session.setAttribute("Entries", users);
		response.sendRedirect("User.jsp");
	}

}
