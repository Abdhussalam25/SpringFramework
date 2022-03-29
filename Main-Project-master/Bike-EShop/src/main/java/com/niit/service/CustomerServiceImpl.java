package com.niit.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.controller.ProductController;
import com.niit.dao.CustomerDao;
import com.niit.model.Customer;


@Service
public class CustomerServiceImpl implements CustomerService {
	
	
	@Autowired
	private CustomerDao customerdao;
	

	Logger logger = Logger.getLogger(ProductController.class);

	public CustomerServiceImpl() {

		logger.debug("Creating the instance for Customer controller");
	}
	

	public Customer saveCustomer(Customer customer) {
		
		return customerdao.saveCustomer(customer);
	}


	public Customer getCustomerByUsername(String userName) {
		
		return customerdao.getCustomerByUsername(userName);
	}

}
