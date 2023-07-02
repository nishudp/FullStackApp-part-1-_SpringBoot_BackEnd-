package com.springbootbackend.springbootbackend.service;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;

import com.springbootbackend.springbootbackend.entity.Employee;

public interface EmployeeService {

	public List<Employee> getAllEmployees();

	public Employee createEmployee(Employee employee);
	
	public ResponseEntity<Employee> getEmployeeById(Long id);
	
	public ResponseEntity<Employee> updateEmployee(Long id, Employee employeeDetails);
	
	public ResponseEntity<Map<String, Boolean>> deleteEmployee(Long id);
		

}
