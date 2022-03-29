package com.niit.service;

import com.niit.model.Customer;

public interface CustomerService {
	
	Customer saveCustomer(Customer customer);

	public Customer getCustomerByUsername(String userName);

}
