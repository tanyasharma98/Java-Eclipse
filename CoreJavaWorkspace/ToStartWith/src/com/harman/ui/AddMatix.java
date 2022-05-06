package com.harman.ui;

import java.util.Scanner;

public class AddMatix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int rows = sc.nextInt();
		System.out.println("Enter the number of columns");
		int cols = sc.nextInt();
		
		int matrixOne[][] = new int[rows][cols];
		int matrixTwo[][] = new int[rows][cols];
		int additionMatrix [][] = new int[rows][cols];
		
		System.out.println("Enter elements in first Matrix");
		for(int i=0; i < rows ; i++) {
			for(int j = 0;j < cols; j++) {
				matrixOne[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter elements in second Matrix");
		for(int i=0; i < rows ; i++) {
			for(int j = 0;j < cols; j++) {
				matrixTwo[i][j] = sc.nextInt();
			}
		}
		
		
		for(int i=0; i < rows ; i++) {
			for(int j = 0;j < cols; j++) {
				additionMatrix[i][j] = matrixOne[i][j] + matrixTwo[i][j];
				
			}
		}
			for(int i=0; i < rows ; i++) {
				for(int j = 0;j < cols; j++) {
					System.out.print(additionMatrix[i][j] +"\t");
				}
			
			
		}
	}

}
