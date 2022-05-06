package com.harman.model;

import java.util.Scanner;

import com.harman.ui.ProductInfo;

public class ProductAutoApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of entries");
		int n = sc.nextInt();
		
		for(int i=0;i<=n;i++) {
			ProductInfo pf = new ProductInfo();
			System.out.println("Enter Item");
			String str = sc.nextLine();
			pf.getIncrement(str);
			System.out.println(pf.getId());
		}
	}

}
