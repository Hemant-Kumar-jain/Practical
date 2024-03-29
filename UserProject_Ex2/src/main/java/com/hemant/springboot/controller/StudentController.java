package com.hemant.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hemant.springboot.model.Student;
import com.hemant.springboot.repository.StudentRepository;

@RestController
@RequestMapping("/student")
public class StudentController {
@Autowired
StudentRepository sr;
@RequestMapping("/details")
public List<Student> getStudent(){
	return sr.findAll();
}
}
