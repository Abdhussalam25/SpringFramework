package com.niit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.niit.dao.CategoryDao;
import com.niit.model.Category;

@Service
public class CategoryServiceImpl implements CategoryService {
		
@Autowired
private CategoryDao categoryDao;

	public CategoryServiceImpl() {
	
		System.out.println("Instance creating for CATEGORYSERVICEIMPL");
	
}


	//@Transactional
	public List<Category> getCategories(){
		return categoryDao.getCategories();
	}


	public Category getProductsByCategory(String category) {
		return null;
		//public Product getProductById(int id) {
			//Session session=sessionfactory.openSession();
			//select * from product where id=34
			//Product product=(Product)session.get(Product.class,id);
			//session.close();
			//return product;
		}
	}


