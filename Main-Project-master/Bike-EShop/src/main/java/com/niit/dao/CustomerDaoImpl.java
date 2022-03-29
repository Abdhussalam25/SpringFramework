package com.niit.dao;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.controller.ProductController;
import com.niit.model.Authorities;
import com.niit.model.Cart;
import com.niit.model.Customer;
import com.niit.model.Users;

@Repository
public class CustomerDaoImpl implements CustomerDao {
	

	@Autowired
	private SessionFactory sessionfactory;
	
	Logger logger = Logger.getLogger(ProductController.class);

	public CustomerDaoImpl() {

		logger.debug("Creating the instance for Customer controller");
	}
	
	
	public Customer saveCustomer(Customer customer) { // either i can use customer as return type or i can use void also.
				
		Session session = sessionfactory.openSession();
		logger.debug("=============================================================================");
		customer.getUsers().setEnabled(true);
				// hence in customer form there to label for cart and authorities.  
		String username=customer.getUsers().getUserName();
		String role="ROLE_USER";
		
		// we are creating a out bond relationship between authorities and customer.
		// so we have to create a instance to the Authorities here.
		Authorities authorities=new Authorities();
		// we are setting the values
		authorities.setUsername(username);
		authorities.setRole(role);
		
		session.save(authorities);  //insert into authorities values (?,?,'Role_USER');
		
		// similarly for cart also we don't have any label for cart in registration form so we have create an out bound relationship here.
		
		Cart cart=new Cart();
		customer.setCart(cart);
		
		cart.setCustomer(customer);
		// now once again we are coming to normal procedure		
		session.save(customer);
		session.flush();
		session.close();
		return customer;  
			
	}


	
	public Customer getCustomerByUsername(String userName) {
		Session session=sessionfactory.openSession();
		Query query=session.createQuery("from Users where userName=?");
		query.setString(0, userName);
		Users users=(Users)query.uniqueResult();
		//com.niit.model.Users 
		Customer customer=users.getCustomer();
		session.close();
		return customer;
	}
	
	

}
