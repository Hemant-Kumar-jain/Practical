package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name="user_info")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String email_id;
	
	public User(String name, String email_id) {
		super();
		this.name = name;
		this.email_id = email_id;
	}
	public User() {
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	
}
