package com.yash.shopping.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.yash.shopping.pojo.Customer;

public class CustomerDao {
	public static Connection getConnection() {
		Connection connection=null;
		String url = "jdbc:mysql://localhost:3306/shoppingproject";
		String user = "root";
		String password = "root";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}
	
		public static int saveCustomer(Customer customer) {
		Connection connection=getConnection();
		PreparedStatement preparedStatement;
		int result=-1;
		String sql="Insert into customer values(?,?,?,?,?,?,?)";
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, generateId());
			preparedStatement.setString(2, customer.getName());
			preparedStatement.setString(3, customer.getContact());
			preparedStatement.setString(4, customer.getEmail());
			preparedStatement.setString(5, customer.getAddress());
			preparedStatement.setString(6, customer.getUserName());
			preparedStatement.setString(7, customer.getPassword());
			result=preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			return result;
		}

		public static Customer doLogin(String userName, String password) {
			Connection connection=getConnection();
			Customer customer=null;
			String sql="Select * from customer where userName=? and password=?";
			try {
				PreparedStatement preparedStatement=connection.prepareStatement(sql);
				preparedStatement.setString(1, userName);
				preparedStatement.setString(2, password);
				ResultSet resultSet=preparedStatement.executeQuery();
				while(resultSet.next()){
					customer=new Customer();
					customer.setUserId(resultSet.getInt(1));
					customer.setName(resultSet.getString(2));
					customer.setContact(resultSet.getString(3));
					customer.setEmail(resultSet.getString(4));
					customer.setAddress(resultSet.getString(5));
					customer.setUserName(resultSet.getString(6));
					customer.setPassword(resultSet.getString(7));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			return customer;
		}
		
		public static int generateId(){
			Connection connection=getConnection();
			int userId=-1;
			String sql="select max(userId) from customer";
			PreparedStatement preparedStatement;
			try {
				preparedStatement = connection.prepareStatement(sql);
				ResultSet resultSet=preparedStatement.executeQuery();
				if(resultSet.next()){
					userId=resultSet.getInt(1);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return ++userId;
			
		}
}
