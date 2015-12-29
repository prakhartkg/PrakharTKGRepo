package com.yash.sms.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.yash.sms.domail.Person;

public interface UserDAOIntf {
	public Person select(String sql) throws SQLException;
	public  void Update(String sql);
	
}
