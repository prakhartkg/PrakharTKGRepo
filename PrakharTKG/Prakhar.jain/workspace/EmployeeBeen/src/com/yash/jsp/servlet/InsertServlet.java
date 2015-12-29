package com.yash.jsp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yash.jsp.bean.Employee;
import com.yash.jsp.dao.EmployeeDAO;

/**
 * Servlet implementation class InsertServlet
 */
@WebServlet("/InsertServlet")
public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Employee employee=(Employee) request.getAttribute("employee");
		PrintWriter out=response.getWriter();
		int i=EmployeeDAO.insertEmployee(employee);
		if(i==1){
			out.println("Success");
		}
		else{
			out.println("Failed");
		}
	}

}