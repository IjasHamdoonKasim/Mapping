package com.sgic.employee.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.employee.Contants;
import com.sgic.employee.entities.Employee;
import com.sgic.employee.service.EmployeeDto;
import com.sgic.employee.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;

	@PostMapping("/employee")
	public ResponseEntity<Object> createIncomingSample(@RequestBody Employee employee) {
		
		employeeService.saveEmployee(employee);
		return ResponseEntity.ok("Saved Successfully!");
	}
	
	@GetMapping("/employee/{id}")
	public ResponseEntity<Object> getEmployeeById(@PathVariable Long id) {

		return ResponseEntity.ok(employeeService.getEmployeeById(id));
	}
	
	@RequestMapping("/hello")
	public Map<String, String> callAsyncMethod() {
		Map map = new HashMap<Integer, String>();
		map.put("message", "Hello");

		map.put("message1", "Hello-world");
		return map; // returns empty braces
	}
}
