package com.yash.sms.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;

import com.yash.sms.dao.UserDAOIntf;
import com.yash.sms.dbutil.Util;
import com.yash.sms.domail.Person;
import com.yash.sms.domail.Student;
import com.yash.sms.domail.User;

public class UserServiceImpl implements UserServiceIntf {
	@Inject
	UserDAOIntf dao;
	@Override
	public Person validate(int userId, String password) {
		String sql="SELECT * FROM USER WHERE UserId="+userId+" AND PASSWORD='"+password+"'";
		Person person=null;
		try {
			person = dao.select(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return person;
	}

	@Override
	public Person add(Person person) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Person delete(Person person) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Person Search(Person person) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
