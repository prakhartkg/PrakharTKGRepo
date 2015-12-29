package com.yash.shopping.dao;

import java.sql.Connection;

import com.yash.shopping.pojo.Cart;
import com.yash.shopping.pojo.Customer;

public class OrderDao {

	public static void placeOrder(Cart cart, Customer customer) {
		Connection connection=CustomerDao.getConnection();
		String Sql="Insert into orders (userId,productId,amount) values("+customer.getUserId()+","+cart.getProduct().getProductId()+","+cart.getAmt()+")";
		System.out.println(Sql);
	}

}
