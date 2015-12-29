package com.Domain;

public class Employee {
	private int empId;
	private String name;
	private String address;
	
	public Employee(int empId, String name, String address) {
		
		this.empId = empId;
		this.name = name;
		this.address = address;
	}
	public Employee() {
		
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "empId=" + empId + ", name=" + name + ", address="
				+ address;
	}
	
}
