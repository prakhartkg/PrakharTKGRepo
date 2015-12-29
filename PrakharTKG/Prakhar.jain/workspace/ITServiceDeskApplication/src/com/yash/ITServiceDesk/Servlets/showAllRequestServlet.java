package com.yash.ITServiceDesk.Servlets;

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
import javax.servlet.http.HttpSession;

import com.yash.ITServiceDesk.Util.MyConnection;

@WebServlet("/showAllRequestServlet")
public class showAllRequestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	Connection connection=MyConnection.getConnection();
	HttpSession session=request.getSession();
	PrintWriter out=response.getWriter();
	String sql="Select * from problem where userId='"+session.getAttribute("userId")+"'";
	try {
		PreparedStatement preparedStatement=connection.prepareStatement(sql);
		ResultSet resultSet=preparedStatement.executeQuery();
		out.println("<h1>Hello: "+session.getAttribute("userId")+"</h1>");
		out.println("<h4>Your Request is successfully submitted: "+session.getAttribute("description")+"</h4><br>");
		while(resultSet.next()){
		out.println(resultSet.getString(2)+" "+resultSet.getString(3)+" "+resultSet.getString(4)+"<br>");
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}

}
