package com.lti.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import com.lti.entity.StudentDetails;

public class StudentDetailRepoImpl implements StudentDetailRepo {

	@PersistenceContext
	private EntityManager em;
	
	@Transactional(value = TxType.REQUIRED)
	public void save(StudentDetails repo) {
		em.persist(repo);

	}
	
	public StudentDetails fetch(int id) {
		return em.find(StudentDetails.class, id);
	}
	
	public List<StudentDetails> list() {
		return em.createQuery("from StudentDetails").getResultList();
	}
	
	@Transactional(value = TxType.REQUIRED)
	public void update(StudentDetails repo) {
		em.merge(repo);
		
	}
	
	@Transactional(value = TxType.REQUIRED)
	public void remove(int id) {
		em.remove(em.find(StudentDetails.class,id));
		
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
