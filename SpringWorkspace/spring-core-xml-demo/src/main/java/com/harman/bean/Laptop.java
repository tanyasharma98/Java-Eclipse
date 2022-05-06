package com.harman.bean;

public class Laptop {
	 private Integer laptopId;
	 private String brand;
	 
	 public Laptop() {
		 //Default Constructor
	 }
	 
	 public Laptop(Integer laptopId, String brand) {
			this.laptopId = laptopId;
			this.brand = brand;
		}

		

		public Integer getLaptopId() {
			return laptopId;
		}
	
		public void setLaptopId(Integer laptopId) {
			this.laptopId = laptopId;
		}
	
		public String getBrand() {
			return brand;
		}
	
		public void setBrand(String brand) {
			this.brand = brand;
		}
		@Override
		public String toString() {
			return String.format("Laptop [laptopId=%s, brand=%s]", laptopId, brand);
		}

}
