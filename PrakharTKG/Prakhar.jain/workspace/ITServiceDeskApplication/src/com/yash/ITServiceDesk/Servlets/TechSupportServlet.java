package com.yash.ITServiceDesk.Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.yash.ITServiceDesk.DAO.ITServiceDeskDAO;

@WebServlet("/TechSupportServlet")
public class TechSupportServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String userId = request.getParameter("userId");
		String software = request.getParameter("software");
		String os = request.getParameter("os");
		String description = request.getParameter("description");
		HttpSession session = request.getSession();
		session.setAttribute("userId", userId);
		session.setAttribute("software", software);
		session.setAttribute("os", os);
		session.setAttribute("description", description);
		String id = ITServiceDeskDAO.checkUser(userId);
		
		ServletContext application = application = getServletContext();
		if (id!=null) {
			String sql1="INSERT INTO PROBLEM VALUES('"+userId+"','"+os+"','"+software+"','"+description+"')";
			ITServiceDeskDAO.update(sql1);
			RequestDispatcher dispatcher = application
					.getRequestDispatcher("/ResponseServlet");
			dispatcher.forward(request, response);
		} 
		else{
			RequestDispatcher dispatcher = application.getRequestDispatcher("/RegisterServlet");
			dispatcher.forward(request, response);
		}

	}

}
