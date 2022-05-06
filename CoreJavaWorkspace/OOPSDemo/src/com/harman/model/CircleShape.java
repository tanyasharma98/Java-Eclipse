package com.harman.model;

public class CircleShape extends Shape {

	public CircleShape() {
		// Default Constructor
	}

	public CircleShape(double firstDimension) {
		super(firstDimension);
		 
	}

	@Override
	public double getArea() {
		return Math.PI*getFirstDimension()*getFirstDimension();
	}

}
