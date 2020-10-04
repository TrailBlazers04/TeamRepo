package com.lti.test;

<<<<<<< HEAD

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
			j1.setOption1("is platform independent");
			j1.setOption2("none");
			j1.setOption3("is not oop");
			j1.setOption4("All of the above");
			j1.setCorrectans("is platform independent");
			

			em.merge(j1);
			txn.commit();
			em.close();
		}
	}


=======
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
	public void testAddProduct() {
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		txn.begin();
		JavaQ j1=new JavaQ();
		j1.setQno(1);
		j1.setQuestion("True about java");
		j1.setO1("is platform independent");
		j1.setO2("none");
		j1.setO3("is not oop");
		j1.setO4("All of the above");
		j1.setCo("is platform independent");
		

		em.persist(j1);
		txn.commit();
		em.close();
	}
}
>>>>>>> f31c99e24c390bfe09f5955571e1de303df9fdec
