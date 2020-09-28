package com.lti.service;

import java.util.List;

import com.lti.entity.SqlQ;



public interface SqlService {
	
	void persist(SqlQ sql);
	
	SqlQ find(int qno);

	List<SqlQ> load();

	void remove(int qno);

	void edit(SqlQ sql);

}
