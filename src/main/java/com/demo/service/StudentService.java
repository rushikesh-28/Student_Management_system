package com.demo.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.Student;
@Repository
public interface StudentService {
	
List<Student> getAllStudents();

Student saveStudent(Student student);
Student getStudentById(int sid);
Student UpdateStudent(Student student);


}
