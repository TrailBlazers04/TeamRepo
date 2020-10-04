package com.lti.repo;

import java.util.List;

import com.lti.entity.Quiz;

public interface QuizRepo {

	void save(Quiz ques);
	
	Quiz fetch(int quesid);
	
	List<Quiz> fetchByTopic(String topic);
	
	void update(Quiz ques);
	
	void delete(int quesid);
}
