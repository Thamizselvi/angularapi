package com.oto.onetoone.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Table(name="UserProfile")
@Entity
public class UserProfile {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(name="phno")
	private String phno;
	
	@Column(name="address")
	private String address;
	
	@Enumerated(EnumType.STRING)
	@Column(name="Gender")
	private Gender Gender;
	
	@Column(name="dob")
	private LocalDate dob;
	
	private User user;
	
	public UserProfile() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPhno() {
		return phno;
	}

	public void setPhno(String phno) {
		this.phno = phno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Gender getGender() {
		return Gender;
	}

	public void setGender(Gender gender) {
		Gender = gender;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public UserProfile(Long id, String phno, String address, com.oto.onetoone.model.Gender gender, LocalDate dob) {
		super();
		this.id = id;
		this.phno = phno;
		this.address = address;
		Gender = gender;
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "UserProfile [id=" + id + ", phno=" + phno + ", address=" + address + ", Gender=" + Gender + ", dob="
				+ dob + "]";
	}
	
	public User getuser() {
		return user;
	}
	public void setUser(User user) {
		this.user=user;
	}
	}
	
	

