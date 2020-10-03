package com.lti.entity;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "students")
@SequenceGenerator(name = "stdseq", sequenceName = "seq_std", initialValue = 101)
public class StudentDetails {

	@Id
	@Column(name = "user_id")
	@GeneratedValue(generator = "stdseq", strategy = GenerationType.SEQUENCE)
	private int sid;
	
	@Column(length = 15)
	private String fname;
	
	@Column(length = 15)
	private String lname;
	
	@Column(length = 30)
	private String email;
	
	@Column(length = 20)
	private String password;
	
	@Column(length = 10)
	private Date dob;
	
	@Column(length = 20)
	private String state;
	
	@Column(length = 20)
	private String city;
	
	@Column(length = 10)
	private String qualification;
	
	@Column(length = 12)
	private String mobile;
	
	@OneToOne(mappedBy = "s", cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
	private StudentStats stats;

	public int getUserId() {
		return sid;
	}

	public void setUserId(int userId) {
		this.sid = userId;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public StudentStats getStats() {
		return stats;
	}

	public void setStats(StudentStats stats) {
		this.stats = stats;
	}
	
}