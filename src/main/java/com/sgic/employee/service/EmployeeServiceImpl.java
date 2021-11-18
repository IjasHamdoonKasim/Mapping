package com.sgic.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.employee.entities.Employee;
import com.sgic.employee.entities.EmployeeDetails;
import com.sgic.employee.repositories.EmployeeDetailsRepository;
import com.sgic.employee.repositories.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
@Autowired
EmployeeRepository employeeRepository;
EmployeeDetailsRepository employeeDetailsRepository;

	@Override
	public void saveEmployee(Employee employee) {
		employeeRepository.save(employee);
	}

	@Override
	public EmployeeDto getEmployeeById(Long id) {
		// TODO Auto-generated method stub
		Employee employee=employeeRepository.findById(id).get();
		EmployeeDto employeeDto=new EmployeeDto();
		
		employeeDto.setId(employee.getId());
		employeeDto.setFirstName(employee.getFirstName());
		employeeDto.setLastName(employee.getLastName());
		employeeDto.setEmail(employee.getEmail());
		
		EmployeeDetails employeeDeatails = employee.getEmployeeDetail();
		EmployeeDetailDto employeeDetailDto=new EmployeeDetailDto();
		
		employeeDetailDto.setId(employeeDeatails.getId());
		employeeDetailDto.setJobTitle(employeeDeatails.getJobTitle());
		employeeDetailDto.setDepartment(employeeDeatails.getDepartment());
		employeeDetailDto.setGender(employeeDeatails.getGender());
		employeeDetailDto.setSalary(employeeDeatails.getSalary());
		employeeDetailDto.setAddress(employeeDeatails.getAddress());
		
		employeeDto.setEmployeeDetail(employeeDetailDto);
		return employeeDto;
	}

}
