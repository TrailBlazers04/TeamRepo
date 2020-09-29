package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="JQueryQ")
@SequenceGenerator(name = "emseq", sequenceName = "seq_emp", initialValue = 1, allocationSize = 1)
public class JqueryQ {
	
	@Id
	@GeneratedValue(generator = "emseq", strategy = GenerationType.SEQUENCE)
	private int qno;
	@Column(length = 30)
	private String question;
	private String o1;
	private String o2;
	private String o3;
	private String o4;
	private int co;
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
	public int getCo() {
		return co;
	}
	public void setCo(int co) {
		this.co = co;
	}
	
	
	
	

}