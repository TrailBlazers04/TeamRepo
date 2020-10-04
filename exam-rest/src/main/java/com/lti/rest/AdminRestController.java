package com.lti.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.lti.entity.Admin;

import com.lti.service.AdminService;



@RestController
public class AdminRestController {

	@Autowired
	private AdminService service;
	
	@PostMapping(value="/register",consumes="application/json")
	public String saveAdmin(@RequestBody Admin admin) {
		service.saveAdmin(admin);
		return "Admin saved";
	} 
	
//	@GetMapping(value ="/login",produces = "application/json")
//	public Admin login(@RequestParam("email") String email,
//		@RequestParam("password") String password) { 
//		Login login = new Login(email,password);
//		Admin admin = service.validate(login);
//		System.out.println(admin.getEmail() + "\t" + admin.getPassword());
//		return admin;
//	}
//	
	
	@PostMapping(value="/login",consumes = "application/json")
	@CrossOrigin(origins = "http://localhost:4200")
	public Admin fetchAdmin(@RequestBody Admin admin) throws Exception {
		String tempEmail = admin.getEmail();
		String tempPassword = admin.getPassword();
		List<Admin> adminObj = null;
		if(tempEmail != null && tempPassword !=null) {
			adminObj = service.fetchByAdmin(tempEmail, tempPassword);
		}
		if(adminObj.size() == 0) {
			throw new Exception("Bad credentials");
		}
		
		return admin;
	}
	
	
}