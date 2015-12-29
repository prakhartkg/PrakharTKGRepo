package com.yash.sms.service;

import java.util.List;

import com.yash.sms.domail.Person;
import com.yash.sms.domail.Student;

public interface StudentServiceIntf {

	void saveStudent(Student student);
	List<Student> showAll();
}
