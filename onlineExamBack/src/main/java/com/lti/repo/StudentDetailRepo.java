package com.lti.repo;

import java.util.List;

import com.lti.entity.StudentDetails;

public interface StudentDetailRepo {

void save(StudentDetails repo);
	
	StudentDetails fetch(int id);
	
	List<StudentDetails> list();
	
	void delete(int id);
	
	void update(StudentDetails repo);
}