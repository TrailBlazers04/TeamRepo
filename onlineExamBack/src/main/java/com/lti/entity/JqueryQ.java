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
	private int o1;
	private int o2;
	private int o3;
	private int o4;
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
	public int getO1() {
		return o1;
	}
	public void setO1(int o1) {
		this.o1 = o1;
	}
	public int getO2() {
		return o2;
	}
	public void setO2(int o2) {
		this.o2 = o2;
	}
	public int getO3() {
		return o3;
	}
	public void setO3(int o3) {
		this.o3 = o3;
	}
	public int getO4() {
		return o4;
	}
	public void setO4(int o4) {
		this.o4 = o4;
	}
	public int getCo() {
		return co;
	}
	public void setCo(int co) {
		this.co = co;
	}
	
	
	
	

}
