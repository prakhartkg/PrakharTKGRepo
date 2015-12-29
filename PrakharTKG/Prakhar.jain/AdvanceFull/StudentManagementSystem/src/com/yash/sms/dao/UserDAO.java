package com.yash.sms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.yash.sms.dbutil.Util;
import com.yash.sms.domail.Person;
import com.yash.sms.domail.User;

public class UserDAO implements UserDAOIntf {
	

	public Person select(String sql) throws SQLException {
		Connection connection = Util.getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		ResultSet resultSet = preparedStatement.executeQuery();
		User user=null;
		try {
			if(resultSet.next()){
				user=new User();
				user.setUserId(resultSet.getInt(1));
				user.setPassword(resultSet.getString(5));
				user.setName(resultSet.getString(2));
				user.setContact(resultSet.getString(3));
				user.setAddress(resultSet.getString(4));
				user.setStatus(resultSet.getInt(7));
				user.setType(resultSet.getInt(6));
			}
		} catch (SQLException e) {
			
		}
		
		return (Person)user;

	}

	public  void Update(String sql) {
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
}
