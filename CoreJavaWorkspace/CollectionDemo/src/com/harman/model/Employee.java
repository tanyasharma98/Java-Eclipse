package com.harman.model;

public class Employee implements Comparable<Employee> {
	
		private int id ;
		private String name;
		private double salary;
		
		public Employee() {
			//Default Constructor
		}

		public Employee(int id, String name, double salary) {
			this.id = id;
			this.name = name;
			this.salary = salary;
		}

		/**
		 * @return the id
		 */
		public int getId() {
			return id;
		}

		/**
		 * @param id the id to set
		 */
		public void setId(int id) {
			this.id = id;
		}

		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}

		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}

		/**
		 * @return the salary
		 */
		public double getSalary() {
			return salary;
		}

		/**
		 * @param salary the salary to set
		 */
		public void setSalary(double salary) {
			this.salary = salary;
		}
		
		@Override
		public String toString() {
			return String.format("id=%s, name=%s, salary=%s", id, name, salary);
		}
		
		@Override
		public int compareTo(Employee other) {
			// Comparing both values
			//return this.id - other.id;
			//return this.name.compareTo(other.name);
			return (int)(this.salary - other.salary);
		}
		
		@Override
		public boolean equals(Object other) {
			Employee otherEmployee = (Employee) other;
			return this.id == otherEmployee.id && this.name.equals(otherEmployee.name) && this.salary == otherEmployee.salary;
			
		}
	
}
