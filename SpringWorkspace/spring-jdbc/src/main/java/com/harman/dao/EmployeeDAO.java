package com.harman.dao;

import java.util.List;

import com.harman.bean.Employee;

public interface EmployeeDAO {
	
	public void createEmployee(Employee employee);
	public  Employee getEmployeeById(int eId);
	public List<Employee> getAllEmployees();
	
	
}
