package com.yash.projectsearchejbapplication.pojo;

public class Product implements Comparable{
	
	private String productName;
	private String vendor;
	private String city;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Product [productName=" + productName + ", vendor=" + vendor + ", city=" + city + "]";
	}

	public Product(String productName, String vendor, String city) {
		super();
		this.productName = productName;
		this.vendor = vendor;
		this.city = city;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getVendor() {
		return vendor;
	}
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
