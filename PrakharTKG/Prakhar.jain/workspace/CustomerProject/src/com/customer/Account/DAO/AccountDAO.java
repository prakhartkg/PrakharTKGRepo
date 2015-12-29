package com.customer.Account.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;




import com.customer.Connection.CustomerConnection;
import com.customer.DAO.SignInDAO;
import com.customer.Domain.Account;
import com.customer.Domain.Customer;
import com.customer.Exceptions.InsufficientBalanceException;

public class AccountDAO {
	public static int genrateAccountNo(){
		int accountNo=-1;
		Connection connection=CustomerConnection.getConnection();
		String sql="SELECT MAX(accountNo) FROM AccountDetails";
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()){
				accountNo=resultSet.getInt(1);
				if(accountNo==0){
					return 10000;
				}
			}
		} catch (SQLException e) {
			System.out.println("Id Not generated");
			e.printStackTrace();
		}
		
		
		return ++accountNo;
	}

	public static void addIntoAccount(Customer customer) {
		Connection connection=CustomerConnection.getConnection();
		try{
			String accountSql="INSERT INTO AccountDetails VALUES(?,?,?)";
			PreparedStatement preparedStatement=connection.prepareStatement(accountSql);
			preparedStatement.setInt(1, customer.getAccount().getAccountNo());
			preparedStatement.setDouble(2, customer.getAccount().getAmount());
			preparedStatement.setInt(3, customer.getCustomerId());
			preparedStatement.executeUpdate();
		}catch(Exception e){
			System.out.println("not added");
		}
		
	}

	public static Customer deposit(Customer customer,double ammount) {
		Connection connection=CustomerConnection.getConnection();
		String Sql="UPDATE AccountDetails SET ammount=? where customerId="+customer.getCustomerId();
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(Sql);
			preparedStatement.setDouble(1, customer.getAccount().getAmount()+ammount);
			preparedStatement.executeUpdate();
			customer=SignInDAO.checkSignIn(customer.getCustomerId(), customer.getCustomerPassword());
		} catch (SQLException e) {
			
		}
		return customer;
		
		
	}

	public static Customer withdraw(Customer customer, double ammount) throws InsufficientBalanceException {
		Connection connection=CustomerConnection.getConnection();
		String Sql="UPDATE AccountDetails SET ammount=? where customerId="+customer.getCustomerId();
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(Sql);
			if(customer.getAccount().getAmount()>ammount)
			{
			preparedStatement.setDouble(1, customer.getAccount().getAmount()-ammount);
			preparedStatement.executeUpdate();
			customer=SignInDAO.checkSignIn(customer.getCustomerId(), customer.getCustomerPassword());
			}
			else{
			throw new InsufficientBalanceException("Insufficent Balance");
			}
		} catch (SQLException e) {
			
		}
		return customer;
	}

	public static double checkBalance(int customerId) {
		double balance=0.0;
		Connection connection=CustomerConnection.getConnection();
		String sql="SELECT ammount FROM AccountDetails WHERE customerId="+customerId;
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()){
				balance=resultSet.getDouble(1);
				}
			}catch(Exception e){
				
			}
		return balance;
	}

	public static List<Customer> showAllBeneficiary(Customer LoginedCustomer) {
		Connection connection=CustomerConnection.getConnection();
		
		List<Customer> beneficiarys=new ArrayList<>();
		
		String sql="SELECT * FROM CustomerDetails cd INNER JOIN accountDetails ad ON cd.customerid=ad.customerid";
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			ResultSet resultSet=preparedStatement.executeQuery();
			
			while(resultSet.next()){
				Customer customer=new Customer();
				Account account=customer.getAccount();
				customer.setCustomerId(resultSet.getInt(1));
				customer.setCustomerName(resultSet.getString(2));
				customer.setCustomerCity(resultSet.getString(3));
				customer.setCustomerAddress(resultSet.getString(4));
				account.setAccountNo(resultSet.getInt(6));
				account.setAmount(resultSet.getDouble(7));
				customer.setAccount(account);
				if(!customer.equals(LoginedCustomer))
				beneficiarys.add(customer);
			}
		}
		catch (SQLException e) {
			System.out.println("Id Not generated");
			e.printStackTrace();
		}

		
		return beneficiarys;
	}

	public static Customer addBenificiary(Customer customer, int accountNo) {
		Connection connection=CustomerConnection.getConnection();
		String sql="SELECT * FROM CustomerDetails cd INNER JOIN accountDetails ad ON cd.customerid=ad.customerid WHERE ad.accountNo=?";
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1,accountNo);
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()){
			preparedStatement=connection.prepareStatement("insert into beneficiary values(?,?)");
			preparedStatement.setInt(1, customer.getAccount().getAccountNo());
			preparedStatement.setInt(2, accountNo);
			preparedStatement.executeUpdate();
			customer=SignInDAO.checkSignIn(customer.getCustomerId(),customer.getCustomerPassword());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return customer;
	}

	/*public static void transferFund(int myAccountNo,int accountNo, double ammount) {
		Connection connection=CustomerConnection.getConnection();
		String sql="UPDATE AccountDetails SET ammount=(ammount+?) where accountNo="+accountNo;
		String sql1="UPDATE AccountDetails SET ammount=(ammount-?) where accountNo="+myAccountNo;
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setDouble(1,ammount);
			preparedStatement.executeUpdate();
			preparedStatement=connection.prepareStatement(sql1);
			preparedStatement.setDouble(1,ammount);
			preparedStatement.executeUpdate();
		}
		catch(Exception e){
			
		}
		
	}*/


	public static Customer transferByObject(Customer customer,List<Customer> benificiaries, int accountNo,double ammount) {
		Connection connection=CustomerConnection.getConnection();
		int customerId;
		Customer befcustomer=null;
		String sql="SELECT customerId FROM accountdetails WHERE accountNo="+accountNo;
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()){
				customerId=resultSet.getInt(1);
				befcustomer=new Customer();
				befcustomer.setCustomerId(customerId);
			}
			for(Customer customer2:benificiaries)
			{
				if(customer2.equals(befcustomer)){
					befcustomer=customer2;
				}
			}
			customer=withdraw(customer, ammount);
			deposit(befcustomer, ammount);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InsufficientBalanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return customer;
	}

	public static Customer removeBeneficiary(Customer customer,int accountNo) {
		Connection connection=CustomerConnection.getConnection();
		String sql="DELETE FROM Beneficiary WHERE accountNo=? AND beneficiaryAccountNo=?";
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, customer.getCustomerId());
			preparedStatement.setInt(2, accountNo);
			preparedStatement.executeUpdate();
			customer=SignInDAO.checkSignIn(customer.getCustomerId(), customer.getCustomerPassword());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return customer;
	}



}
