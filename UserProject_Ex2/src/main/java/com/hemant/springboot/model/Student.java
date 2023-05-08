package com.hemant.springboot.model;

import jakarta.persistence.*;

@Entity
@Table(name="student_info")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private String school_name;
	private String address;
	
	public Student() {
		
	}

	public Student(String name, String school_name, String address) {
		super();
		this.name = name;
		this.school_name = school_name;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSchool_name() {
		return school_name;
	}

	public void setSchool_name(String school_name) {
		this.school_name = school_name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
