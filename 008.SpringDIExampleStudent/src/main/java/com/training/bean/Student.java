package com.training.bean;

public class Student {

	private int rollNumber;
	private String name;
	private Stream stream;
	public Student() {
		super();
	}
	public Student(int rollNumber, String name, Stream stream) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.stream = stream;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Stream getStream() {
		return stream;
	}
	public void setStream(Stream stream) {
		this.stream = stream;
	}

	public void display() {
		System.out.println("Student [rollNumber=" + rollNumber + ", name=" + name + ", stream=" + stream);
	}
	
	
	
	
}
