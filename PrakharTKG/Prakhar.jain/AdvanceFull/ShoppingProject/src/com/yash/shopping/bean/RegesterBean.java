package com.yash.shopping.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.yash.shopping.dao.CustomerDao;
import com.yash.shopping.pojo.Customer;

/**
 * @author prakhar.jain
 *
 */
@ManagedBean
@RequestScoped
public class RegesterBean {
	private Customer customer=new Customer();

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public String saveUser(){
		int result=CustomerDao.saveCustomer(customer);
		if(result>0){
		return "Login";
		}
		else{
		return "error";
		}
	}
}
