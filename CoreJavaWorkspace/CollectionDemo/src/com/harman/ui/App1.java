package com.harman.ui;

import java.util.ArrayList;
import java.util.Iterator;

public class App1 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(100);
		list.add(200);
		list.add(20);
		list.add(88);
		
		System.out.println(list);
		System.out.println(list.toString());
		
		for(int i=0;i< list.size();i++) {
			System.out.println(list.get(i));
		}
		
		for(Integer data : list) {
			System.out.println(data);
		}
		
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("-------------------------------");
		for(int i= list.size()-1 ; i>=0;i--) {
			System.out.println(list.get(i));
		}
		
		
		
	}

}
