package com.yash.sms.service;

import java.util.List;

import javax.inject.Inject;

import com.yash.sms.dao.StudentDAOIntf;
import com.yash.sms.domail.Person;
import com.yash.sms.domail.Student;

public class StudentServiceImpl implements StudentServiceIntf {
	
	@Inject
	StudentDAOIntf studentDao;
	@Override
	public void saveStudent(Student student) {
		
		String sql="INSERT INTO STUDENT VALUES("+student.getRollNo()+",'"+student.getName()+
				"','"+student.getContact()+"','"+student.getAddress()+"','"+student.getCourse()+"')";
		studentDao.Update(sql);
	}
	@Override
	public List<Student> showAll() {
		String sql="SELECT * FROM STUDENT";
		List<Student> students=studentDao.select(sql);
		return students;
	}

}
