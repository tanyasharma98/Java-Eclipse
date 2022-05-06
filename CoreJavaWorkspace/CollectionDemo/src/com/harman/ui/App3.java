package com.harman.ui;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class App3 {

	public static void main(String[] args) {
//		HashSet<String> set = new HashSet<>();
//		LinkedHashSet<String> set = new LinkedHashSet<>();
		TreeSet<String> set = new TreeSet<>();
		set.add("Java");
		set.add("Spring");
		set.add("Apple");
		set.add("JDBC");
		set.add("Java");
		set.add(null); // For tree set  -- it give error
		
		System.out.println(set);
		
		for(String data : set) {
			System.out.println(data);
		}
		
		System.out.println("------------------------");
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
