package com.niit.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Category implements Serializable {
	@Id
	@NotNull
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id; 
	
	
	private String categoryDetails;
	
	@JsonIgnore
	@OneToMany(mappedBy="categoryDetails")
	private List<Product>Products;    
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategoryDetails() {
		return categoryDetails;
	}
	@JsonIgnore
	public List<Product> getProducts() {
		return Products;
	}

	public void setProducts(List<Product> products) {
		Products = products;
	}

	public void setCategoryDetails(String categoryDetails) {
		this.categoryDetails = categoryDetails;
	}
	@Override
	public String toString() {
		return this.id + " " + this.categoryDetails;
	}
	

}
