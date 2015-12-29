package com.yash.training.jsf.beans;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.yash.training.jsf.pojo.Address;

@ManagedBean
@RequestScoped
public class UserBean {
	private String name;
	private float salary;
	private Address address=new Address();
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String save(){
		String url = "jdbc:mysql://localhost:3306/ems";
		String user = "root";
		String password = "root";
		Connection connection=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			System.out.println("driver not loaded");
		}
		String sql="INSERT INTO EMPLOYEE VALUES('"+name+"',"+salary+")";
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return "show";
	}
}
