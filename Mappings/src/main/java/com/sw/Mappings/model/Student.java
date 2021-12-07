package com.sw.Mappings.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="STUDENT")
public class Student {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	
	 @Column(name = "student_id")
    private long student_id;
 
    @Column(name = "first_name")
    private String firstName;
 
    @Column(name = "last_name")
    private String lastName;
    
    
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name ="STUDENT_SUBJECT", joinColumns = { @JoinColumn(name = "student_id") },
    inverseJoinColumns = {    @JoinColumn(name = "subject_id") })
//    @ManyToMany(cascade = CascadeType.ALL)
//    @JsonIgnore
//    @JoinTable(name = "STUDENT_SUBJECT", 
//        joinColumns = { @JoinColumn(name = "student_id") }, 
//        inverseJoinColumns = { @JoinColumn(name = "subject_id") })
    private List<Subject> subjects = new ArrayList<Subject>();

    public Student() {
    	
    }
    
	public Student(long student_id, String firstName, String lastName, List<Subject> subjects) {
		super();
		this.student_id = student_id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.subjects = subjects;
	}

	public long getStudent_id() {
		return student_id;
	}

	public void setStudent_id(long student_id) {
		this.student_id = student_id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}

	  @Override
	    public int hashCode() {
	        final int prime = 31;
	        int result = 1;
	        result = prime * result + (int) (student_id ^ (student_id >>> 32));
	        return result;
	    }
	 
	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj)
	            return true;
	        if (obj == null)
	            return false;
	        if (!(obj instanceof Student))
	            return false;
	        Student other = (Student) obj;
	        if (student_id != other.student_id)
	            return false;
	        return true;
	    }
	@Override
	public String toString() {
		return "Student [student_id=" + student_id + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", subjects=" + subjects + "]";
	}
 
}