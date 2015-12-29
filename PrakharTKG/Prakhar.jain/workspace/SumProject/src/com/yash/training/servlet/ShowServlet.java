package com.yash.training.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ShowServlet
 */
@WebServlet("/ShowServlet")
public class ShowServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		Cookie[] cookies=request.getCookies();
		String sum=null;
		if(cookies!=null){
			for (Cookie cookie : cookies) {
				if(cookie.getName().equals("sum")){
					sum=cookie.getValue();
				}
			}
		}
		response.setContentType("text/html");
		out.println("<html>");
		out.println("<Head></head>");
		out.println("<body>");
		out.println("<h4>Sum is :" +sum+"</h4>");
		out.println("<form action=\"AddServlet\">");
		out.println("<input type=\"text\" name=\"num\">");
		out.println("<input type=\"submit\" value=\"Add\">");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
	}

}
