package com.lti.repo;

import java.util.List;

import com.lti.entity.SqlQ;


public interface SqlRepo {
	
void save(SqlQ sql);
	
	SqlQ fetch(int qno);
	
	List<SqlQ> list();
	
	void delete(int qno);
	
	void update(SqlQ sql);

}
