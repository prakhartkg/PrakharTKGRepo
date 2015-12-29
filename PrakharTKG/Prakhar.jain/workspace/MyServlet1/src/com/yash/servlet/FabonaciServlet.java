package com.yash.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FabonaciServlet
 */
@WebServlet("/Fabo")
public class FabonaciServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter out=response.getWriter();
	int first=0;
	int second=1;
	int next;
	for (int i = 0; i <=10; i++) {
		if(i==0||i==1)
			out.print(i+" ");
		else{
			next=first+second;
			out.print(next+" ");
			first=second;
			second=next;
			
		}
			
	}
	}

}
