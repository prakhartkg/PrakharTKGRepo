package com.customer.Domain;

public class Account {
	private int accountNo;
	private double amount=5000;
	public Account(int genratedAccountNo) {
		this.accountNo=genratedAccountNo;
	}
	public Account() {
		// TODO Auto-generated constructor stub
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "AccountNo=" +accountNo;
	}
	
}
