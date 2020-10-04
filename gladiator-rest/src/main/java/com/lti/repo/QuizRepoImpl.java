package com.lti.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.stereotype.Repository;

import com.lti.entity.Quiz;

@Repository
public class QuizRepoImpl implements QuizRepo {

	@PersistenceContext
	private EntityManager em;
	
	@Transactional(value = TxType.REQUIRED)
	public void save(Quiz ques) {
		em.persist(ques);
	}

	public Quiz fetch(int quesid) {
		Quiz q = em.find(Quiz.class, quesid);
		return q;
	}

	public List<Quiz> fetchByTopic(String topic) {
		String jpql = "FROM Quiz WHERE topic =:orc";
		
		Query q1 = em.createQuery(jpql);
		q1.setParameter("orc", topic);
		return q1.getResultList();
	}
	
	@Transactional(value = TxType.REQUIRED)
	public void update(Quiz ques) {
		em.merge(ques);
	}

	@Transactional(value = TxType.REQUIRED)
	public void delete(int quesid) {
		Quiz q = em.find(Quiz.class, quesid);
		em.remove(q);
	}

}
