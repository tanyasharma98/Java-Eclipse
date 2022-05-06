package com.harman.ui;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int mul = 1;
		while(mul != 11) {
			System.out.println(n+" * "+mul+ " = " + (n*mul));
			mul++;
		}

	}

}
