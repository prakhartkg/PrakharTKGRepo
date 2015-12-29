package com.yash.EmployeeInformation.dao;

import java.sql.Connection;
import java.util.List;

import com.yash.EmployeeInformation.domain.Employee;

public interface EmployeeDao {
	
	public Connection getConnection();

	List<Employee> getAllEmployees(String sql);
	
}
