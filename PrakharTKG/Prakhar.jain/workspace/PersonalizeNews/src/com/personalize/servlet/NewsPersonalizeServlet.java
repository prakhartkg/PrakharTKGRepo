package com.personalize.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NewsPersonalizeServlet
 */
@WebServlet("/NewsPersonalizeServlet")
public class NewsPersonalizeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String news=request.getParameter("news");
		Cookie c=new Cookie("news", news);
		c.setMaxAge(60);
		response.addCookie(c);
		
		response.sendRedirect("NewsServletController");
					
	
	}

}
