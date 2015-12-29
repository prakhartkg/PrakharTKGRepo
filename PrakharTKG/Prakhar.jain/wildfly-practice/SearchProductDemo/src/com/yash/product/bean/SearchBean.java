package com.yash.product.bean;

import java.util.List;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.yash.product.model.Product;

@ManagedBean
@RequestScoped
public class SearchBean {
	private Set<String>productNames;
	private Set<String> cities;
	private Set<String> vendors;
	private List<Product> products;



	public Set<String> getProductNames() {
		return productNames;
	}


	@PostConstruct
	public void init(){
		System.out.println("hello");
	}


	public void setProductNames(Set<String> productNames) {
		this.productNames = productNames;
	}





	public Set<String> getCities() {
		return cities;
	}





	public void setCities(Set<String> cities) {
		this.cities = cities;
	}





	public Set<String> getVendors() {
		return vendors;
	}





	public void setVendors(Set<String> vendors) {
		this.vendors = vendors;
	}





	public List<Product> getProducts() {
		return products;
	}





	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	
	public String serarch(){
		return null;
	}

}
