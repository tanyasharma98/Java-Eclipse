package com.harman.model;

public class RectShape extends Shape {

	public RectShape() {
		// Default Constructor
	}

	public RectShape(double firstDimension, double secondDimension) {
		super(firstDimension, secondDimension);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return getFirstDimension() * getSecondDimension();
	}

}
