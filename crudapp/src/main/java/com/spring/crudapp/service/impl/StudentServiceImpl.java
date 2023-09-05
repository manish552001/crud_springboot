package com.spring.crudapp.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.spring.crudapp.dto.StudentDTO;
import com.spring.crudapp.model.Student;
import com.spring.crudapp.repository.StudentRepository;
import com.spring.crudapp.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;

	@Override
	public Student create(Student student) {
//		Student student2 = new Student();
//		student2.setEmail(student.getEmail());
//		student2.setName(student.getName());
//		student2.setRollnum(student.getRollnum());
//		Student savedStudent = studentRepository.save(student2);
//		return savedStudent;
		
		return studentRepository.save(student);
	}

	@Override
	public List<Student>  getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Student getStudentById(Integer id) {
		return studentRepository.findById(id).get();
	}
	
	
	@Override
	public Student update(Student student) {
		return studentRepository.save(student);
		
	}
	
	@Override
	public String deleteStudents(Integer id) {
		studentRepository.deleteById(id);
		return "Deleted Record";
		
	}
}
