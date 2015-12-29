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

/**
 * Servlet implementation class SaveUserServlet
 */
@WebServlet("/SaveUserServlet")
public class SaveUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		PrintWriter out=response.getWriter();
		String userId=(String)session.getAttribute("userId");
		String software=(String) session.getAttribute("software");
		String os=(String)session.getAttribute("os");
		String problem=(String)session.getAttribute("description");
		String name=request.getParameter("name");
		session.setAttribute("name",name);
		String mobile=request.getParameter("mobile");
		String sql="INSERT INTO USER VALUES('"+userId+"','"+name+"',"+mobile+")";
		ITServiceDeskDAO.update(sql);
		String sql1="INSERT INTO PROBLEM VALUES('"+userId+"','"+os+"','"+software+"','"+problem+"')";
		ITServiceDeskDAO.update(sql1);
		ServletContext application=application=getServletContext();
		RequestDispatcher dispatcher=application.getRequestDispatcher("/ResponseServlet");
		dispatcher.forward(request, response);
		
	}

}
