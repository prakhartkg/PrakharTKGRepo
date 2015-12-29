package com.yash.ejbdemo.service;


import javax.ejb.LocalBean;
import javax.ejb.Stateful;


import com.yash.ejbdemo.dao.UserDao;
import com.yash.ejbdemo.domain.User;

/**
 * Session Bean implementation class UserAuthentication
 */
@Stateful
@LocalBean
public class UserAuthentication implements UserAuthenticationLocal {

	UserDao userDao = new UserDao();
	@Override
	public User validate(String userName, String password) {
		
		User user=userDao.getUser(userName,password);
		return user;
	}

	
    
    
}
