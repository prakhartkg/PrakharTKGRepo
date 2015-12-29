package com.yash.ITServiceDesk.Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Register</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<form method=\"post\" action=\"SaveUserServlet\">");
		out.println("<Table align=\"center\" >");
		out.println("<Tr>");
		out.println("<th>Name</th>");
		out.println("<td><Input type=\"text\" name=\"name\"></td>");
		out.println("</Tr>");
		out.println("<Tr>");
		out.println("<th>Mobile No.</th>");
		out.println("<td><Input type=\"text\" name=\"mobile\"></td>");
		out.println("</Tr>");
		out.println("<tr>");
		out.println("<td colspan=2 align=\"center\"><input type=\"submit\" value=\"Submit\"></td>");
		out.println("</tr>");
		out.println("</Table>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
	}

}
