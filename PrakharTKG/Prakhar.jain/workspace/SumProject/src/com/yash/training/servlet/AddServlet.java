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
 * Servlet implementation class AddServlet
 */
@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		Cookie[] cookies=request.getCookies();
		if(cookies==null){
		String fnum=request.getParameter("fnum");
		String snum=request.getParameter("snum");
		int fnum1=Integer.parseInt(fnum);
		int snum1=Integer.parseInt(snum);
		int sum=fnum1+snum1;
		String cNum=""+sum;
		Cookie c=new Cookie("sum", cNum);
		response.addCookie(c);
		}
		else{
			String num=request.getParameter("num");
			int no=Integer.parseInt(num);
			for (Cookie cookie : cookies) {
				if(cookie.getName().equals("sum")){
					String sum=cookie.getValue();
					int num1=Integer.parseInt(sum);
					String result=no+num1+"";
					cookie.setMaxAge(0);
					response.addCookie(cookie);
					Cookie c=new Cookie("sum",result);
					response.addCookie(c);
				}
			}
		}
		response.sendRedirect("ShowServlet");
			
	}

}
