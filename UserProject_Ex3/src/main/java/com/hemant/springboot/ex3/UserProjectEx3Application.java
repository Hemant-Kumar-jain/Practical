package com.hemant.springboot.ex3;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hemant.springboot.ex3.repository.EmployeeRepository;
import com.hemant.springboot.ex3.model.*;

@SpringBootApplication
public class UserProjectEx3Application implements CommandLineRunner {
	@Autowired
	EmployeeRepository er;
	public static void main(String[] args) {
		SpringApplication.run(UserProjectEx3Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	er.save(new Employee("Hemant","Development","SD",24));
	er.save(new Employee("Maahi","Development","JD",22));
	er.save(new Employee("Aman","Development","TS",25));
		
	}

}
