package com.training.bean;

public class TrianglePoints {
	private int xPoint;
	private int yPoint;
	public int getxPoint() {
		return xPoint;
	}
	public void setxPoint(int xPoint) {
		this.xPoint = xPoint;
	}
	public int getyPoint() {
		return yPoint;
	}
	public void setyPoint(int yPoint) {
		this.yPoint = yPoint;
	}
	public TrianglePoints() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TrianglePoints(int xPoint, int yPoint) {
		super();
		this.xPoint = xPoint;
		this.yPoint = yPoint;
	}
	@Override
	public String toString() {
		return "\nTrianglePoints=>xPoint=" + xPoint + ", yPoint=" + yPoint;
	}
	
}
