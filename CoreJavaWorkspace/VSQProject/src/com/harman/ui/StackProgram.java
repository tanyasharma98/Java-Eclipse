package com.harman.ui;

import java.util.Stack;

public class StackProgram {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		
		boolean res = stack.empty();
		System.out.println("Is Stack empty? "+ res);
		
		stack.push(11);
		stack.push(22);
		stack.push(33);
		res = stack.empty();
		System.out.println("Is Stack empty? "+ res);
		System.out.println(stack);
		System.out.println(stack.pop());

	}

}
