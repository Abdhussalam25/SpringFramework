package com.niit.model;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name="PRODUCTTABLE")
public class Product implements Serializable {
	@Id
	@NotNull
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@NotEmpty(message="Product name is mandatory")
	private String name;
	@NotEmpty(message="description is mandatory")
	private String description;
	
	@Min(value=10)
	
		private double price;
	
	@Min(value=5)
	private int quantity;
	
	@NotNull(message="Manufacturing date is mandatory")
	private Date mfg;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="cid")
		private Category categoryDetails;
	//now declaration to the multipartfile
	
	@Transient
	private MultipartFile image;
/**	
//	@OneToMany(mappedBy="product")
//	private List<CartItem> cartItem;
	
	//public List<CartItem> getCartItem() {
//		return cartItem;
//	}
//	public void setCartItem(List<CartItem> cartItem) {
	//	this.cartItem = cartItem;
//	}*/
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Date getMfg() {
		return mfg;
	}
	public void setMfg(Date mfg) {
		this.mfg = mfg;
	}
	public Category getCategoryDetails() {
		return categoryDetails;
	}
	public void setCategoryDetails(Category categoryDetails) {
		this.categoryDetails = categoryDetails;
	}
	public MultipartFile getImage() {
		return image;
	}
	public void setImage(MultipartFile image) {
		this.image = image;
	}
	
	
}
