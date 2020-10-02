package com.lti.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.junit.Before;
import org.junit.Test;

import com.lti.entity.StudentStats;

public class TestStudentStats {
	
	private EntityManagerFactory factory;
	
	@Before
	public void init()
	{
		factory = Persistence.createEntityManagerFactory("SpringREST");
		
	}
	
	@Test
	public void testAddStudentStats() {
		
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		txn.begin();
		
		StudentStats s1 = new StudentStats();
		s1.setId(101);
		s1.setJava_marks(65);
		s1.setJquery_marks(70);
		s1.setSql_marks(73);
		
		em.merge(s1);
		txn.commit();
		em.close();
		
	}
	
	@Test
	public void testFetchStudentStats() {
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		txn.begin();
		StudentStats j1 =em.find(StudentStats.class,101);
		System.out.println(j1.getJava_marks() + "\t" + j1.getJquery_marks() + "\t" + j1.getSql_marks());
		
		
	}
	

}
