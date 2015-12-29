package com.yash.ems.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

import com.yash.ems.domain.Employee;
import com.yash.ems.service.EmployeeService;

@ManagedBean
@SessionScoped
public class employeeBean {
	
	private int employee_id;
	private String name;
	private String city;
	private double salary;
	private List<Employee> employees=new ArrayList<>();
	
	private Employee employee;

	@Inject EmployeeService service;
	
	
	
	
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public EmployeeService getService() {
		return service;
	}

	public void setService(EmployeeService service) {
		this.service = service;
	}
	
	public String add(){
		service.addEmployee(name, city, salary);
		employees=service.getAllEmployees();
		return "index.xhtml";
	}
	
	public String searchEmployees(){
		if(employee_id==0){
		employees=service.getAllEmployees();
		}
		else{
		employees=service.getEmployee(employee_id);	
		}
		return null;
	}
	
	public String edit(){
		employees=service.getEmployee(employee_id);
		for(Employee employee: employees){
			employee_id=employee.getEmployee_id();
			name=employee.getName();
			city=employee.getCity();
			salary=employee.getSalary();
		}
		return "editEmployee.xhtml?faces-redirect=true";
	}
	
	public String delete(){
		service.deleteEmployee(employee_id);
		employees=service.getAllEmployees();
		return null;
	}
	
	public String update(){
		service.updateEmployee(employee_id, name, city, salary);
		employees=service.getAllEmployees();
		employee_id=0;
		return "index.xhtml";
	}
	
}
