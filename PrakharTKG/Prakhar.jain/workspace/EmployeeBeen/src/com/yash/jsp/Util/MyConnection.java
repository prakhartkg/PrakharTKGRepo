package com.yash.jsp.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
	private static Connection connection=null;
	public static Connection getConnection(){
		String url="jdbc:mysql://localhost:3306/employeemanagement";
		String user="root";
		String password="root";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection=DriverManager.getConnection(url,user,password);
			} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			return connection;
	}
}
