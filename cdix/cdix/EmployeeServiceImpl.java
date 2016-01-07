package com.yash.cdix;

import java.util.List;

import javax.enterprise.inject.Default;
import javax.inject.Inject;

@Default
public class EmployeeServiceImpl implements EmployeeService {


	@Inject
	private EmployeeDao employeeDao;
	public EmployeeDao getEmployeeDao() {
		return employeeDao;
	}

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	@Override
	public List getAllEmployee() {
		
		return employeeDao.getAllEmployee();
	}

}
