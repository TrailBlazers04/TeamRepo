package com.lti.service;

import java.util.List;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.entity.JqueryQ;

import com.lti.repo.JqueryRepo;


@Service
public class JqueryServiceImpl implements JqueryService {

	
	@Autowired
	private JqueryRepo repo;
	
	@Transactional(value = TxType.REQUIRED)
	public void persist(JqueryQ jquery) {
		repo.save(jquery);

	}

	public JqueryQ find(int qno) {
		return repo.fetch(qno);
	}

	public List<JqueryQ> load() {
		return repo.list();
	}
	@Transactional(value = TxType.REQUIRED)
	public void remove(int qno) {
		repo.delete(qno);

	}
	@Transactional(value = TxType.REQUIRED)
	public void edit(JqueryQ jquery) {
		repo.update(jquery);

	}

}
