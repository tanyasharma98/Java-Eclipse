package com.harman.ui;

import java.util.Scanner;

public class StaticClass {
	static String name;
	static int id =0;
	
	static class FirstName{
		public void displayName(String fName) {
			System.out.println("Name = "+ fName );
		}
		
	}
	
	public static void main(String[] args) {
		StaticClass.FirstName objName = new StaticClass.FirstName();
		System.out.println("Enter Name");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		objName.displayName(str);
		sc.close();
	}
}
