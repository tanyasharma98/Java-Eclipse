package com.harman.ui;

import java.util.HashMap;

public class App5 {

	public static void main(String[] args) {
		HashMap<String , Integer> map = new HashMap<>();
		map.put("Tanya", 23);
		map.put("Arima", 14);
		map.put("Mob", 15);
		
		System.out.println(map);
		System.out.println("----------------");
		
		for(String key : map.keySet()) {
			System.out.println(key +"\t"+ map.get(key));
		}
		
		for(Integer data : map.values()) {
			System.out.println(data);
		}
	}

}
