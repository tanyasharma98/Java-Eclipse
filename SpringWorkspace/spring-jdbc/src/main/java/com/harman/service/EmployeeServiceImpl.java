package com.harman.service;

import java.util.List;

import com.harman.bean.Employee;
import com.harman.dao.EmployeeDAOImpl;

public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeDAOImpl employeeDAOImpl;
	public void createEmployee(Employee employee) {
		employeeDAOImpl.createEmployee(employee);
		
	}

	public Employee getEmployeeById(int eId) {
		// TODO Auto-generated method stub
		return employeeDAOImpl.getEmployeeById(eId);
	}

	public EmployeeDAOImpl getEmployeeDAOImpl() {
		return employeeDAOImpl;
	}

	public void setEmployeeDAOImpl(EmployeeDAOImpl employeeDAOImpl) {
		this.employeeDAOImpl = employeeDAOImpl;
	}

	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeDAOImpl.getAllEmployees();
	}

}
