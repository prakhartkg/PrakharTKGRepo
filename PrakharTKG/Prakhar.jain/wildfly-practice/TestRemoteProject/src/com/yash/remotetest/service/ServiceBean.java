package com.yash.remotetest.service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class ServiceBean
 */
@Stateless
@LocalBean
public class ServiceBean implements ServiceBeanRemote, ServiceBeanLocal {

	@Override
	public String saySomething() {
		
		return "Hello World";
	}



}
