package com.yash.cdix;

import javax.inject.Inject;


// servlet

public class StandardOutView {

	@Inject
	private EmployeeService employeeService;
	

	
	public void showAllEmployee(){
		for(Object str :employeeService.getAllEmployee()){
			System.out.println(str);
		}
	}
	
}
