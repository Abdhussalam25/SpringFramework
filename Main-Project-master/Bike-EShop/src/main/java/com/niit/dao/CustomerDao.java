package com.niit.dao;

import com.niit.model.Customer;

public interface CustomerDao {
	
	Customer saveCustomer(Customer customer);

	
	Customer getCustomerByUsername(String userName);

}
