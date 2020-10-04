package com.lti.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.entity.StudentDetail;
import com.lti.service.StudentService;


@RestController
public class StudentRestController {

	@Autowired
	private StudentService service;
	
	@PostMapping(value="/studentadd", consumes = "application/json")
	public String addStudent(@RequestBody StudentDetail student) {
		service.persist(student);
		return "Student added successfully!!";
	}
	
	@PostMapping(value="/register", consumes = "application/json")
	@CrossOrigin(origins = "http://localhost:4200")
	public StudentDetail registerUser(@RequestBody StudentDetail student) throws Exception {
		String tempEmail = student.getEmail();
		if(tempEmail != null && !"".equals(tempEmail)) {
			List<StudentDetail> std = service.findByEmail(tempEmail);
			if(std.size() >= 1) {
				throw new Exception ("User with " + tempEmail + " already exists!!");
			}
		}
		service.persist(student);
		return student;
	}
	
	@PostMapping(value="/login", consumes = "application/json")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<StudentDetail> loginUser(@RequestBody StudentDetail student) throws Exception {
		String tempEmail = student.getEmail();
		String tempPassword = student.getPassword();
		List<StudentDetail> studentObj = null;
		if(tempEmail != null && tempPassword != null) {
			studentObj = service.findStudentByEmailAndPassword(tempEmail, tempPassword);
		}
		if(studentObj.size() == 0) {
			throw new Exception("Bad credentials");
		}
		return studentObj;
	}
}
