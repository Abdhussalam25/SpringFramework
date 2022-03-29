package com.niit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.niit.dao.ProductDao;
import com.niit.model.Product;

@Service
public class ProductServiceImpl implements ProductService  {
	
  @Autowired
	private ProductDao productdao;

	public ProductServiceImpl() {
		System.out.println("CREATING THE INSTANCE FOR PRODUCTSERVICEIMPL");
		
		 
	}

		public Product saveProduct(Product product) {

		return productdao.saveProduct(product);
	}
	
		public List<Product> getAllProducts(){
			return productdao.getAllProducts();
		}

		public Product getProductById(int id) {
			// TODO Auto-generated method stub
			return productdao.getProductById(id);
		}

		public void deleteProduct(int id) {
			productdao.deleteProduct(id);
			// TODO Auto-generated method stub
			
		}

		public void updateProduct(Product product) {
			productdao.updateProduct(product);// TODO Auto-generated method stub
			
		}

	/**	public Product getProductByCategory(int cid) {
			// TODO Auto-generated method stub
			return productdao.getProductByCategory(cid);
		}*/
	
	

}

