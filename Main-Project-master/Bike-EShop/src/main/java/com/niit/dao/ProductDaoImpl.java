package com.niit.dao;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.niit.model.Product;

@Repository
public class ProductDaoImpl implements ProductDao {
	@Autowired
	private SessionFactory sessionfactory;

	public ProductDaoImpl() {
		System.out.println("CREATING THE INSTANCE FOR PRODUCTDAOIMPL");
	}

	public Product saveProduct(Product product) {
		
		System.out.println(product.getId());// Why i am writing this line
		Session session = sessionfactory.openSession();
		//Transaction Tx=(Transaction)session.beginTransaction();
		session.save(product);
		//Tx.commit();
		session.flush();
		session.close();
		System.out.println(product.getId());// What is the use of this line
		return product;

	}
	public List<Product> getAllProducts() {
		Session session=sessionfactory.openSession();
		Query query=session.createQuery("from Product");
		List<Product> products=query.list();
		for(Product p:products)
		{System.out.println(p.getName());}
		session.close();
		return products;
	}

	
	public Product getProductById(int id) {
		Session session=sessionfactory.openSession();
		//select * from product where id=34
		Product product=(Product)session.get(Product.class,id);
		session.close();
		return product;
	}

	public void deleteProduct(int id) {
		Session session=sessionfactory.openSession();
		//Make the object persistent[read the data from the table and add it to session]
		Product product=(Product)session.get(Product.class, id);
		session.delete(product);
		session.flush();
		session.close();
		
	}

	public void updateProduct(Product product) {
		Session session=sessionfactory.openSession();
		System.out.println("Id of the product in dao is " + product.getId());
		session.update(product); //update product set ..... where id=?
		session.flush();
		session.close();
		
	}

/**
	public Product getProductByCategory(int cid) {
			Session session=sessionfactory.openSession();
			//select * from product where category cid=new arrival ie 3 
			Product products=(Product)session.get(Product.class,cid);
			session.close();
			return products;
		}*/

}