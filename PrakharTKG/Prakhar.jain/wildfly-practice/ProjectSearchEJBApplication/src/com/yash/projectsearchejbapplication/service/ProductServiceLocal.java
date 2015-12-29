package com.yash.projectsearchejbapplication.service;

import java.util.List;

import javax.ejb.Local;

import com.yash.projectsearchejbapplication.pojo.Product;

@Local
public interface ProductServiceLocal {

	List<Product> search(Product product, List<Product> listProduct);


}
