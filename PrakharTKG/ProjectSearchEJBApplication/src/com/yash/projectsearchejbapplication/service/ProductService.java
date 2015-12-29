package com.yash.projectsearchejbapplication.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import com.yash.projectsearchejbapplication.pojo.Product;

/**
 * Session Bean implementation class ProductService
 */
@Stateless
@LocalBean
public class ProductService implements ProductServiceLocal {

    /**
     * Default constructor. 
     */
    public ProductService() {
        
    }
    List<Product> products;
    @PostConstruct
    @Override
    public void init(){
    	 products = new ArrayList<>();
    	products.add(new Product("Tv", "LG", "Indore"));
    	products.add(new Product("mobile", "LG", "Indore"));
    	products.add(new Product("microwave", "LG", "Indore"));
    	products.add(new Product("laptop", "LG", "Pune"));
    	products.add(new Product("Tv", "Samsung", "Indore"));
    	products.add(new Product("mobile", "Samsung", "Pune"));
    	products.add(new Product("microwave", "Samsung", "Indore"));
    	products.add(new Product("laptop", "Samsung", "Pune"));
    	products.add(new Product("Tv", "Sony", "Indore"));
    	products.add(new Product("mobile", "Sony", "Indore"));
    	products.add(new Product("microwave", "Sony", "Indore"));
    	products.add(new Product("laptop", "Sony", "Pune"));
    	products.add(new Product("Tv", "Sony", "Indore"));
    	products.add(new Product("mobile", "Apple", "Mumbai"));
    	products.add(new Product("microwave", "Sony", "Mumbai"));
    	products.add(new Product("laptop", "LG", "Pune"));
    	
    	
    }

	@Override
	public List<Product> fetchAllProduct() {
		
		return products;
	}

	@Override
	public List<Product> fetchProductByProductName(String productName) {
		List<Product> list = new ArrayList<>();
		for (Product product : products) {
			if(product.getProductName().equalsIgnoreCase(productName)){
				list.add(product);
			}
			
		}
		this.products=list;
		return products;
	}

}
