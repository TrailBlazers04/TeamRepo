package com.lti.service;

import java.util.List;

import com.lti.entity.JqueryQ;



public interface JqueryService {
	
	void persist(JqueryQ jquery);
	
	JqueryQ find(int qno);

	List<JqueryQ> load();

	void remove(int qno);

	void edit(JqueryQ jquery);

}
