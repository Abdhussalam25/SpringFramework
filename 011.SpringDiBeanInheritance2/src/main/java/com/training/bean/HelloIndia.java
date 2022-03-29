package com.training.bean;

public class HelloIndia {
	private String message1;
	private String message2;
	private String message3;
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
	public String getMessage3() {
		return message3;
	}
	public void setMessage3(String message3) {
		this.message3 = message3;
	}
	public HelloIndia() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HelloIndia(String message1, String message2, String message3) {
		super();
		this.message1 = message1;
		this.message2 = message2;
		this.message3 = message3;
	}
	@Override
	public String toString() {
		return "\nHelloIndia=>message1=" + message1 + ", message2=" + message2 + ", message3=" + message3;
	}
	
}
