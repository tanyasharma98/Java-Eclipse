package com.harman.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Laptop {
	@Value("1001")
	 private Integer laptopId;
	@Value("Dell")
	 private String brand;
	 
	 public Laptop() {
		 //Default Constructor
		 System.out.println("Laptop Constructor");
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
