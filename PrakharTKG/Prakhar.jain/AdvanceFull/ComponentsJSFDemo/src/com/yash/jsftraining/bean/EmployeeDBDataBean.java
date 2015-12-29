package com.yash.jsftraining.bean;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


import com.yash.jsftraining.db.DBUtil;
import com.yash.training.service.EmployeeServiceImpl;
import com.yash.training.service.EmployeeServiceIntf;

@ManagedBean
@RequestScoped
public class EmployeeDBDataBean {
	
	private List<EmployeeDB> employeeList;
	
	@EJB
	//1. this will create the object of implementation in EJB container
	//2. this will link or inject the implementation object in EmployeeServiceIntf reference
	private EmployeeServiceIntf employeeService;
	@PostConstruct
	public void init(){
		try {
			employeeList=employeeService.getAllEmployees();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public List<EmployeeDB> getEmployeeList() {
		return employeeList;
	}
	public void setEmployeeList(List<EmployeeDB> employeeList) {
		this.employeeList = employeeList;
	}
	
	public String removeEmployee(int empId){
		try {
			employeeService.deleteEmployee(empId);
			employeeList=employeeService.getAllEmployees();// add by me
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "abc";
	}

}
