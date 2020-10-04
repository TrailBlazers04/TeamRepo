package com.lti.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.lti.entity.Admin;



@Repository
public class AdminRepoImpl implements AdminRepo {
	
	@PersistenceContext
	private EntityManager em; 

	public void addAdmin(Admin admin) {
		em.persist(admin);

	}

//	public Admin authenticate(Login login) {
//		Query query = em.createNamedQuery("login");
//		query.setParameter("eml",login.getEmail());
//		query.setParameter("pwd",login.getPassword());
//		return (Admin) query.getSingleResult();
//	}

	public List<Admin> fetchAdmin(String email, String password) {
		Query query = em.createNamedQuery("login");
		query.setParameter("eml",email);
		query.setParameter("pwd",password);
		return query.getResultList();
		
	}

}
