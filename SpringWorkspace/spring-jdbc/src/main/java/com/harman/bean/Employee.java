package com.harman.bean;

public class Employee {
  private Integer eId;
  private String eName;
  private String email;
  private Double salary;
  private String gender;
  
  
  public Employee() {
	  // Default Constructor
  }


	public Integer geteId() {
		return eId;
	}
	
	
	public void seteId(Integer eId) {
		this.eId = eId;
	}
	
	
	public String geteName() {
		return eName;
	}
	
	
	public void seteName(String eName) {
		this.eName = eName;
	}
	
	
	public String getEmail() {
		return email;
	}
	
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public Double getSalary() {
		return salary;
	}
	
	
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	
	public String getGender() {
		return gender;
	}
	
	
	public void setGender(String gender) {
		this.gender = gender;
	}


	@Override
	public String toString() {
		return String.format("Employee [eId=%s, eName=%s, email=%s, salary=%s, gender=%s]", eId, eName, email, salary,
				gender);
	}

  
	
  
}
