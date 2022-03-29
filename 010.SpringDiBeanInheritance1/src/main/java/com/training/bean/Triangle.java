package com.training.bean;

public class Triangle {
	private TrianglePoints pointA;
	private TrianglePoints pointB;
	private TrianglePoints pointC;
	public TrianglePoints getPointA() {
		return pointA;
	}
	public void setPointA(TrianglePoints pointA) {
		this.pointA = pointA;
	}
	public TrianglePoints getPointB() {
		return pointB;
	}
	public void setPointB(TrianglePoints pointB) {
		this.pointB = pointB;
	}
	public TrianglePoints getPointC() {
		return pointC;
	}
	public void setPointC(TrianglePoints pointC) {
		this.pointC = pointC;
	}

	public void drawTriangle() {
		System.out.println(this.getPointA());
		System.out.println(this.getPointB());
		System.out.println(this.getPointC());
	}


}
