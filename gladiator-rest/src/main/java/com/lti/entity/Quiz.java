package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Represents a quiz entity with topic tag, options and answer
 * @author ayan
 * @version 1.0
 *
 */


@Entity
@Table(name = "quiz")
@SequenceGenerator(name = "qzseq", sequenceName = "seq_qz", initialValue = 101, allocationSize = 1)
public class Quiz {

	@Id
	@GeneratedValue(generator = "qzseq", strategy = GenerationType.SEQUENCE)
	@Column(name = "question_id")
	private int qid;
	
	@Column(length = 10, name = "topics")
	private String topic;
	
	@Column(length = 100, name = "questions")
	private String question;
	
	@Column(length = 100, name = "option_A")
	private String optionA;
	
	@Column(length = 100, name = "option_B")
	private String optionB;
	
	@Column(length = 100, name = "option_C")
	private String optionC;
	
	@Column(length = 100, name = "option_D")
	private String optionD;
	
	@Column(length = 100, name = "Correct_Ans")
	private String correctAns;

	public int getQid() {
		return qid;
	}

	public void setQid(int qid) {
		this.qid = qid;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getOptionA() {
		return optionA;
	}

	public void setOptionA(String optionA) {
		this.optionA = optionA;
	}

	public String getOptionB() {
		return optionB;
	}

	public void setOptionB(String optionB) {
		this.optionB = optionB;
	}

	public String getOptionC() {
		return optionC;
	}

	public void setOptionC(String optionC) {
		this.optionC = optionC;
	}

	public String getOptionD() {
		return optionD;
	}

	public void setOptionD(String optionD) {
		this.optionD = optionD;
	}

	public String getCorrectAns() {
		return correctAns;
	}

	public void setCorrectAns(String correctAns) {
		this.correctAns = correctAns;
	}

	@Override
	public String toString() {
		return "Quiz [qid=" + qid + ", topic=" + topic + ", question=" + question + ", optionA=" + optionA
				+ ", optionB=" + optionB + ", optionC=" + optionC + ", optionD=" + optionD + ", correctAns="
				+ correctAns + "]";
	}
	
	
}
