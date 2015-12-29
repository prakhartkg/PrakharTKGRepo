package com.yash.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EvenOdd
 */
@WebServlet("/EvenOdd")
public class EvenOdd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String even="";
		String odd="";
		for(int i=0;i<20;i++){
			if(i%2==0){
				even=even+i+" ";
			}
			else{
				odd=odd+i+" ";
			}
		}
		out.print("Even Numbers: "+even+"<br>");
		out.print("odd Numbers: "+odd+"<br>");
	}

}
