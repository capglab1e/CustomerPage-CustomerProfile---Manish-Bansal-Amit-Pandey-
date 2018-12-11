package com.cg.capstore.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.cg.capstore.dto.Customer;
import com.cg.capstore.dto.Feedback;
import com.cg.capstore.dto.Orders;
import com.cg.capstore.dto.WishList;

@Repository
public class CapStoreDaoImpl implements ICapStoreDao {
	
	@PersistenceContext
	EntityManager manager;

	

	@Override
	public List<Orders> getAllOrders() {
		String str = "select order from Orders order";
		TypedQuery<Orders> query=
				manager.createQuery(str, Orders.class);
		return query.getResultList();	
	}

	@Override
	public List<WishList> getAllWishList() {
		String str = "select wishlist from WishList wishlist";
		TypedQuery<WishList> query=
				manager.createQuery(str, WishList.class);
		return query.getResultList();
	}

	@Override
	public int addfeedback(Feedback fed) {
		manager.persist(fed);
		manager.flush();
		return fed.getFeedbackId();
	}


	@Override
	public String updateCustomer(Customer custId) {
		manager.merge(custId);
		manager.flush();
		return custId.getUserId();
	}

	@Override
	public List<Customer> getAllCustomer() {
		System.out.println("in dao class method....");
		String str = "select customer from Customer customer ";
		TypedQuery<Customer> query=
				manager.createQuery(str, Customer.class);
		return query.getResultList();
		
	}
	

	@Override
	public Customer getCustomerDetails(String custId) {
		Customer customer=manager.find(Customer.class, custId);
		return customer;
	}

	@Override
	public void setStatus(String Status) {
		Orders order= new Orders();
		order.setOrderStatus(Status);
		manager.persist(order);
		
	}

	@Override
	public String checkStatus(int id) {
		Orders order =manager.find(Orders.class, id);
		System.out.println(order.getOrderStatus());
		return order.getOrderStatus();
	}


}
