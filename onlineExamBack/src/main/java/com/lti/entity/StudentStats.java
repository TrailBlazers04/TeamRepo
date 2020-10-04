package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "studentmark")
public class StudentStats {
	
	@Id
	@GeneratedValue
	private int id;
<<<<<<< HEAD
	@Column(length = 3)
	private int java_marks;
	@Column(length = 3)
	private int sql_marks;
=======
	
	@Column(length = 3)
	private int java_marks;
	
	@Column(length = 3)
	private int sql_marks;
	
>>>>>>> f31c99e24c390bfe09f5955571e1de303df9fdec
	@Column(length = 3)
	private int jquery_marks;
	
	@OneToOne
<<<<<<< HEAD
	@JoinColumn(name ="sid")
	
=======
	@JoinColumn(name ="user_id")
>>>>>>> f31c99e24c390bfe09f5955571e1de303df9fdec
	private StudentDetails s;
	
	
	public StudentDetails getS() {
		return s;
	}
	public void setS(StudentDetails s) {
		this.s = s;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getJava_marks() {
		return java_marks;
	}
	public void setJava_marks(int java_marks) {
		this.java_marks = java_marks;
	}
	public int getSql_marks() {
		return sql_marks;
	}
	public void setSql_marks(int sql_marks) {
		this.sql_marks = sql_marks;
	}
	public int getJquery_marks() {
		return jquery_marks;
	}
	public void setJquery_marks(int jquery_marks) {
		this.jquery_marks = jquery_marks;
	}
	
	
	
	

<<<<<<< HEAD
}
=======
}
>>>>>>> f31c99e24c390bfe09f5955571e1de303df9fdec
