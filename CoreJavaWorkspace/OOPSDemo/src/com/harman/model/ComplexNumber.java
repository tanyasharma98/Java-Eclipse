package com.harman.model;

public class ComplexNumber {
	// Data Member--- instance variable
	// private = data hiding;
	private double realPart;
	private double imaginaryPart;
	
	//Now for encapsulation - example providing buttons
	
	// Methods -- setters(Mutators) and getters(accessor)
	// Access Specifier --- default(friendly) public private protected
	public void setRealPart(double realPart) {
		this.realPart = realPart;
	}
	public void setImaginaryPart(double imag) {
		imaginaryPart = imag;
	}
	
	public double getRealPart() {
		return realPart;
	}
	public double getImaginaryPart() {
		return imaginaryPart;
	}
}
