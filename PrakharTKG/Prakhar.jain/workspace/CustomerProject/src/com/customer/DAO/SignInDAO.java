package com.customer.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.customer.Connection.CustomerConnection;
import com.customer.Domain.Account;
import com.customer.Domain.Customer;

public class SignInDAO {
	public static Customer checkSignIn(int customerId,String customerPassword){
		Connection connection=CustomerConnection.getConnection();
		Customer customer=new Customer();
		Account account=customer.getAccount();
		PreparedStatement preparedStatement=null;
		String sql="SELECT * FROM CustomerDetails cd INNER JOIN accountDetails ad ON cd.customerid=ad.customerid WHERE cd.customerId=? AND cd.customerPassword=?";
		try {
			preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, customerId);
			preparedStatement.setString(2,customerPassword);
			ResultSet resultSet=preparedStatement.executeQuery();
			
			while(resultSet.next()){
				customer.setCustomerId(resultSet.getInt(1));
				customer.setCustomerName(resultSet.getString(2));
				customer.setCustomerCity(resultSet.getString(3));
				customer.setCustomerAddress(resultSet.getString(4));
				customer.setCustomerPassword(resultSet.getString(5));
				account.setAccountNo(resultSet.getInt(6));
				account.setAmount(resultSet.getDouble(7));
				customer.setAccount(account);
				
			}
		}
		catch (SQLException e) {
			System.out.println("Id Not generated");
			e.printStackTrace();
		}
		
		String sql1="SELECT * from beneficiary where accountNo="+customer.getAccount().getAccountNo();
		try {
			List<Customer> beneficiary=new ArrayList<Customer>();
			
			preparedStatement=connection.prepareStatement(sql1);
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()){
				Customer befcustomer=new Customer();
				Account account2=new Account();
				account2.setAccountNo(resultSet.getInt(2));
				befcustomer.setAccount(account2);
				beneficiary.add(befcustomer);
				customer.setBeneficiary(beneficiary);
			
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return customer;
	}
}
