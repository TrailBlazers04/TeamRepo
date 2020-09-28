package com.lti.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.lti.entity.JavaQ;
import com.lti.entity.SqlQ;


@Repository
public class SqlRepoImpl implements SqlRepo {

	
	@PersistenceContext
	private EntityManager em;
	
	public void save(SqlQ sql) {
		em.persist(sql);

	}

	public SqlQ fetch(int qno) {
		return em.find(SqlQ.class, qno);
	}

	public List<SqlQ> list() {
		return em.createQuery("from SqlQ").getResultList();
	}

	public void delete(int qno) {
		em.remove(em.find(SqlQ.class, qno));

	}

	public void update(SqlQ sql) {
		em.merge(sql);

	}

}
