package org.devops.dao;

import java.util.List;

import org.devops.model.Employee;

public interface EmployeeDao {
	List<Employee> getAllEmployees();
	void insertEmployee(Employee employee);
}
