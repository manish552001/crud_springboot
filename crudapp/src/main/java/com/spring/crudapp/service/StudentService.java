package com.spring.crudapp.service;

import java.util.List;


//import com.spring.crudapp.dto.StudentDTO;
import com.spring.crudapp.model.Student;

public interface StudentService {

	Student create(Student student);
//	public Student create(StudentDTO student);

	public List<Student> getAllStudents();

	public Student getStudentById(Integer id);

	public Student update(Student student);
	
	String deleteStudents(Integer id);



}
