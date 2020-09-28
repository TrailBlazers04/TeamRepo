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


import com.lti.entity.SqlQ;
import com.lti.service.SqlService;



@RestController
public class SqlRestController {
	
	@Autowired
	private SqlService service;
	
	@PostMapping(value = "/add", consumes = "application/json")
	public String addSqlQ(@RequestBody SqlQ sql) {
		service.persist(sql);
		return "Sql Question added successfully";
	}
	
	@GetMapping(value = "/fetch/{id}", produces = "application/json")
	public SqlQ fetchSqlQ(@PathVariable int id) {
		return service.find(id);
	}
	
	@GetMapping(value = "/list", produces = "application/json")
	public List<SqlQ> listSqlQ(){
		return service.load();
	}
	
	@PutMapping(value = "/edit", consumes = "application/json")
	public String updateSqlQ(@RequestBody SqlQ sql) {
		service.edit(sql);
		return "Sql Question updated successfully";
	}
	
	@DeleteMapping("/del/{id}")
	public String delSqlQ(@PathVariable int id) {
		service.remove(id);
		return "Sql Question deleted successfully";
	}

}
