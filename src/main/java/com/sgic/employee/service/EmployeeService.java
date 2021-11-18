package com.sgic.employee.service;

import com.sgic.employee.entities.Employee;

public interface EmployeeService {
	
	 void saveEmployee(Employee employee);
	 EmployeeDto getEmployeeById(Long id);

}
