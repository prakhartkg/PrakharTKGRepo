package com.yash.sms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yash.sms.dbutil.Util;
import com.yash.sms.domail.Student;
import com.yash.sms.domail.User;

public class StudentDAOimpl implements StudentDAOIntf {

	@Override
	public void Update(String sql) {
		Connection connection=Util.getConnection();
		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Util.disconnect(connection);
	}

	@Override
	public List<Student> select(String sql) {
		Connection connection = Util.getConnection();
		List<Student> students=new ArrayList<Student>();
		try {
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		ResultSet resultSet = preparedStatement.executeQuery();
		while(resultSet.next()){
				Student student=new Student();
				student.setRollNo(resultSet.getInt(1));
				student.setName(resultSet.getString(2));
				student.setContact(resultSet.getString(3));
				student.setAddress(resultSet.getString(4));
				student.setCourse(resultSet.getString(5));
				students.add(student);
			}
		} catch (SQLException e) {
			
		}
		return students;
	}

}
