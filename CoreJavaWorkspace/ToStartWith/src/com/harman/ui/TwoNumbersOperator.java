package com.harman.ui;

import java.util.Scanner;

public class TwoNumbersOperator {
	 public static void main(String[] args) {
		 // Arguments are saved in run configuration
		 // Two numbers and a operator
		 // 1- *
		 // 2 - /
		 //3 = +
		 //4 = -
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter 1: MUl\n 2:Divide\n 3:ADD\n 4:SUB");
		 int k = sc.nextInt();
		 System.out.println("Enter Two Number ");
		 int a = sc.nextInt();
		 int b = sc.nextInt();
		 if(k == 1) {
			 System.out.println(a*b);
		 }
		 else if(k== 2) {
			 System.out.println(a/b);
		 }else if(k==3) {
			 System.out.println(a+b);
		 }else if(k== 4) {
			 System.out.println(a-b);
		 }else {
			 System.out.println("Wrong operator");
		 }
	 }
}
