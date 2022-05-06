package com.harman.ui;

import com.harman.model.Employee;
import com.harman.model.Human;
import com.harman.model.Manager;
import com.harman.model.Person;

public class InheritanceApp {

	public static void main(String[] args) {
		Person p1 = new Person("Tanya", 23);
		System.out.println(p1.getName()+"\t"+p1.getAge());
		Person p2 = new Person("Goku", 25);
		System.out.println(p2.getName()+"\t"+p2.getAge());
		
		Human s1 = new Human("Mob", 14, 4000.0);
		System.out.println(s1.getName()+"\t"+s1.getAge()+"\t"+s1.getFee());
		
		Employee e1 = new Employee("Pico", 34,89000.0);
		System.out.println(e1.getName() +"\t"+e1.getAge()+"\t"+e1.getSalary());
		
		Manager m1 = new Manager("Zoro", 15,46000.0,15000);
		System.out.println(m1.getName()+"\t"+m1.getAge()+"\t"+m1.getSalary()+"\t"+m1.getBonus());

	}

}
