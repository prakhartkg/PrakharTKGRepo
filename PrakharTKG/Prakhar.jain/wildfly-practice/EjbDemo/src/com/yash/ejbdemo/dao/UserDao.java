package com.yash.ejbdemo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.inject.Inject;

import com.yash.ejbdemo.domain.User;
import com.yash.ejbdemo.util.Util;

public class UserDao {

	//@Inject User user;
	User user = new User();
	public User getUser(String userName, String password) {
		String sql="SELECT * FROM USER WHERE username='"+userName+"' AND PASSWORD='"+password+"'";
		try {
			ResultSet resultSet=Util.select(sql);
			while(resultSet.next()){
				System.out.println("asdasdasdasdasdasd------------------------");
				user.setUserId(resultSet.getInt(1));
				user.setUserName(resultSet.getString(2));
				user.setName(resultSet.getString(3));
				user.setPassword(resultSet.getString(4));
				user.setAddress(resultSet.getString(5));
				user.setCity(resultSet.getString(6));
				System.out.println(user);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return user;
	}

}
