package com.lti.service;

import java.util.List;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.entity.JavaQ;

import com.lti.repo.JavaRepo;

@Service
public class JavaServiceImpl implements JavaService {

	@Autowired
	private JavaRepo repo;
	
	@Transactional(value = TxType.REQUIRED)
	public void persist(JavaQ java) {
		repo.save(java);
	}

	public JavaQ find(int qno) {
		return repo.fetch(qno);
	}

	public List<JavaQ> load() {
		return repo.list();
	}
	@Transactional(value = TxType.REQUIRED)
	public void remove(int qno) {
		repo.delete(qno);

	}
	@Transactional(value = TxType.REQUIRED)
	public void edit(JavaQ java) {
		repo.update(java);

	}

}
