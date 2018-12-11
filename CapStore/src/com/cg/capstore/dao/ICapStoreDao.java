package com.cg.capstore.dao;

import java.util.List;

import com.cg.capstore.dto.Customer;
import com.cg.capstore.dto.Feedback;
import com.cg.capstore.dto.Orders;
import com.cg.capstore.dto.WishList;



public interface ICapStoreDao {
	public List<Orders> getAllOrders();
	public List<WishList> getAllWishList();
	public int addfeedback(Feedback fed);
	public String updateCustomer(Customer custid);
	public List<Customer> getAllCustomer();
	public Customer getCustomerDetails(String custId);
	
	public void setStatus(String status);
	public String checkStatus(int id);

}
