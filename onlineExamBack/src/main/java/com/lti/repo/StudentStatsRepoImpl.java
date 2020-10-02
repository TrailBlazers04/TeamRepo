package com.lti.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.stereotype.Repository;

import com.lti.entity.StudentStats;

@Repository
public class StudentStatsRepoImpl implements StudentStatsRepo {
	
	@PersistenceContext
	private EntityManager em;
	
	@Transactional(value = TxType.REQUIRED)
	public void save(StudentStats repo) {
		em.persist(repo);

	}
	
	public StudentStats fetch(int id) {
		return em.find(StudentStats.class, id);
	}
	
	public List<StudentStats> list() {
		return em.createQuery("from StudentStats").getResultList();
	}
	
	@Transactional(value = TxType.REQUIRED)
	public void update(StudentStats repo) {
		em.merge(repo);
		
	}
	
	@Transactional(value = TxType.REQUIRED)
	public void remove(int id) {
		em.remove(em.find(StudentStats.class,id));
		
	}
	

}
