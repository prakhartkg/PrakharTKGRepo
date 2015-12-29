package com.yash.ajax.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yash.ajax.dao.DAO;
import com.yash.ajax.domain.Employee;

@WebServlet("/GetDetailServlet")
public class GetDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static int i = 0;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		i++;
		System.out.println(i);
		String id = request.getParameter("eid");
		System.out.println(id);
		Employee employee = DAO.getEmployeeDetail(Integer.parseInt(id));
		response.setContentType("text/plain");
		response.getWriter().write(employee.toString());

	}

}
