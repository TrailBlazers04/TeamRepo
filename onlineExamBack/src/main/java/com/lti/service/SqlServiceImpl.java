package com.lti.service;

import java.util.List;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.beans.factory.annotation.Autowired;

import com.lti.entity.SqlQ;

import com.lti.repo.SqlRepo;

public class SqlServiceImpl implements SqlService {

	@Autowired
	private SqlRepo repo;
	
	
	@Transactional(value = TxType.REQUIRED)
	public void persist(SqlQ sql) {
		repo.save(sql);

	}

	public SqlQ find(int qno) {
		return repo.fetch(qno);
	}

	public List<SqlQ> load() {
		return repo.list();
	}
	@Transactional(value = TxType.REQUIRED)
	public void remove(int qno) {
		repo.delete(qno);

	}
	@Transactional(value = TxType.REQUIRED)
	public void edit(SqlQ sql) {
		repo.update(sql);

	}

}
