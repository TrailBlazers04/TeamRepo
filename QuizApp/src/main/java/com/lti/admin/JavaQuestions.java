package com.lti.admin;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "javaq")
public class JavaQuestions {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private String Question;
	@Column(name="option 1",length=20)
	private String Option1;
	@Column(name="option 2",length=20)
	private String Option2;
	@Column(name="option 3",length=20)
	private String Option3;
	@Column(name="option 4",length=20)
	private String Option4;
	@Column(name="correct option")
	private int Correct;
	public String getQuestion() {
		return Question;
	}
	public void setQuestion(String question) {
		Question = question;
	}
	public String getOption1() {
		return Option1;
	}
	public void setOption1(String option1) {
		Option1 = option1;
	}
	public String getOption2() {
		return Option2;
	}
	public void setOption2(String option2) {
		Option2 = option2;
	}
	public String getOption3() {
		return Option3;
	}
	public void setOption3(String option3) {
		Option3 = option3;
	}
	public String getOption4() {
		return Option4;
	}
	public void setOption4(String option4) {
		Option4 = option4;
	}
	public int getCorrect() {
		return Correct;
	}
	public void setCorrect(int correct) {
		Correct = correct;
	}
	
	

}
