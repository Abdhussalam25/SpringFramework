package com.niit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.dao.CustomerOrderDao;
import com.niit.model.Cart;

@Service
public class CustomerOrderServiceImpl implements CustomerOrderService {
	
	@Autowired
	private CustomerOrderDao customerOrderDao;

	public void addCustomerOrder(Cart cart) {
		customerOrderDao.addCustomerOrder(cart);
		
	}

}
