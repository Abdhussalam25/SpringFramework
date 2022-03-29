package com.training.bean;

import org.springframework.beans.factory.config.AbstractFactoryBean;

public class StudentFactoryBean extends AbstractFactoryBean<Student> {

	private String stStream;
	
	
	
	public StudentFactoryBean() {
		super();
	}
	

	public String getstStream() {
		return stStream;
	}

	public void setstStream(String stStream) {
		this.stStream = stStream;
	}

	@Override
	public Class<Student> getObjectType() {
		
		return Student.class;
	}

	@Override
	protected Student createInstance() throws Exception {
		Student student =  new Student();
		student.setRollNUmber(111);
		student.setName("Basha");
		student.setMarks(new float[] { 65,75,85});
		student.setStream(stStream);
		
		
		
		return student;
	}
	
	//rolenumber
	//name
	//marks
	//stStream sci,comm,or arts

}
