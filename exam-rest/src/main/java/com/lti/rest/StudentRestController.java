package com.lti.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.entity.StudentDetail;
import com.lti.service.StudentService;

@CrossOrigin
@RestController
@RequestMapping("/student")
public class StudentRestController {

	@Autowired
	private StudentService service;
	
	@PostMapping(value = "/add", consumes = "application/json")
	public String addStudent(@RequestBody StudentDetail student) {
		service.persist(student);
		return "Student added successfully";
	}
	
	@GetMapping(value = "/fetch/{id}", produces = "application/json")
	public StudentDetail fetchStudent(@PathVariable int id) {
		return service.find(id);
	}
	
	@GetMapping(value = "/list", produces = "application/json")
	public List<StudentDetail> listStudent(){
		return service.load();
	}
	
	@PutMapping(value = "/edit/{id}", consumes = "application/json")
	public String updateStudent(@PathVariable int id) {
		service.edit(id);
		return "Student updated successfully";
	}
	
	@PutMapping(value = "/updatemark/{id}", consumes = "application/json")
	public String updateMark(@PathVariable int id) {
		service.editMark(id);
		return "Marks updated";
	}
			
	
	@DeleteMapping("/del/{id}")
	public String delStudent(@PathVariable int id) {
		service.remove(id);
		return "Student deleted successfully";
	}
}
