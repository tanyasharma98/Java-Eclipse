package com.harman.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.harman.bean.Employee;

public class App1 {

	public static void main(String[] args) {
		AbstractApplicationContext context =  new ClassPathXmlApplicationContext("beans.xml");
		
//		Employee e1 = context.getBean("emp", Employee.class);
//		Employee e2 = context.getBean("emp2", Employee.class);
//		System.out.println(e1==e2);
//		System.out.println(context.isSingleton("emp")); // scope = prototype --> Not a singleton
//		System.out.println(context.isSingleton("emp2"));
		
		
		Employee e1 = context.getBean("emp", Employee.class);
		System.out.println(e1);
		((AbstractApplicationContext) context).close();
	}  
}
