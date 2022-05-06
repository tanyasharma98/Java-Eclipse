package com.harman.ui;

import java.util.ArrayList;
import java.util.Collections;

import com.harman.model.Employee;

public class App6 {

	public static void main(String[] args) {
		ArrayList<Employee> empList = new ArrayList<>();
		empList.add(new Employee(10, "tanya", 3000.0));
		empList.add(new Employee(10, "goku", 9900.0));
		empList.add(new Employee(10, "kira", 8800.0));
		empList.add(new Employee(10, "L", 56000.0));
		
		for(Employee employee : empList) {
			System.out.println(employee);
		}
		
		System.out.println("---------------");
		Collections.sort(empList);
		for(Employee employee : empList) {
			System.out.println(employee);
		}
	}

}
