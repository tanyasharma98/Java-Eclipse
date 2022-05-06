package com.harman.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class Employee {
	@Value("101")
	private int empId;
	@Value("Tanya")
	private String name;
	@Value("50000")
	private double  salary;
	
	@Autowired
	private Laptop laptop;
	
	public Employee(){
		//Default Constructor
		System.out.println("Constructor Invoked");
	}
	
	@PostConstruct
	public void init() {
		System.out.println(".....init....");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Destroyed");
	}
	

	public Employee(int empId, String name, double salary, Laptop laptop) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.laptop = laptop;
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
		return String.format("Employee [empId=%s, name=%s, salary=%s, laptop=%s]", empId, name, salary,laptop);
	}

}
