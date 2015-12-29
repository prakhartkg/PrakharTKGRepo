package com.yash.rest.pro;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.yash.rest.domain.Customer;

@Path("/userService")
public class Service {
	Customer customer;
	
	@GET	
	@Path("/getCustomer")
	@Produces(MediaType.APPLICATION_JSON)
	public Customer getCustomer(){
		customer=new Customer();
		customer.setCustomerId(1);
		customer.setName("Prakhar");
		return customer;
	}
	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/produces")
	public String populateCustomer(Customer customer){
		System.out.println(customer.getCustomerId());
		System.out.println(customer.getName());
		return "hello";
	}
}
