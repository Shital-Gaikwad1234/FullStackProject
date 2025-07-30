package com.intellismart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intellismart.entity.Employee;
import com.intellismart.entity.FieldUser;
import com.intellismart.repository.EmployeeRepository;
import com.intellismart.repository.FieldUserRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeeRepository;
	private FieldUserRepository fieldUserRepository;
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployees(){
		
		return employeeRepository.findAll();
	}
	
//	@GetMapping("/fieldusers")
//	
//	public List<FieldUser> getAllFieldUsers(){
//		return fieldUserRepository.findAll();
//	}
	
	
}
