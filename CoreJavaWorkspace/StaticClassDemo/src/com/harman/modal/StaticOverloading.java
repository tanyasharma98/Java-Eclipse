package com.harman.modal;

public class StaticOverloading {
	
	public static void display() {
		System.out.println("Inside Static Method");
	}
	//Overloading static Method
	
	public static void display(int a) {
		System.out.println("Inside Parameterized static method value : "+ a);
	}
	
	public static void main(String[] args) {
		StaticOverloading.display();
		StaticOverloading.display(200);
	}
}
