package com.yash.shopping.bean;


import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.yash.shopping.dao.CustomerDao;
import com.yash.shopping.dao.OrderDao;
import com.yash.shopping.dao.ProductDao;
import com.yash.shopping.pojo.Cart;
import com.yash.shopping.pojo.Customer;
import com.yash.shopping.pojo.Product;

@ManagedBean
@SessionScoped
public class LoginBean {
	@EJB
	private Customer customer;
	private String userName;
	private String password;
	private List<Product> productList=new ArrayList<>();
	private Cart cart=new Cart();

	public List<Product> getProductList() {
		return productList;
	}
	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
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
	
	public String validateLogin(){
		customer=CustomerDao.doLogin(userName,password);
		if(customer!=null){
		return "Login";
		}
		return "Login.xhtml?err=Invalid Login & faces-redirect=true";
	}

	public String selectProduceMen(){
		productList=ProductDao.selectList("men");
		return null;
	}
	
	public String selectProduceWomen(){
		productList=ProductDao.selectList("women");
		return null;
	}
	
	public String selectProduceKids(){
		productList=ProductDao.selectList("kids");
		return null;
	}
	public String updateCart(){
		cart.setAmt(cart.getQty()*cart.getProduct().getPrice());
		return "Payment";
	}
	
	public String logout(){
		customer=null;
		return "Login";
	}
	
	public String setProduct(int index){
		System.out.println(productList.get(index));
		cart.setProduct(productList.get(index));
		return null;
	}
	
	public String placeOrder(){
		OrderDao.placeOrder(cart,customer);
		return "Welcome";
	}
}
