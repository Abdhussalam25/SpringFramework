package com.training.bean;

import java.util.Arrays;

public class Student {

	private int rollNUmber;
	private String name;
	private float[] marks;
	private String stream;
	public Student() {
		super();
	}
	public Student(int rollNUmber, String name, float[] marks, String stream) {
		super();
		this.rollNUmber = rollNUmber;
		this.name = name;
		this.marks = marks;
		this.stream = stream;
	}
	public int getRollNUmber() {
		return rollNUmber;
	}
	public void setRollNUmber(int rollNUmber) {
		this.rollNUmber = rollNUmber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float[] getMarks() {
		return marks;
	}
	public void setMarks(float[] marks) {
		this.marks = marks;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	@Override
	public String toString() {
		return "\nStudent  ==> rollNUmber=" + rollNUmber + ", name=" + name + ", marks=" + Arrays.toString(marks)
				+ ", stream=" + stream;
	}
	
	
	
	
	
}
