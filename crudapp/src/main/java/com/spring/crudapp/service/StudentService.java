package com.spring.crudapp.service;

import com.spring.crudapp.dto.StudentDTO;
import com.spring.crudapp.model.Student;

public interface StudentService {

	public Student create(StudentDTO student);

}
