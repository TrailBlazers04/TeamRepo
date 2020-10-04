/*
 * @author supriya
 * @version 1.0
 */


package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "studentmark")
@SequenceGenerator(name = "stdmark", sequenceName = "seq_marks", initialValue = 101, allocationSize=1)
public class StudentStat {
	
	@Id
	@GeneratedValue(generator = "stdmark", strategy = GenerationType.SEQUENCE)
	private int id;
	@Column(length = 3)
	private int javaMarks;
	@Column(length = 3)
	private int sqlMarks;
	@Column(length = 3)
	private int jqueryMarks;
	
	@OneToOne
	@JoinColumn(name ="user_id")
	private StudentDetail student;
	
	
	public StudentDetail getStudent() {
		return student;
	}
	public void setStudent(StudentDetail student) {
		this.student = student;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getJavaMarks() {
		return javaMarks;
	}
	public void setJavaMarks(int javaMarks) {
		this.javaMarks = javaMarks;
	}
	public int getSqlMarks() {
		return sqlMarks;
	}
	public void setSqlMarks(int sqlMarks) {
		this.sqlMarks = sqlMarks;
	}
	public int getJqueryMarks() {
		return jqueryMarks;
	}
	public void setJqueryMarks(int jqueryMarks) {
		this.jqueryMarks = jqueryMarks;
	}
	@Override
	public String toString() {
		return "StudentStat [id=" + id + ", javaMarks=" + javaMarks + ", sqlMarks=" + sqlMarks + ", jqueryMarks="
				+ jqueryMarks + ", student=" + student + "]";
	}
	
	
	
	

}