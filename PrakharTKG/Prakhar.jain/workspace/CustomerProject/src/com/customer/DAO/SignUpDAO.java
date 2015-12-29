package com.customer.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.customer.Account.DAO.AccountDAO;
import com.customer.Connection.CustomerConnection;
import com.customer.Domain.Customer;

public class SignUpDAO {
	public static int generateId(){
		int id=-1;
		Connection connection=CustomerConnection.getConnection();
		String sql="SELECT MAX(customerId) FROM CustomerDetails";
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()){
				id=resultSet.getInt(1);
				if(id==0){
					return 1000;
				}
			}
		} catch (SQLException e) {
			System.out.println("Id Not generated");
			e.printStackTrace();
		}
		
		return ++id;
	}

	public static int addCustomer(Customer customer) {
		int id=generateId();
		customer.setCustomerId(id);
		Connection connection=CustomerConnection.getConnection();
		String sql="INSERT INTO CustomerDetails VALUES(?,?,?,?,?)";
		
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1,customer.getCustomerId());
			preparedStatement.setString(2, customer.getCustomerName());
			preparedStatement.setString(3, customer.getCustomerCity());
			preparedStatement.setString(4, customer.getCustomerAddress());
			preparedStatement.setString(5, customer.getCustomerPassword());
			preparedStatement.executeUpdate();
			connection.close();
			AccountDAO.addIntoAccount(customer);
		} catch (SQLException e) {
			System.out.println("Customer Not Added");
			e.printStackTrace();
		}
			
		return id;
	}

}
