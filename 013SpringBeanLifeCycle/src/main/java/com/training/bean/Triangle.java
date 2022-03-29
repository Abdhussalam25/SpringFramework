package com.training.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle implements InitializingBean,DisposableBean  {
	//InitializingBean,DisposableBean<>
	private TrianglePoints pointA;
	private TrianglePoints pointB;
	private TrianglePoints pointC;
	
	
	
	public Triangle() {
		super();
	}
	
	public Triangle(TrianglePoints pointA, TrianglePoints pointB, TrianglePoints pointC) {
		super();
		this.pointA = pointA;
		this.pointB = pointB;
		this.pointC = pointC;
	}

	
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
	
	public void afterPropertiesSet() throws Exception {
		
		System.out.println("This is the cleanup code just called after bean initialize...");
		
	}

	public void destroy() throws Exception {
		System.out.println("This is the cleanup code just called before bean die...");
		
	}
	

	
	public void drawTriangle() {
		System.out.println( "\nTriangle \n pointA=" + pointA + "\n pointB=" + pointB + " \n pointC=" + pointC );
	}
	
	
	
	
	

}
