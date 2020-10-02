package com.lti.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.lti.entity.Quiz;
import com.lti.service.QuizService;

/**
 * Represents a quiz rest controller
 * @author sushil
 * @version 1.0
 *
 */
@CrossOrigin
@RestController
@RequestMapping("/quiz")
public class QuizRestController {
	
	// url to access http://localhost:8080/exam-rest/rest/
	
	@Autowired
	private QuizService service;
	
	@PostMapping(value = "/add", consumes = "application/json")
	public String addQuestion(@RequestBody Quiz quiz) {
		service.persist(quiz);
		return " Question added Sucessfully";
	}
	
	@GetMapping(value = "/listByTopic/{topic}", produces = "application/json")
	public List<Quiz> listQuestionByTopic(@PathVariable String topic){
		return service.load(topic);
	}
	
	@GetMapping(value = "/fetch/{qid}", produces = "application/json")
	public Quiz fetchQuestion(@PathVariable int qid)
	{
		return service.find(qid);
	}
	
	@PutMapping(value = "/edit/{qid}", consumes = "application/json")
	public String updateQuestion(@RequestBody Quiz quiz, @PathVariable int qid) {
		service.edit(quiz);
		return "Question updated successfully";
	}
	
	@DeleteMapping("/del/{id}")
	public String delQuestion(@PathVariable int id) {
		service.remove(id);
		return "Question deleted successfully";
	}
	

}
