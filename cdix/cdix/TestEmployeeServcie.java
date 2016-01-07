package com.yash.cdix;

import java.util.List;

import javax.enterprise.inject.Alternative;
import javax.inject.Inject;

@Alternative
public class TestEmployeeServcie implements EmployeeService {

	@Inject
	private EmployeeDao employeeDao;
	
	public List getAllEmployee(){
		System.out.println("This is from Test Version..");
		return employeeDao.getAllEmployee();
	}
	
}
