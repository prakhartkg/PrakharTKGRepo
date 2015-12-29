package com.yash.projectsearchejbapplication.service;

import java.util.List;
import java.util.Set;

import javax.ejb.Local;

import com.yash.projectsearchejbapplication.pojo.Product;

@Local
public interface ProductServiceLocal {
	
	public void init();
	public List<Product> fetchAllProduct();
	public List<Product> fetchProductByProductName(String productName);

}
