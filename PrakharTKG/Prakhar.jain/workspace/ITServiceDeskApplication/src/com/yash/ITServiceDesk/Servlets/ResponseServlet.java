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


@WebServlet("/ResponseServlet")
public class ResponseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Response</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<header>");
		ServletContext application=application=getServletContext();
		RequestDispatcher dispatcherHeader=application.getRequestDispatcher("/Header.html");
		dispatcherHeader.include(request, response);
		out.println("</header>");
		out.println("<hr>");
		out.println("<div style='height:75%'>");
		RequestDispatcher dispatcherMain=application.getRequestDispatcher("/showAllRequestServlet");
		dispatcherMain.include(request, response);
		out.println("</div>");
		out.println("<footer>");	
		RequestDispatcher dispatcherFooter=application.getRequestDispatcher("/Footer.html");
		dispatcherFooter.include(request, response);
		out.println("</footer>");
		out.println("</body>");
		out.println("</html>");
		
	}

}
