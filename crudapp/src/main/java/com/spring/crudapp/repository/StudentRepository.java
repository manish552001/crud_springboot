package com.spring.crudapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.crudapp.model.Student;


public interface StudentRepository extends JpaRepository<Student, Integer>{

}
