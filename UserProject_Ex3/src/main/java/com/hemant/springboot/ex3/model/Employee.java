package com.hemant.springboot.ex3.model;

import jakarta.persistence.*;

@Entity
@Table(name="employee_info")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int emp_id;
	public String emp_name;
	public String emp_dept;
	public String emp_designation;
	public int emp_age;
	
	public Employee() {
		
	}

	public Employee(String emp_name, String emp_dept, String emp_designation, int emp_age) {
		super();
		this.emp_name = emp_name;
		this.emp_dept = emp_dept;
		this.emp_designation = emp_designation;
		this.emp_age = emp_age;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public String getEmp_dept() {
		return emp_dept;
	}

	public void setEmp_dept(String emp_dept) {
		this.emp_dept = emp_dept;
	}

	public String getEmp_designation() {
		return emp_designation;
	}

	public void setEmp_designation(String emp_designation) {
		this.emp_designation = emp_designation;
	}

	public int getEmp_age() {
		return emp_age;
	}

	public void setEmp_age(int emp_age) {
		this.emp_age = emp_age;
	}
	
}
