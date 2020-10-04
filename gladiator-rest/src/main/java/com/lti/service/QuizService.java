package com.lti.service;

import java.util.List;


import com.lti.entity.Quiz;

/**
 * Represents a quiz service interface
 * @author sushil
 * @version 1.0
 *
 */

public interface QuizService {
	
	void persist(Quiz quiz);
	
	Quiz find(int qid );
	
	List<Quiz> load(String topic);
	
	void remove(int qid);
	
	void edit(Quiz quiz);
	

}