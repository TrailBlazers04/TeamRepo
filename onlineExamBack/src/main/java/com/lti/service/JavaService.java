package com.lti.service;

import java.util.List;

import com.lti.entity.JavaQ;



public interface JavaService {
	
		void persist(JavaQ java);
	
		JavaQ find(int qno);
	
		List<JavaQ> load();
	
		void remove(int qno);
	
		void edit(JavaQ java);

}
