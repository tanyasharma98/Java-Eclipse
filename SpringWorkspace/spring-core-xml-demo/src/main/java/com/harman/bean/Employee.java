package com.harman.bean;

public class Employee {
	private int empId;
	private String name;
	private double  salary;
	
	private Laptop laptop;
	
	public Employee(){
		//Default Constructor
		System.out.println("Constructor Invoked");
	}
	
	public void init() {
		System.out.println(".....init....");
	}
	
	public void destroy() {
		System.out.println("Destroyed");
	}


	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	@Override
	public String toString() {
		return String.format("Employee [empId=%s, name=%s, salary=%s, laptop=%s]", empId, name, salary, laptop);
	}

}
