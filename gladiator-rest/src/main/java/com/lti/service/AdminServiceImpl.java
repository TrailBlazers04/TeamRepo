package com.lti.service;

import java.util.List;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.entity.Admin;

import com.lti.repo.AdminRepo;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	private AdminRepo repo;
    
	@Transactional(value = TxType.REQUIRED)
	public void saveAdmin(Admin admin) {
		repo.addAdmin(admin);

	}

//	public Admin validate(Login login) {
//		return repo.authenticate(login);
//	}

	public List<Admin> fetchByAdmin(String email, String password) {
		return repo.fetchAdmin(email, password);
	}


}
