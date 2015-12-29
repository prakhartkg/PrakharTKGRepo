package com.customer.presentation;

import java.util.Scanner;

import com.customer.DAO.SignUpDAO;
import com.customer.Domain.Customer;

public class SignUp {
	public static void signUp(){
		Scanner scanner=new Scanner(System.in);
		scanner.useDelimiter("\r\n");
		System.out.println("***********************Welcome**********************");
		System.out.println("Enter Detatls To Register...");
		System.out.print("Enter Name:");
		String name=scanner.next();
		System.out.print("Enter City:");
		String city=scanner.next();
		System.out.print("Enter Address:");
		String address=scanner.next();
		System.out.print("Enter Password:");
		String password=scanner.next();
		System.out.print("Re-Enter Password:");
		String rePassword=scanner.next();
		if(password.equals(rePassword)){
			Customer customer=new Customer(name,city,address,password);
			int id=SignUpDAO.addCustomer(customer);
			System.out.println("Your Unique Id="+id);
			
		}else{
			System.out.println("Password do not match");
			signUp();
		}
	}
}
