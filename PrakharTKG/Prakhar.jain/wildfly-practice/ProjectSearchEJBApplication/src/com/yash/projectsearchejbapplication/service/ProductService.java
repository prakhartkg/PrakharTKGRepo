package com.yash.projectsearchejbapplication.service;



import java.util.ArrayList;
import java.util.List;

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

	@Override
	public List<Product> search(Product product,List<Product> productList) {
		List<Product> searchedList=null;
		
			searchedList=new ArrayList<>();
			for(Product product1:productList){
				if((product.getProductName().equals(product1.getProductName())) && (product.getCity()).equals("") && (product.getVendor().equals("")) )
					searchedList.add(product1);
				else if((product.getProductName().equals(product1.getProductName()))&&(product.getCity().equals(product1.getCity()))&&(product.getVendor().equals("")))
					searchedList.add(product1);
				else if(product.getProductName().equals("") && product.getProductName().equals("") && product.getVendor().equals(""))
					searchedList.add(product1);
					
				
			
				
		}
		return searchedList;
		
		
	}
   

}
