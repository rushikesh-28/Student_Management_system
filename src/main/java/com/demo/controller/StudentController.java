package com.demo.controller;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.demo.model.Student;
import com.demo.service.StudentService;

@Controller
public class StudentController 
{
	private StudentService ss;

	public StudentController(StudentService ss) {
		super();
		this.ss = ss;
	}
	 
	// handler method to handle list students and return mod and view
	 
	@GetMapping("/students")
	public  String listStudent(Model model)
	 {
		 model.addAttribute("students",ss.getAllStudents());
		 return "students";
	 }
@GetMapping("/students/new")
public String createStudentForm(Model model)
{
	//create student object to hold student from data
	
	Student student=new Student();
	model.addAttribute("student",student);  
	return "create_student";  
}
@PostMapping("/students")
public String saveStudents(@ModelAttribute("student") Student student   ) 
{
	 ss.saveStudent(student);
	 return "redirect:/students";
}
@GetMapping("/students/edit/{sid}")
public String editStudentFrom(@PathVariable(value = "sid") int sid , Model model) {
	System.out.println(" Hi its edit students.........");
model.addAttribute("student",ss.getStudentById(sid));
return "edit_student";
}
@PostMapping("/students/update")
public String updateStudent(@PathVariable(value="sid") int sid, @ModelAttribute("student") Student student, Model model )
{
	System.out.println("hi");				
	Student es = ss.getStudentById(sid);
	es.setSid(sid);
	es.setScity(student.getScity());
	es.setSname(student.getSname());
	es.setSpercentage(student.getSpercentage());
	ss.UpdateStudent(es);
	return "redirect:/students/update";
}
@GetMapping("/admin")
public  String adminLogin()
 {
	  
	 return "admin";
 }

}