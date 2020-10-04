package com.lti.repo;

import java.util.List;

import com.lti.entity.Admin;



public interface AdminRepo {

	void addAdmin(Admin admin);
	
//	Admin authenticate(Login login);
	
	List<Admin> fetchAdmin(String email, String password);
	
}
