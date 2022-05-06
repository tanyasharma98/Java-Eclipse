package com.harman.model;

public abstract class Shape {
	private double firstDimension;
	private double secondDimension;
	
	public Shape() {
		/*Default Constructor*/
	}
	
	public Shape(double firstDimension) {
		this.firstDimension = firstDimension;
		this.secondDimension = 0;
	}
	public Shape(double firstDimension, double secondDimension) {
		this.firstDimension = firstDimension;
		this.secondDimension = secondDimension;
	}

	public double getFirstDimension() {
		return firstDimension;
	}

	public void setFirstDimension(double firstDimension) {
		this.firstDimension = firstDimension;
	}

	public double getSecondDimension() {
		return secondDimension;
	}

	public void setSecondDimension(double secondDimension) {
		this.secondDimension = secondDimension;
	}
	public abstract double getArea();
	
	@Override
	public String toString() {
		return firstDimension+ "   ----   " + secondDimension;
	}
	
	@Override
	public boolean equals(Object obj) {
		Shape other = (Shape) obj; // Downcasting
		return this.firstDimension == other.getFirstDimension() && this.secondDimension == other.getSecondDimension();
		
	}
}
