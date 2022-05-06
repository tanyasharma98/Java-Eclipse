package com.harman.ui;

import com.harman.model.ComplexNumber;

// We didn't follow the data hiding -- drawback

// Create New package drag the data member file
// Data hiding achieved -- somehow
public class ComplexNumberApp {
	public static void main(String[] args) {
		ComplexNumber c1;
		c1= new ComplexNumber();
		
//		c1.realPart = 10;
//		c1.imaginaryPart = 20;
		
		c1.setRealPart(10);
		c1.setImaginaryPart(20);
//		System.out.println(c1);
		//System.out.println(c1.realPart+"\t" + c1.imaginaryPart);
		System.out.println(c1.getRealPart()+"\t"+ c1.getImaginaryPart());
		
		ComplexNumber c2 ;
		c2 = new ComplexNumber();
		System.out.println(c2);
		System.out.println(c2.hashCode());
		
		ComplexNumber c3 = new ComplexNumber();
		ComplexNumber c4 = new ComplexNumber();
		System.out.println(c3==c4);
		
	}
}
