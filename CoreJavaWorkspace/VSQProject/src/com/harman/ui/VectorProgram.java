package com.harman.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorProgram {

	public static void main(String[] args) {
		Vector v1 = new Vector(); 
        Vector v2 = new Vector(100); 
        v2.add(200);
        v2.add(300);
        v2.add(400);
        Vector v3 = new Vector(500, 10);
        
        List<String> aList = new ArrayList<>();
        aList.add("Tanya");
        aList.add("Sharma");
        Vector v4 = new Vector(aList);
        //print contents of each vector
       System.out.println("Vector v1 Contents:" + v1);
       System.out.println("Vector v2 Contents:" + v2);
       System.out.println("Vector v3 Contents:" + v3);
       System.out.println("Vector v4 Contents:" + v4);
       
       v1.addElement(v4);
       System.out.println("Vector v1 Contents:" + v1);
       
      

	}

}
