package com.training.bean;

public class Employee {
	
	private int empId;
	private String empFName;
	private String empLName;
	private String contactNumber;
	private String designation;
	private double salary;
	public Employee() {
		super();
	}
	public Employee(int empId, String empFName, String empLName, String contactNumber, String designation,
			double salary) {
		super();
		this.empId = empId;
		this.empFName = empFName;
		this.empLName = empLName;
		this.contactNumber = contactNumber;
		this.designation = designation;
		this.salary = salary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpFName() {
		return empFName;
	}
	public void setEmpFName(String empFName) {
		this.empFName = empFName;
	}
	public String getEmpLName() {
		return empLName;
	}
	public void setEmpLName(String empLName) {
		this.empLName = empLName;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return " \nEmployee  => empId=" + empId + ", empFName=" + empFName + ", empLName=" + empLName + ", contactNumber="
				+ contactNumber + ", designation=" + designation + ", salary=" + salary ;
	}
	
	
	

}
