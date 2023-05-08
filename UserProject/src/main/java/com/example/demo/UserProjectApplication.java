package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@SpringBootApplication
public class UserProjectApplication implements CommandLineRunner {
	
	@Autowired
	UserRepository ur;
	
	public static void main(String[] args) {
		SpringApplication.run(UserProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		ur.save(new User("Hemant Jain","hemantjain@gmail.com"));
		ur.save(new User("Ritu Gautam","ritugautam@gmail.com"));
		ur.save(new User("Megha Tomar","meghatomar@gmail.com"));
		ur.save(new User("Aman Gupta","amangupta@gmail.com"));
		ur.save(new User("Aryan Srivastav","aryan@gmail.com"));
		
		
		
	}

}
