package com.harman.ui;

import com.harman.model.Product;

public class ProductApp {

	public static void main(String[] args) {
		Product.setTax(22);
		
		Product p1 = new Product();
		p1.setId(1);
		p1.setName("Bulb");
		System.out.println(p1.getId() +"\t"+ p1.getName()+"\t"+ p1.getTax());
		
		Product p2 = new Product();
		p2.setId(2);
		p2.setName("TV");
		System.out.println(p2.getId()+"\t"+p2.getName()+"\t"+ Product.getTax());
	}

}
