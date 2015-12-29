package com.yash.sms.dao;

import java.util.List;

import com.yash.sms.domail.Student;

public interface StudentDAOIntf {
	
	public  void Update(String sql);

	public List<Student> select(String sql);
}
