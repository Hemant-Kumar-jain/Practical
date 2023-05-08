package com.hemant.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.hemant.springboot.model.Student;
import com.hemant.springboot.repository.StudentRepository;

@SpringBootApplication
public class UserProjectEx2Application implements CommandLineRunner {
	@Autowired
	StudentRepository sr;
	public static void main(String[] args) {
		SpringApplication.run(UserProjectEx2Application.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		sr.save(new Student("Hemant Jain","MDPS","Faridabad"));
		sr.save(new Student("Ritu Gautam","DPS","Ghaziabad"));
		sr.save(new Student("Megha Tomar","K.L Mehta","Meerut"));
		sr.save(new Student("Aman Gupta","DAV","Ballabgarh"));
		sr.save(new Student("Aryan Srivastav","RAWAL","Lucknow"));
		
	}

}
