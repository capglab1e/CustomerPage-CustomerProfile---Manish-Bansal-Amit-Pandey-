package com.cg.capstore.service;

import java.util.List;

import com.cg.capstore.dto.Customer;
import com.cg.capstore.dto.Feedback;
import com.cg.capstore.dto.Orders;
import com.cg.capstore.dto.WishList;

public interface ICapStoreService {
	
	public List<Orders> getAllOrders();
	public List<WishList> getAllWishList();
	public int addfeedback(Feedback fed);
	public String updateCustomer(Customer custId);
	public List<Customer> getAllCustomer();
	public Customer getCustomerDetails(String custId);

	public void orderStatus(String status);
	public String showStatus(int id);
}
