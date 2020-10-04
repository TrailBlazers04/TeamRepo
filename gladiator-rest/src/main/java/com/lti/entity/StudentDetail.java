/*
 * @author ayan
 * @version 1.0
 * @author supriya
 * @version 2.0
 */

package com.lti.entity;

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
@SequenceGenerator(name = "stdseq", sequenceName = "seq_std", initialValue = 101, allocationSize=1)
public class StudentDetail {

	@Id
	@Column(name = "user_id")
	@GeneratedValue(generator = "stdseq", strategy = GenerationType.SEQUENCE)
	private int userId;
	@Column(length = 15)
	private String fname;
	@Column(length = 15)
	private String lname;
	@Column(length = 30)
	private String email;
	@Column(length = 20)
	private String password;
	@Column(length = 10)
	private String dob;
	@Column(length = 20)
	private String state;
	@Column(length = 20)
	private String city;
	@Column(length = 10)
	private String qualification;
	@Column(length = 12)
	private String mobile;
	
	@OneToOne(mappedBy = "student", cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
	private StudentStat stats;
	

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
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

	public StudentStat getStats() {
		return stats;
	}

	public void setStats(StudentStat stats) {
		this.stats = stats;
	}

	@Override
	public String toString() {
		return "StudentDetail [userId=" + userId + ", fname=" + fname + ", lname=" + lname + ", email=" + email
				+ ", password=" + password + ", dob=" + dob + ", state=" + state + ", city=" + city + ", qualification="
				+ qualification + ", mobile=" + mobile + ", stats=" + stats + "]";
	}
	
	
	
}


