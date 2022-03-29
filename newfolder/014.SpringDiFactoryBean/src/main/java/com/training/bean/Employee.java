package com.training.bean;

public class Employee {
	private int empId;
	private String empFirstName;
	private String empLastName;
	private String empContactNumber;
	private String empDesignation;
	private double empSalary;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpFirstName() {
		return empFirstName;
	}
	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}
	public String getEmpLastName() {
		return empLastName;
	}
	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}
	public String getEmpContactNumber() {
		return empContactNumber;
	}
	public void setEmpContactNumber(String empContactNumber) {
		this.empContactNumber = empContactNumber;
	}
	public String getEmpDesignation() {
		return empDesignation;
	}
	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empId, String empFirstName, String empLastName, String empContactNumber, String empDesignation,
			double empSalary) {
		super();
		this.empId = empId;
		this.empFirstName = empFirstName;
		this.empLastName = empLastName;
		this.empContactNumber = empContactNumber;
		this.empDesignation = empDesignation;
		this.empSalary = empSalary;
	}
	@Override
	public String toString() {
		return "\nEmployee => empId=" + empId + ", empFirstName=" + empFirstName + ", empLastName=" + empLastName
				+ ", empContactNumber=" + empContactNumber + ", empDesignation=" + empDesignation + ", empSalary="
				+ empSalary;
	}
	

}
