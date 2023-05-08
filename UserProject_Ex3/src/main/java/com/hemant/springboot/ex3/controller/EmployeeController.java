package com.hemant.springboot.ex3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hemant.springboot.ex3.model.Employee;
import com.hemant.springboot.ex3.repository.EmployeeRepository;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	EmployeeRepository er;
	@RequestMapping("/details")
	public List<Employee> getEmployee(){
		return er.findAll();
	}
}
