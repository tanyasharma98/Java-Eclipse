package com.harman.ui;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.harman.bean.Employee;
import com.harman.service.EmployeeService;
import com.harman.service.EmployeeServiceImpl;

public class App1 {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		EmployeeService employeeService = context.getBean("employeeService",EmployeeServiceImpl.class);
		
		Employee emp = new Employee();
		emp.seteName("Tanya");
		emp.setGender("F");
		emp.setEmail("kl@gmail.po");
		emp.setSalary(50000.0);
		
		//employeeService.createEmployee(emp);
		System.out.println(employeeService.getAllEmployees());
		context.close();
		

	}

}
