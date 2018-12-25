package com.reactiveworks.jacoco.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reactiveworks.jacoco.entity.Employee;
import com.reactiveworks.jacoco.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping(value="/add")
	public Employee addEmployee(@RequestBody Employee emp){
		employeeService.addEmployee(emp);
		return emp;
	}
	
	@GetMapping(value="/getemployee")
	public List<Employee> getEmployee(){
		return employeeService.getAllEmployees();
	}
	
	@GetMapping(value = "/test")
	public String testApplication(){
		return "Application is not running";
	}
	

}
