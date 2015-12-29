package com.yash.ejbdemo.service;

import javax.ejb.Local;

import com.yash.ejbdemo.domain.User;

@Local
public interface UserAuthenticationLocal {

	public User validate(String userName, String password);
	
}
