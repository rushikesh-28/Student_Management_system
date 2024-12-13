  package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.dao.StudentDao;
import com.demo.model.Student;

@SpringBootApplication
public class StudentManagementSystemApplication {

	public static void main(String[] args) 
	{
		SpringApplication.run(StudentManagementSystemApplication.class, args);
		
	}
	
	

}
