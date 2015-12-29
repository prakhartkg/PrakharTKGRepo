package com.yash.remotetest.service;

import javax.ejb.Remote;

@Remote
public interface ServiceBeanRemote {

	public String saySomething();
	
}
