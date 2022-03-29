package com.training.bean;

public class Student {

	private int rollNumber;
	private String studentName;
	private String studentStream;
	private float avgMarks;
	public Student() {
		super();
	}
	public Student(int rollNumber, String studentName, String studentStream, float avgMarks) {
		super();
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		this.studentStream = studentStream;
		this.avgMarks = avgMarks;
	}
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
	public float getAvgMarks() {
		return avgMarks;
	}
	public void setAvgMarks(float avgMarks) {
		this.avgMarks = avgMarks;
	}
	@Override
	public String toString() {
		return "\nStudent  ==>rollNumber=" + rollNumber + ", studentName=" + studentName + ", studentStream=" + studentStream
				+ ", avgMarks=" + avgMarks ;
	}
	
	
	
	
}
