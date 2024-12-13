package com.demo.service;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.demo.dao.StudentDao;
import com.demo.model.Student;

@Service
public class StudentServiceImpl implements StudentService {
   private StudentDao sr; 
   
	public StudentServiceImpl(StudentDao sr) {
	super();
	this.sr = sr;
}

	public List<Student> getAllStudents() {
		return sr.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		return sr.save(student);
	}

	@Override
	public Student getStudentById(int sid) {
		return sr.findById(sid).get();
	}

	@Override
	public Student UpdateStudent(Student student) {
		return sr.save(student);
	}

	
	

	

}
