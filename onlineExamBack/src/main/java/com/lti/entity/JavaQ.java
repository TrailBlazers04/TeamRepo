package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="JavaQ")
@SequenceGenerator(name = "emseq", sequenceName = "seq_emp", initialValue = 1, allocationSize = 1)
public class JavaQ {
	
	@Id
	@GeneratedValue(generator = "emseq", strategy = GenerationType.SEQUENCE)
	private int qno;
	@Column(length = 30)
	private String question;
<<<<<<< HEAD
	private String option1;
	private String option2;
	private String option3;
	private String option4;
	private String correctans;
=======
<<<<<<< HEAD
	private String o1;
	private String o2;
	private String o3;
	private String o4;
	private String co;
=======
	
	@Column(length = 5)
	private String o1;
	
	@Column(length = 5)
	private String o2;
	
	@Column(length = 5)
	private String o3;
	
	@Column(length = 5)
	private String o4;
	
	
	private int co;
>>>>>>> a6ab22d76317ed8fc36ec34e6a21c948348accaa
	
>>>>>>> f31c99e24c390bfe09f5955571e1de303df9fdec
	public int getQno() {
		return qno;
	}
	public void setQno(int qno) {
		this.qno = qno;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
<<<<<<< HEAD
	public String getOption1() {
		return option1;
	}
	public void setOption1(String option1) {
		this.option1 = option1;
	}
	public String getOption2() {
		return option2;
	}
	public void setOption2(String option2) {
		this.option2 = option2;
	}
	public String getOption3() {
		return option3;
	}
	public void setOption3(String option3) {
		this.option3 = option3;
	}
	public String getOption4() {
		return option4;
	}
	public void setOption4(String option4) {
		this.option4 = option4;
	}
	public String getCorrectans() {
		return correctans;
	}
	public void setCorrectans(String correctans) {
		this.correctans = correctans;
	}
	
	
	
	
	

=======
	public String getO1() {
		return o1;
	}
	public void setO1(String o1) {
		this.o1 = o1;
	}
	public String getO2() {
		return o2;
	}
	public void setO2(String o2) {
		this.o2 = o2;
	}
	public String getO3() {
		return o3;
	}
	public void setO3(String o3) {
		this.o3 = o3;
	}
	public String getO4() {
		return o4;
	}
	public void setO4(String o4) {
		this.o4 = o4;
	}
	public String getCo() {
		return co;
	}
	public void setCo(String co) {
		this.co = co;
	}
	
>>>>>>> f31c99e24c390bfe09f5955571e1de303df9fdec
}
