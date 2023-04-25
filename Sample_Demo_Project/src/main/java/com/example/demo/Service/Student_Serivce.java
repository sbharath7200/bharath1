package com.example.demo.Service;


	

	import java.util.List;
	import java.util.Optional;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

import com.example.demo.Model.Student_Model;
import com.example.demo.Repositories.Student_Repository;

	
	@Service
	public class Student_Serivce {
		@Autowired
		Student_Repository repobj;
		
		public String addStudent(Student_Model pojobj)
		{
			repobj.save(pojobj);
		return"Added";
		}
		
		public List<Student_Model>getStudent()
		{
			return repobj.findAll();
		}
		
		public Optional<Student_Model>getStudentById(int id)
		{
			return repobj.findById(id);
		}

	}

