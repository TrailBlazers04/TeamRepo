package com.lti.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.entity.JavaQ;
import com.lti.service.JavaService;





@RestController
public class JavaRestController {
	
	@Autowired
	private JavaService service;
	
	@PostMapping(value = "/add", consumes = "application/json")
	public String addJavaQ(@RequestBody JavaQ java) {
		service.persist(java);
		return "Java Question added successfully";
	}
	
	@GetMapping(value = "/fetch/{id}", produces = "application/json")
	public JavaQ fetchSqlQ(@PathVariable int id) {
		return service.find(id);
	}
	
	@GetMapping(value = "/list", produces = "application/json")
	public List<JavaQ> listJavaQ(){
		return service.load();
	}
	
	@PutMapping(value = "/edit", consumes = "application/json")
	public String updateSqlQ(@RequestBody JavaQ java) {
		service.edit(java);
		return "Java Question updated successfully";
	}
	
	@DeleteMapping("/del/{id}")
	public String delJavaQ(@PathVariable int id) {
		service.remove(id);
		return "Java Question deleted successfully";
	}

}
