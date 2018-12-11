package com.cg.capstore.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.capstore.dao.ICapStoreDao;
import com.cg.capstore.dto.Customer;
import com.cg.capstore.dto.Feedback;
import com.cg.capstore.dto.Orders;
import com.cg.capstore.dto.WishList;


@Service
@Transactional
public class CapStoreServiceImpl implements ICapStoreService {

	@Autowired
	ICapStoreDao dao;
	
	@Override
	public List<Orders> getAllOrders() {
		return dao.getAllOrders();
	}

	@Override
	public List<WishList> getAllWishList() {
		return dao.getAllWishList();
	}

	@Override
	public int addfeedback(Feedback fed) {
		// TODO Auto-generated method stub
		return dao.addfeedback(fed);
	}

	@Override
	public String updateCustomer(Customer custId) {
		// TODO Auto-generated method stub
		return dao.updateCustomer(custId);
	}

	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return dao.getAllCustomer();
	}

	@Override
	public Customer getCustomerDetails(String custId) {
		// TODO Auto-generated method stub
		return dao.getCustomerDetails(custId);
	}

	@Override
	public void orderStatus(String status) {
		dao.setStatus(status);
		
	}

	@Override
	public String showStatus(int id) {
		return dao.checkStatus(id);
	}

}
