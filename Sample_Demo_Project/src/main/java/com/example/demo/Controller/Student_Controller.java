package com.example.demo.Controller;
import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Student_Model;
import com.example.demo.Service.Student_Serivce;


@RestController
@RequestMapping("")
public class Student_Controller {
	

	
	
	@Autowired
		Student_Serivce serobj;
		
		@PostMapping("/tag")
		public String create(@RequestBody Student_Model pojobj )
		{
			return serobj.addStudent(pojobj);
		}
		
		@GetMapping("/abc")
		public List<Student_Model>read()
		{ 
			return serobj.getStudent();
		}
		
		@GetMapping("/{id}")
		public Optional<Student_Model> readById (@PathVariable int id)
		{
			return serobj.getStudentById(id);
		}
			
}
