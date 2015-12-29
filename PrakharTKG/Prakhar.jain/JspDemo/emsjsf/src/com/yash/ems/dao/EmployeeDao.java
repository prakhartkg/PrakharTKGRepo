package com.yash.ems.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.sql.DataSource;

import com.yash.ems.domain.Employee;


public class EmployeeDao {
	
	String sql;
	int result;
	
	@Resource(lookup="java:jboss/datasources/ems")
	DataSource source;
	private Connection connection=null;
	
	public int addEmployee(Employee employee){
		sql="Insert into employee(name,city,salary)values(?,?,?)";
		try {
			connection=source.getConnection();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			PreparedStatement preparedStatement =connection.prepareStatement(sql);
			preparedStatement.setString(1, employee.getName());
			preparedStatement.setString(2, employee.getCity());
			preparedStatement.setDouble(3, employee.getSalary());
			result=preparedStatement.executeUpdate();
		} catch (SQLException e) {
			
		}finally {
			
		}
		return result;
	}
	
	public int deleteEmployee(Employee employee){
		sql="delete from employee where employee_id="+employee.getEmployee_id();
		
		try {
			connection = source.getConnection();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(sql);
			result=preparedStatement.executeUpdate();
		} catch (SQLException e) {
			
		}finally {
			
		}
	
		return result;
	}

	public List<Employee> getAllEmployees() {
		sql="select * from employee";
		List<Employee>employees=new ArrayList<>();
		System.out.println("datasource  : =  "+source);
		try {
			connection=source.getConnection();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Employee employee;
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()){
				employee=new Employee();
				employee.setEmployee_id(resultSet.getInt(1));
				employee.setName(resultSet.getString(2));
				employee.setCity(resultSet.getString(3));
				employee.setSalary(resultSet.getDouble(4));
				employees.add(employee);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return employees;
	}

	public List<Employee> getEmployee(Employee employe) {
		sql="select * from employee where employee_id="+employe.getEmployee_id();
		List<Employee>employees=new ArrayList<>();
		try {
			connection=source.getConnection();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Employee employee;
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()){
				employee=new Employee();
				employee.setEmployee_id(resultSet.getInt(1));
				employee.setName(resultSet.getString(2));
				employee.setCity(resultSet.getString(3));
				employee.setSalary(resultSet.getDouble(4));
				employees.add(employee);
			}
		} catch (SQLException e) {
			
		}
		
		return employees;
	}

	public int updateEmployee(Employee employee) {
		sql="update employee set name=?,city=?,salary=? where employee_id=?";
		try {
			connection=source.getConnection();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, employee.getName());
			preparedStatement.setString(2, employee.getCity());
			preparedStatement.setDouble(3,employee.getSalary());
			preparedStatement.setInt(4,employee.getEmployee_id());
			result=preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
			
		return result;
	}



}
