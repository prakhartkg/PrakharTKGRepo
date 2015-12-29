package com.yash.ems.Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yash.ems.Domain.Enquiry;
import com.yash.ems.Domain.User;
import com.yash.ems.Service.UserServiceImplementation;
import com.yash.ems.Service.UserServiceImplementationInterface;

/**
 * Servlet implementation class AddServlet
 */
@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String contact = request.getParameter("contact");
		String[] courses = request.getParameterValues("course");
		User user = (User) request.getSession().getAttribute("currentUser");
		UserServiceImplementationInterface userService = new UserServiceImplementation();
		String course = String.join(",", courses);
		System.out.println(course);
		List<Enquiry> enquiries = null;
		enquiries = userService.AddEnquiry(name, email, contact, user, course);
		request.getSession().setAttribute("Entries", enquiries);
		response.sendRedirect("User.jsp");
	}

}
