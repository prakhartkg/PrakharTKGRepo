package com.personalize.controler;

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
 * Servlet implementation class NewsServletController
 */
@WebServlet("/NewsServletController")
public class NewsServletController extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie[] cookies=request.getCookies();
		if(cookies!=null){
			for (Cookie cookie : cookies) {
				if(cookie.getName().equals("news"))
					getServletContext().getRequestDispatcher("/"+cookie.getValue()+".html").forward(request, response);
				return;
			}
			
		}
		else{
			ServletContext application=application=getServletContext();
			RequestDispatcher dispatcher=application.getRequestDispatcher("/News_home.html");
			dispatcher.forward(request, response);
		}
	}

}
