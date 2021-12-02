package com.oto.onetoone.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="userss")
public class User {
	
	@Id
	private long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="email")
	private String email;
	
	
	@OneToOne(fetch=FetchType.LAZY, cascade =CascadeType.ALL,mappedBy ="userprofile")
	@JoinColumn(name="Userid")
	
	private UserProfile userprofile;
	
	public User(){
		
	}
	public User(long id, String name, String email, UserProfile userprofile) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.userprofile = userprofile;
	}

	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public UserProfile getUserprofile() {
		return userprofile;
	}
	public void setUserprofile(UserProfile userprofile) {
		this.userprofile = userprofile;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", userprofile=" + userprofile + "]";
	}
	
	
}
