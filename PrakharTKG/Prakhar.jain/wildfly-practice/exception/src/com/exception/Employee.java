package com.exception;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class Employee implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;
	private String name;
	private int emp_id;
	private transient int count;
	private static Employee employee=new Employee();
	
	private Employee() {
	
	}
	
	public static Employee getInstance(){
		
		return employee;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	private Object readResolve() throws ObjectStreamException{
		return employee;
	}
	
}
