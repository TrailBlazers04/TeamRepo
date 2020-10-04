package com.lti.service;

import java.util.List;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.entity.Quiz;

import com.lti.repo.QuizRepo;

/**
 * Represents a quiz service implimentation
 * @author sushil
 * @version 1.0
 *
 */
@Service
public class QuizServiceImpl implements QuizService {

	
	@Autowired
	private QuizRepo repo;
	
	@Transactional(value = TxType.REQUIRED)
	public void persist(Quiz quiz) {
		
		repo.save(quiz);

	}

	public Quiz find(int qid) {
		return repo.fetch(qid);
	}

	

	@Transactional(value = TxType.REQUIRED)
	public void remove(int qid) {
		repo.delete(qid);

	}
	@Transactional(value = TxType.REQUIRED)
	public void edit(Quiz quiz) {
		repo.update(quiz);

	}

	public List<Quiz> load(String topic) {
		return repo.fetchByTopic(topic);
	}

}