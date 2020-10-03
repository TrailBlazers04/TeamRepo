package com.lti.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.junit.Before;
import org.junit.Test;


import com.lti.entity.JavaQ;

public class TestJava {
	
	private EntityManagerFactory factory;
	
	@Before
	public void init()
	{
		factory =Persistence.createEntityManagerFactory("SpringREST");
		
	}
	
	@Test
	public void testAddJava() {
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		txn.begin();
		JavaQ j1=new JavaQ();
		j1.setQno(1);
		j1.setQuestion("True about java");
		j1.setO1("is ");
		j1.setO2("none");
		j1.setO3("is ");
		j1.setO4("All ");
		j1.setCo(1);
		

		em.merge(j1);
		txn.commit();
		em.close();
	}
	
	@Test
	public void testFetchQuestion() {
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		txn.begin();
		JavaQ j1 =em.find(JavaQ.class,7);
		System.out.println(j1.getQuestion());
		
		
	}
	
	
}
