package com.yash.ems.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.yash.ems.Domain.User;

/**
 * Servlet implementation class ControllerServlet
 */
@WebServlet("/ControllerServlet")
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		User currentUser=(User) session.getAttribute("currentUser");
		if(currentUser!=null){
			request.getRequestDispatcher("Show.jsp").forward(request, response);
		}else{
			request.getRequestDispatcher("LoginForm.jsp").forward(request, response);
		}
	}

}
