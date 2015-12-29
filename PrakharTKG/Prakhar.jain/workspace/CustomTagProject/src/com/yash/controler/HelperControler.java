package com.yash.controler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yash.domain.Customer;



public class HelperControler {
	public static void doProcess(HttpServletRequest request,HttpServletResponse response,Customer customer) throws ServletException, IOException{
		System.out.println(customer.getName()+" "+customer.getCity()+" "+customer.getAge());
		System.out.println(request);
		System.out.println(response);
	}
}
