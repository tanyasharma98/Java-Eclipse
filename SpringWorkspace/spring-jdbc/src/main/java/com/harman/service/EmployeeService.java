package com.harman.service;

import java.util.List;

import com.harman.bean.Employee;

public interface EmployeeService {
	
	public void createEmployee(Employee employee);
	public  Employee getEmployeeById(int eId);
	public List<Employee> getAllEmployees();

}
