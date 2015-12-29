package com.yash.ejbdemo.bean;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.yash.ejbdemo.domain.User;
import com.yash.ejbdemo.service.UserAuthentication;
import com.yash.ejbdemo.service.UserAuthenticationLocal;

@ManagedBean
@SessionScoped
public class UserBean {
	private String userName;
	private String password;
	private User validUser;
	
	UserAuthenticationLocal userAuthentication = new UserAuthentication();
		
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User getValidUser() {
		return validUser;
	}
	public void setValidUser(User validUser) {
		this.validUser = validUser;
	}
	
	
	public UserAuthenticationLocal getUserAuthentication() {
		return userAuthentication;
	}
	public void setUserAuthentication(UserAuthenticationLocal userAuthentication) {
		this.userAuthentication = userAuthentication;
	}
	public String authenticate(){
		System.out.println(userName);
		System.out.println(password);
		validUser=userAuthentication.validate(userName,password);
		System.out.println(validUser+"---------------check bean-----------");
		return null;
	}

}
