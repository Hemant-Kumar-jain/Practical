package com.hemant.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hemant.springboot.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

}
