package com.yash.sms.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Util {
	private static Connection connection = null;

	public static Connection getConnection() {
		String url = "jdbc:mysql://localhost:3306/sms";
		String user = "root";
		String password = "root";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			System.out.println("Driver Not Loaded");
		} catch (SQLException e) {
			System.out.println("Sql Error");
		}
		return connection;
	}

	public static void disconnect(Connection connection) {
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
