package com.lti.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.lti.entity.JavaQ;
import com.lti.entity.JqueryQ;



@Repository
public class JqueryRepoImpl implements JqueryRepo {

	@PersistenceContext
	private EntityManager em;
	
	public void save(JqueryQ jquery) {
		em.persist(jquery);

	}

	public JqueryQ fetch(int qno) {
		return em.find(JqueryQ.class, qno);
	}

	public List<JqueryQ> list() {
		return em.createQuery("from JqueryQ").getResultList();
	}

	public void delete(int qno) {
		em.remove(em.find(JqueryQ.class, qno));

	}

	public void update(JqueryQ jquery) {
		em.merge(jquery);

	}

}
