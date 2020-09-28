package com.lti.repo;

import java.util.List;

import com.lti.entity.JavaQ;

public interface JavaRepo {
	
	void save(JavaQ java);
	
	JavaQ fetch(int qno);
	
	List<JavaQ> list();
	
	void delete(int qno);
	
	void update(JavaQ java);
	

}
