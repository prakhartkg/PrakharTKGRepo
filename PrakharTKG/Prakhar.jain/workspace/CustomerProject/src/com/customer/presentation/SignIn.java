package com.customer.presentation;


import java.util.List;
import java.util.Scanner;

import com.customer.Account.DAO.AccountDAO;
import com.customer.DAO.SignInDAO;
import com.customer.Domain.Customer;
import com.customer.Exceptions.InsufficientBalanceException;

public class SignIn {
	static Customer customer;

	public static void signIn(){
		Scanner scanner=new Scanner(System.in);
		int no;
		System.out.println("******************Welcome*****************");
		System.out.print("Customer Id : ");
		int id=scanner.nextInt();
		System.out.print("Password : ");
		String password=scanner.next();
		customer=SignInDAO.checkSignIn(id, password);
		if(customer.getCustomerName()!=null){
			System.out.println("Welcome..."+customer.getCustomerName());
			do{

				System.out.println("***********************************");
				System.out.println("press 1. to Deposit");
				System.out.println("press 2. to withdraw");
				System.out.println("press 3. to Check Balance");
				System.out.println("press 4. to Transfer");
				System.out.println("press 5. to exit");
				no=scanner.nextInt();
				switch(no){
				case 1:
					System.out.println("Enter Ammount :");
					double ammount=scanner.nextDouble();
					customer=AccountDAO.deposit(customer,ammount);
					System.out.println("Available balance="+customer.getAccount().getAmount());
					break;
				case 2:
					System.out.println("Enter ammount");
					ammount=scanner.nextDouble();
					try {
						customer=AccountDAO.withdraw(customer,ammount);
						System.out.println("Available balance="+customer.getAccount().getAmount());
					} catch (InsufficientBalanceException e) {
						System.out.println("Error : "+e.getMessage());
					}
					break;
				case 3:
					//System.out.println("Available Balance : "+AccountDAO.checkBalance(customer.getCustomerId()));
					System.out.println("Available Balance="+customer.getAccount().getAmount());
					break;
				case 4:


					System.out.println("List of Benificiary.......");							
					List<Customer> benificiaries=customer.getBeneficiary();
					if(benificiaries!=null){
						for(Customer customerDetail:benificiaries){
							System.out.println(customerDetail.getAccount());
							
						}
					}
					else{
						System.out.println("Please Add Beneficiary first");
					}

					System.out.println("**************************");
					System.out.println("Press 1. to add Benificiary");
					System.out.println("Press 2. to remove Benificiary");
					System.out.println("press 3. to Transfer Ammount");
					no=scanner.nextInt();
					switch(no){
					case 1:
						System.out.println("Enter Account no");
						int accountNo=scanner.nextInt();
						
						customer=AccountDAO.addBenificiary(customer,accountNo);
						break;
					case 2:
						System.out.println("Enter Account No");
						accountNo=scanner.nextInt();
						customer=AccountDAO.removeBeneficiary(customer,accountNo);
						break;
					case 3:
						System.out.println("Enter Account No of beneficiary");
						accountNo=scanner.nextInt();
						System.out.println("Enter ammount");
						ammount=scanner.nextDouble();
						customer=AccountDAO.transferByObject(customer,benificiaries,accountNo,ammount);
						System.out.println("Available balance="+customer.getAccount().getAmount());
						break;
					}
					break;



				}
			}while(no!=5);
		}
	}
}
