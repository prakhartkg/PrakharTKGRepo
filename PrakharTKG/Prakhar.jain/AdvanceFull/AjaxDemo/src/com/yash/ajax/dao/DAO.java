package com.yash.ajax.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.yash.ajax.domain.Employee;
import com.yash.ajax.util.Util;


public class DAO {

	public static Employee getEmployeeDetail(int id) {
		Employee employee=new Employee();
		Connection connection=Util.getConnection();
		String sql="SELECT * FROM EMPLOYEE WHERE ID="+id;
		try {
			ResultSet resultSet=Util.select(sql);
			while(resultSet.next()){
				employee.setId(resultSet.getInt(1));
				employee.setName(resultSet.getString(2));
				employee.setCity(resultSet.getString(3));
				employee.setPosition(resultSet.getString(4));
				employee.setSalary(resultSet.getFloat(5));
				
			}
		} catch (SQLException e) {
			System.out.println("invalid");
			e.printStackTrace();
		}
		
		return employee;
	}
		
}
