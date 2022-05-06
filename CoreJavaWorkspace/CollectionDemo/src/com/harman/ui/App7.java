package com.harman.ui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import com.harman.model.Employee;

public class App7 {
 public static void main(String[] args) {
	 	//List<Employee> empList = new ArrayList<>();
	 	Set<Employee> empList = new LinkedHashSet<>();
		empList.add(new Employee(10, "tanya", 3000.0));
		empList.add(new Employee(10, "goku", 9900.0));
		empList.add(new Employee(10, "kira", 8800.0));
		empList.add(new Employee(10, "L", 56000.0));
		empList.add(new Employee(10, "L", 56000.0));
		
//		for(Employee employee : empList) {
//			System.out.println(employee);
//		}
		
		Employee e1 = new Employee(107,"jojo", 25000.0);
		Employee e2 = new Employee(107,"jojo", 25000.0);
		System.out.println(e1 == e2);
		System.out.println(e1.equals(e2));
	
		System.out.println("---------------");
		
	}

 }
