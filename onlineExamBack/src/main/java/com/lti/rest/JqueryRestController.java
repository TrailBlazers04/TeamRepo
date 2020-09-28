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

import com.lti.entity.JqueryQ;
import com.lti.service.JqueryService;


@RestController
public class JqueryRestController {
	
	@Autowired
	private JqueryService service;
	
	@PostMapping(value = "/add", consumes = "application/json")
	public String addJqueryQ(@RequestBody JqueryQ jquery) {
		service.persist(jquery);
		return "Jquery Question added successfully";
	}
	
	@GetMapping(value = "/fetch/{id}", produces = "application/json")
	public JqueryQ fetchJqueryQ(@PathVariable int id) {
		return service.find(id);
	}
	
	@GetMapping(value = "/list", produces = "application/json")
	public List<JqueryQ> listJqueryQ(){
		return service.load();
	}
	
	@PutMapping(value = "/edit", consumes = "application/json")
	public String updateJqueryQ(@RequestBody JqueryQ jquery) {
		service.edit(jquery);
		return "Jquery Question updated successfully";
	}
	
	@DeleteMapping("/del/{id}")
	public String delJqueryQ(@PathVariable int id) {
		service.remove(id);
		return "Jquery Question deleted successfully";
	}

}
