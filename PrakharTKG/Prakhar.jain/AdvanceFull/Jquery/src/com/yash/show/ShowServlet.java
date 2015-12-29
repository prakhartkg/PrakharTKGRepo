package com.yash.show;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ShowServlet")
public class ShowServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 Enumeration perameters=request.getParameterNames();
		 PrintWriter out=response.getWriter();
		 while(perameters.hasMoreElements()){
			 String param=(String) perameters.nextElement();
			 out.print(param+":");
			 out.println(request.getParameter(param));
		 }
	}

	
}
