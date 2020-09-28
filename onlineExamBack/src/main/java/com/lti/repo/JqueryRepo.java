package com.lti.repo;

import java.util.List;

import com.lti.entity.JqueryQ;
import com.lti.entity.SqlQ;

public interface JqueryRepo {

void save(JqueryQ jquery);
	
	JqueryQ fetch(int qno);
	
	List<JqueryQ> list();
	
	void delete(int qno);
	
	void update(JqueryQ jquery);

}
