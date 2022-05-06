package com.harman.ui;

import java.util.Scanner;

public class FiboNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a=0 , b=1;
		
		while(n>0) {
			System.out.println(a);
			int c = a+b;
			a=b;
			b=c;
			n--;
		}

	}

}
