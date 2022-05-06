package com.harman.model;

public class Employee extends Person {
	private double salary;
	public Employee() {
		// TODO Auto-generated constructor stub
		/*Default Constructor*/
	}

	public Employee(String name, int age, double salary) {
		super(name, age);
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}

}
