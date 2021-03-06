package com.harman.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.harman.bean.Employee;

public class App1 {

	public static void main(String[] args) {
		AbstractApplicationContext context =  new ClassPathXmlApplicationContext("beans.xml");
		
		Employee e1 = context.getBean("employee", Employee.class);
		System.out.println(e1);
		context.close();
	}  
}
