package com.harman.ui;

public class ProductInfo {
	private static int idData = 0;
	private int jobId;
	private String name; 
	
	public void getIncrement(String name) {
		this.name = name;
		
		setjobId(++idData);
	}
	public void setjobId(int jobId) {
		this.jobId = jobId;
	}
	
	public int getId() {
		return jobId;
	}
	public String getName() {
		return name;
	}
}
