package com.yash.ems.domain;

public class Employee {
	
	private int employee_id;
	private String name;
	private String city;
	private double salary;
	
	public Employee() {
	
	}

	
	
	public Employee(int employee_id, String name, String city, double salary) {
		super();
		this.employee_id = employee_id;
		this.name = name;
		this.city = city;
		this.salary = salary;
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
	
	
	
}
