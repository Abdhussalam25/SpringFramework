package com.training.bean;

import org.springframework.beans.factory.config.AbstractFactoryBean;

public class EmployeeFactoryBean extends AbstractFactoryBean<Object>{
	private String designation;
	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public Class<Employee> getObjectType() {
		return Employee.class;
	}

	@Override
	protected Object createInstance() throws Exception {
		Employee emp=new Employee();
		emp.setEmpId(111);
		emp.setEmpFirstName("Lalitha");
		emp.setEmpLastName("Singh");
		emp.setEmpContactNumber("2334455667");
		emp.setEmpDesignation(designation);
		emp.setEmpSalary(67890);
		return emp;
	}

}
