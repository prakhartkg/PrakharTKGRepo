package com.customer.presentation;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		do{
		System.out.println("********************************************************************************");
		System.out.println("Press 1. to Register");
		System.out.println("Press 2. to Login");
		System.out.println("Press 3. to Exit");
		Scanner scanner=new Scanner(System.in);
		int no=scanner.nextInt();
		switch(no){
		case 1:
			SignUp.signUp();
			
		break;
		case 2:
			SignIn.signIn();	
			
		break;
		case 3:
			System.exit(0);
			break;
		}
		}while(true);
		
	}

}
