package com.harman.model;

public class Student {
	static {
		System.err.println("Static Block");
	}
	static {
		System.out.println("In second Static Block");
	}
	public static int fee;
	public static void display() {
		System.out.println("in dispaly method ");
	}
	{
		System.out.println("in block");
	}
	public Student() {
		System.out.println("Default Constructor");
	}
}
