package com.training.bean;

public class Student {
	private int rollNumber;
	private String studentName;
	private String studentStream;
	private float avtMarks;
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentStream() {
		return studentStream;
	}
	public void setStudentStream(String studentStream) {
		this.studentStream = studentStream;
	}
	public float getAvtMarks() {
		return avtMarks;
	}
	public void setAvtMarks(float avtMarks) {
		this.avtMarks = avtMarks;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int rollNumber, String studentName, String studentStream, float avtMarks) {
		super();
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		studentStream = studentStream;
		this.avtMarks = avtMarks;
	}
	@Override
	public String toString() {
		return "\nStudent => rollNumber=" + rollNumber + ", studentName=" + studentName + ", StudentStream=" + studentStream
				+ ", avtMarks=" + avtMarks;
	}
	

}
