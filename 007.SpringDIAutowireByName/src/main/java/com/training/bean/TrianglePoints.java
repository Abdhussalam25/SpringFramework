package com.training.bean;

public class TrianglePoints {
	
	private int xPoint;
	private int yPoint;
	public TrianglePoints() {
		super();
	}
	public TrianglePoints(int xPoint, int yPoint) {
		super();
		this.xPoint = xPoint;
		this.yPoint = yPoint;
	}
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
	@Override
	public String toString() {
		return "TrianglePoints   ==> xPoint=" + xPoint + ", yPoint=" + yPoint ;
	}
	
	
	
	
	

}
