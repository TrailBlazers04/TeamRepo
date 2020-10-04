package com.lti.service;


import java.util.List;

import com.lti.entity.Admin;



public interface AdminService {

	void saveAdmin(Admin admin);
	
//	Admin validate(Login login);
	
	List<Admin> fetchByAdmin(String email, String password);
	
}
