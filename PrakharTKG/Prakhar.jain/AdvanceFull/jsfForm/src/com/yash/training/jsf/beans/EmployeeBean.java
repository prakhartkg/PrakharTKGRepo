package com.yash.training.jsf.beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class EmployeeBean {
	private String name;
	private String contact;
	private String gender;
	private String email;
	private String address;
	private String dob;
	private String yearsOfExpreance;
	private String[] tech;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getYearsOfExpreance() {
		return yearsOfExpreance;
	}
	public void setYearsOfExpreance(String yearsOfExpreance) {
		this.yearsOfExpreance = yearsOfExpreance;
	}
	public String[] getTech() {
		return tech;
	}
	public void setTech(String[] tech) {
		this.tech = tech;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String save(){
		String technologies=String.join(",", tech);
		String url = "jdbc:mysql://localhost:3306/employee";
		String user = "root";
		String password = "root";
		Connection connection=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			System.out.println("driver not loaded");
		}
		String sql="INSERT INTO EMPLOYEES VALUES('"+name+"','"+contact+"','"+gender+"','"+email+"','"+address+"','"+dob+"','"+yearsOfExpreance+"','"+technologies+"')";
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return "success";
	}
}
