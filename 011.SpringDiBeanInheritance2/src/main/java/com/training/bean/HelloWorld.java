package com.training.bean;

public class HelloWorld {
	private String message1;
	private String message2;
	public String getMessage1() {
		return message1;
	}
	public void setMessage1(String message1) {
		this.message1 = message1;
	}
	public String getMessage2() {
		return message2;
	}
	public void setMessage2(String message2) {
		this.message2 = message2;
	}
	public HelloWorld() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HelloWorld(String message1, String message2) {
		super();
		this.message1 = message1;
		this.message2 = message2;
	}
	@Override
	public String toString() {
		return "\nHelloWorld=>message1=" + message1 + ", message2=" + message2;
	}
	
}
