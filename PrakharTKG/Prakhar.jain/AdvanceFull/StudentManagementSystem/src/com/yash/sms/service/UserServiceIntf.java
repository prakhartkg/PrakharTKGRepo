package com.yash.sms.service;

import java.util.List;

import com.yash.sms.domail.Person;
import com.yash.sms.domail.Student;


public interface UserServiceIntf {
	public Person validate(int userId, String password);
	public Person add(Person person);
	public Person delete(Person person);
	public Person Search(Person person);
	
}
