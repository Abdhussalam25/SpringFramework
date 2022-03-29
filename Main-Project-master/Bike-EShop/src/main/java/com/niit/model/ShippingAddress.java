package com.niit.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;
@Entity
public class ShippingAddress implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private int id;
	
	@NotEmpty(message="Please Enter the apartmentNumber")
private String apartmentNumber;
	@NotEmpty(message="Please Enter the streetName")
private String streetName;
	@NotEmpty(message="Please Enter the city")
private String city;
	@NotEmpty(message="Please Enter the State")
private String State;
	@NotEmpty(message="Please Enter the country")
private String country;
	@NotEmpty(message="Please Enter the Zipcode")
private String zipCode;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getApartmentNumber() {
	return apartmentNumber;
}
public void setApartmentNumber(String apartmentNumber) {
	this.apartmentNumber = apartmentNumber;
}
public String getStreetName() {
	return streetName;
}
public void setStreetName(String streetName) {
	this.streetName = streetName;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return State;
}
public void setState(String state) {
	State = state;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public String getZipCode() {
	return zipCode;
}
public void setZipCode(String zipCode) {
	this.zipCode = zipCode;
}

}