package com.harman.model;

public class Product {
private int id;
private String name;
/* Static data members*/
private static int tax;

/* Static Methods*/
public void setId(int pId) {
	id = pId;
}
public void setName(String pName) {
	name = pName;
}
public static void setTax(int tx) {
	tax = tx;
}
public int getId() {
	return id;
}
public String getName() {
	return name;
}
public static int getTax() {
	return tax;
}
}