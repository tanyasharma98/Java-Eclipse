package com.harman.ui;

import java.util.PriorityQueue;

public class PriorityQueueProgram {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> num = new PriorityQueue<>();
		
		num.add(10);
		num.add(20);
		num.add(30);
		System.out.println(num);
		
		num.offer(555);
		num.offer(1);
		System.out.println(num);
		int peekNum = num.peek();
		System.out.println(peekNum);
	}

}
