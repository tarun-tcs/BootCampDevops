package org.devops.service;

import java.util.List;

import org.devops.model.Employee;

public interface EmployeeService {
	List<Employee> getAllEmployees();
	void insertEmployee(Employee employee);
}