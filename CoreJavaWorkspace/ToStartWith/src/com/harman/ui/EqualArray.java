package com.harman.ui;

import java.util.Scanner;

public class EqualArray {
	
	public static boolean checkEqual(int[] arr1 , int[] arr2) {
		if(arr1.length != arr2.length) {
			return false;
		}
		
		for(int i=0; i<arr1.length;i++) {
			if(arr1[i]!= arr2[i]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of first array");
		int n = sc.nextInt();
		int [] arr1 = new int[n];
		System.out.println("Enter the elements in first array");
		for(int i = 0; i < n; i++) {
			arr1[i] = sc.nextInt();
		}
		
		System.out.println("Enter the size of Second array");
		int m = sc.nextInt();
		int [] arr2 = new int[m];
		System.out.println("Enter the elements of second array");
		for(int i = 0; i < m; i++) {
			arr2[i] = sc.nextInt();
		}
		boolean ans = checkEqual(arr1 , arr2);
		if(ans== true) {
			System.out.println("They are equal");
		}else {
			System.out.println("They are not equal ");
		}
	}

}
