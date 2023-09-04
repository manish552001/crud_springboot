package com.spring.crudapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.crudapp.dto.StudentDTO;
import com.spring.crudapp.model.Student;
import com.spring.crudapp.service.StudentService;

@RestController
@RequestMapping("/student")
public class Studentcontroller {

	@Autowired
	StudentService studentService;

	@PostMapping("/store")
	public Student saveStudent(@RequestBody StudentDTO student) {
		return studentService.create(student);
	}
}
