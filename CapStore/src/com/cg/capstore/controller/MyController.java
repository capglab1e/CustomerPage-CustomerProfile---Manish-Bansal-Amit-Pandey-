package com.cg.capstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.capstore.dto.Customer;
import com.cg.capstore.dto.Feedback;
import com.cg.capstore.dto.Orders;
import com.cg.capstore.dto.WishList;
import com.cg.capstore.service.ICapStoreService;



@Controller
public class MyController {

	@Autowired
	ICapStoreService service;

	public ICapStoreService getService() {
		return service;
	}

	public void setService(ICapStoreService service) {
		this.service = service;
	}

	@RequestMapping("getorderlist")
	public String showOrderList(Model model) {
		// List<Order> list=service.getAllOrders();
		// model.addAttribute("list", list);
		return "index";
	}

	@RequestMapping("getorder")
	public String showOrdList(Model model) {
		List<Orders> list = service.getAllOrders();
		model.addAttribute("list", list);
		return "order";
	}

	@RequestMapping("getWishList")
	public String showWishList(Model model) {
		List<WishList> list = service.getAllWishList();
		model.addAttribute("list", list);
		return "wishlist";
	}

	@RequestMapping("getFeedback")
	public String insertFeedback(@ModelAttribute("my") Feedback fed) {
		return "feedback";
	}

	@RequestMapping(value = "insertfeedback", method = RequestMethod.POST)
	public ModelAndView addfeedback(@ModelAttribute("my") Feedback fed) {
		int id = 0;
		id = service.addfeedback(fed);
		return new ModelAndView("Success", "deg", id);
	}

	@RequestMapping("getSearch")
	public String searchCustomer(@ModelAttribute("my") Customer c) {
		return "search";
	}

	@RequestMapping("getUpdatePage")
	public ModelAndView sendUpdatePage(@ModelAttribute("my") Customer custo) {
		String custId = custo.getUserId();
		Customer cust1 = service.getCustomerDetails(custId);
			return new ModelAndView("update", "temp", cust1);
		}

	


	@RequestMapping("updateAction")
	public ModelAndView updateMobile(@ModelAttribute("my") Customer customer,Model model) {
		service.updateCustomer(customer);
		List<Customer> list=service.getAllCustomer();
		model.addAttribute("list", list);
		return new ModelAndView("success1");
	}
	
	@RequestMapping("status")
	public String setStatttus(Model model) {
		return "status";
	}
	
	@RequestMapping("setvalue")
	public String setStattus(Model model) {
		return "statussuccess";
	}
	
	

}
