package com.yash.product.bean;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.yash.product.model.City;
import com.yash.product.model.Product;
import com.yash.product.model.Vendor;

@ManagedBean
@SessionScoped
public class SearchBean {
	

	private Set<String>productNames;
	private Set<String> cities;
	private Set<String> vendors;
	private List<Product> products;
	
	@PostConstruct
	public void init(){
			System.out.println("post cons");
			List<Product> products=new ArrayList<>();
			products.add(new Product(1, "Mobile", new Vendor(1, "Apple", new City(1,"indore"))));
			products.add(new Product(1, "Mobile", new Vendor(1, "Apple", new City(1,"indore"))));
			products.add(new Product(1, "Mobile", new Vendor(1, "Apple", new City(1,"indore"))));
			products.add(new Product(1, "Mobile", new Vendor(1, "Apple", new City(2,"bhopal"))));
			products.add(new Product(1, "Mobile", new Vendor(2, "Xiaomi", new City(2,"bhopal"))));
			products.add(new Product(1, "Mobile", new Vendor(2, "Xiaomi", new City(2,"bhopal"))));
			products.add(new Product(1, "Mobile", new Vendor(3, "Samsung", new City(2,"bhopal"))));
			products.add(new Product(1, "Mobile", new Vendor(4, "LAVA", new City(3,"nagpur"))));
			products.add(new Product(1, "Mobile", new Vendor(5, "MOTO", new City(4,"nasik"))));
			products.add(new Product(1, "Mobile", new Vendor(6, "MicroMAX", new City(1,"indore"))));
			products.add(new Product(2, "Laptop", new Vendor(7, "DEll", new City(1,"indore"))));
			products.add(new Product(2, "Laptop", new Vendor(7, "DEll", new City(1,"indore"))));
			products.add(new Product(2, "Laptop", new Vendor(8, "HP", new City(2,"bhopal"))));
			products.add(new Product(2, "Laptop", new Vendor(8, "HP", new City(2,"bhopal"))));
			products.add(new Product(2, "Laptop", new Vendor(8, "HP", new City(3,"nagpur"))));
			products.add(new Product(2, "Laptop", new Vendor(8, "HP", new City(4,"nasik"))));
			products.add(new Product(2, "Laptop", new Vendor(9, "Assus", new City(1,"indore"))));
			products.add(new Product(2, "Laptop", new Vendor(9, "Assus", new City(2,"bhopal"))));
			products.add(new Product(2, "Laptop", new Vendor(9, "Assus", new City(3,"nagpur"))));
			products.add(new Product(2, "Laptop", new Vendor(10, "Lenove", new City(1,"indore"))));
			products.add(new Product(3, "Camera", new Vendor(10, "Apple", new City(1,"indore"))));
			products.add(new Product(3, "Camera", new Vendor(10, "Apple", new City(1,"indore"))));
			products.add(new Product(3, "Camera", new Vendor(10, "Apple", new City(1,"indore"))));
			products.add(new Product(3, "Camera", new Vendor(10, "Apple", new City(1,"indore"))));
			products.add(new Product(3, "Camera", new Vendor(10, "Apple", new City(1,"indore"))));
			products.add(new Product(3, "Camera", new Vendor(10, "Apple", new City(1,"indore"))));
			products.add(new Product(3, "Camera", new Vendor(10, "Apple", new City(1,"indore"))));
			products.add(new Product(3, "Camera", new Vendor(10, "Apple", new City(1,"indore"))));
			products.add(new Product(3, "Camera", new Vendor(10, "Apple", new City(1,"indore"))));
			products.add(new Product(3, "Camera", new Vendor(10, "Apple", new City(1,"indore"))));
			cities=new HashSet<>();
			productNames=new HashSet<>();
			vendors=new HashSet<>();
			for(Product product:products){
				cities.add(product.getVendor().getCity().getCity());
				productNames.add(product.getProductName());
				vendors.add(product.getVendor().getVendorName());
			}
			System.out.println(cities);
			System.out.println(vendors);
			System.out.println(productNames);
		
	}

	

	public Set<String> getProductNames() {
		return productNames;
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
