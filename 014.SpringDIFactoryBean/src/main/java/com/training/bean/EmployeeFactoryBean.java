package com.training.bean;

import org.springframework.beans.factory.config.AbstractFactoryBean;

public class EmployeeFactoryBean extends AbstractFactoryBean<Employee> {

	private String empDesignation;
	
	
	
	public EmployeeFactoryBean() {
		super();
	}
	
	

	public String getEmpDesignation() {
		return empDesignation;
	}



	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}



	@Override
	public Class<Employee> getObjectType() {
		
		return Employee.class;
	}

	@Override
	protected Employee createInstance() throws Exception {
		Employee emp =  new Employee();
		emp.setEmpId(111);
		emp.setEmpFName("lalitha");
		emp.setEmpLName("Singh");
		emp.setContactNumber("9788593257");
		emp.setDesignation(empDesignation);
		emp.setSalary(67890);
		
		return emp;
	}
	
	//rolenumber
	//name
	//marks
	//stream sci,comm,or arts

}
