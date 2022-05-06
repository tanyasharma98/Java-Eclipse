package com.harman.model;

public class Human extends Person {
	private double fee;
	
	public Human() {
//		Default Constructor
	}
	public Human(String name , int age , double fee) {
		super(name, age);
		this.fee = fee;
		//super.name = name; === not allowed
		//this.age = age; -- warning
		// Invoke constructor from sub class
	}
	public double getFee() {
		return fee;
	}
}
