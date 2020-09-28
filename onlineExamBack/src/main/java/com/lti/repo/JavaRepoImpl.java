package com.lti.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;


import com.lti.entity.JavaQ;


@Repository
public class JavaRepoImpl implements JavaRepo {
	
	@PersistenceContext
	private EntityManager em;

	public void save(JavaQ java) {
		em.persist(java);

	}

	public JavaQ fetch(int qno) {
		return em.find(JavaQ.class, qno);
	}

	public List<JavaQ> list() {
		return em.createQuery("from JavaQ").getResultList();
	}

	public void delete(int qno) {
		em.remove(em.find(JavaQ.class, qno));

	}

	public void update(JavaQ java) {
		em.merge(java);

	}

}
