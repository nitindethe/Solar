package com.reactiveworks.jacoco.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.reactiveworks.jacoco.entity.Employee;

@Service
public class EmployeeService {
   
	List<Employee> listEmployee = new ArrayList<>();
	public void addEmployee(Employee emp){
		listEmployee.add(emp);
	}
	
	public List<Employee> getAllEmployees(){
		return listEmployee;
	}
}
