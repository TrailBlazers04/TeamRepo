package com.lti.entity;

import javax.persistence.*;

@Entity
@Table(name="admins")
@NamedQuery(name="login",query="from Admin WHERE email=:eml AND password=:pwd ")
public class Admin {
	
    @Id
	@Column(length=30)
	private String email;
	@Column(length=10)
	private String adminname;
	@Column(length=10)
	private String password;
	public String getAdminname() {
		return adminname;
	}
	public void setAdminname(String adminname) {
		this.adminname = adminname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

	
	
}
