package com.training.bean;

public class Triangle {

	
	private TrianglePoints pointA;
	private TrianglePoints pointC;
	private TrianglePoints pointB;
	public Triangle() {
		super();
	}
	public Triangle(TrianglePoints pointA, TrianglePoints pointC, TrianglePoints pointB) {
		super();
		this.pointA = pointA;
		this.pointC = pointC;
		this.pointB = pointB;
	}
	public TrianglePoints getPointA() {
		return pointA;
	}
	public void setPointA(TrianglePoints pointA) {
		this.pointA = pointA;
	}
	public TrianglePoints getPointC() {
		return pointC;
	}
	public void setPointC(TrianglePoints pointC) {
		this.pointC = pointC;
	}
	public TrianglePoints getPointB() {
		return pointB;
	}
	public void setPointB(TrianglePoints pointB) {
		this.pointB = pointB;
	}
	
	public void drawTriangle() {
		System.out.println(this.getPointA());
		System.out.println(this.getPointB());
		System.out.println(this.getPointC());
		
	}
	
	@Override
	public String toString() {
		return "Triangle [pointA=" + pointA + ", pointC=" + pointC + ", pointB=" + pointB + "]";
	}
	
	
}
