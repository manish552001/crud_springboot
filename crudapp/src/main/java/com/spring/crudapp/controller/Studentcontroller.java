package com.spring.crudapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import com.spring.crudapp.dto.StudentDTO;
import com.spring.crudapp.model.Student;
import com.spring.crudapp.service.StudentService;

@RestController
@RequestMapping("/student")
public class Studentcontroller {

	@Autowired
	StudentService studentService;
	
//	Here we fetch data from student database
	@GetMapping("")
	public List<Student> getAllStudents(){
		return studentService.getAllStudents();
	}
//		Here we fetch single data from student database		
		
	@GetMapping("/{id}")
	public Student getAllStudents(@PathVariable Integer id){
		return studentService.getStudentById(id);
	}
//	Here we create data in student database
	@PostMapping("/store")
//	public Student saveStudent(@RequestBody StudentDTO student) {
		public Student saveStudent(@RequestBody Student student) {
		return studentService.create(student);
	}
	
//	Here we update data in student database	
	
	@PutMapping("/update")
	public Student updateStudent(@RequestBody Student student) {
		return studentService.update(student);
	}
	
//	Here we delete data from student database	
	
	@DeleteMapping("/delete/{id}")
	public String deleteStudents(@PathVariable Integer id){
		return studentService.deleteStudents(id);
	}
	
	
}
