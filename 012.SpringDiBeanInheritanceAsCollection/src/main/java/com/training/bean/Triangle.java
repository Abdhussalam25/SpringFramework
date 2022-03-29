package com.training.bean;

import java.util.List;

public class Triangle {
	private List <TrianglePoints> points;

	public List<TrianglePoints> getPoints() {
		return points;
	}

	public void setPoints(List<TrianglePoints> points) {
		this.points = points;
	}

	public Triangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Triangle(List<TrianglePoints> points) {
		super();
		this.points = points;
	}

	public void drawTriangle(){
		for(TrianglePoints point:points)
			System.out.print(point);
	}
	
	
}
