package com.customer.Domain;

import java.util.List;

import com.customer.Account.DAO.AccountDAO;

public class Customer {
	private int customerId=-1;
	private String customerName;
	private String customerCity;
	private String customerAddress;
	private String customerPassword;
	private Account account;
	private List<Customer> beneficiary;
		
	public Customer() {
	account=new Account();
	}
	public Customer(String customerName, String customerCity,String customerAddress, String customerPassword) {
		this.customerName = customerName;
		this.customerCity = customerCity;
		this.customerAddress = customerAddress;
		this.customerPassword = customerPassword;
		account=new Account(AccountDAO.genrateAccountNo());
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerCity() {
		return customerCity;
	}
	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public String getCustomerPassword() {
		return customerPassword;
	}
	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	
	public List<Customer> getBeneficiary() {
		return beneficiary;
	}
	public void setBeneficiary(List<Customer> beneficiary) {
		this.beneficiary = beneficiary;
	}
	@Override
	public String toString() {
		return "customerId=" + customerId + "   customerName="
				+ customerName +  "  Account No="
				+ account.getAccountNo();
	}
	@Override
	public int hashCode() {
		
		return customerId;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (customerId != other.customerId)
			return false;
		return true;
	}
	
	
}
