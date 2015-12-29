package com.yash.customerLogin.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ValidateCustomer
 */
@WebServlet(urlPatterns={"/ValidateCustomer.do"})
public class ValidateCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Servlet............");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<Title>Login</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1> welcome: "+request.getAttribute("Name")+"</h1>");
		out.println("</body>");
		out.println("</html>");
	
	}

}