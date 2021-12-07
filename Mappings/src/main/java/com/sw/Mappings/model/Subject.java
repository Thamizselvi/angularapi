package com.sw.Mappings.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;


@Entity
@Table(name = "SUBJECTS")
public class Subject {
 
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "subject_id")
    private long subject_id;
 
    @Column(name = "subjectname")
    private String subjectname;
    @ManyToMany(targetEntity = Student.class, mappedBy = "subjects", cascade = CascadeType.ALL)
    @JsonBackReference
     
//    @ManyToMany(mappedBy="subjects",cascade=CascadeType.ALL)
    private List<Student> students = new ArrayList<Student>();
    
    
    public Subject(){
         
    }


	public Subject(long subject_id, String subjectname, List<Student> students) {
		super();
		this.subject_id = subject_id;
		this.subjectname = subjectname;
		this.students = students;
	}


	public long getSubject_id() {
		return subject_id;
	}


	public void setSubject_id(long subject_id) {
		this.subject_id = subject_id;
	}


	public String getSubjectname() {
		return subjectname;
	}


	public void setSubjectname(String subjectname) {
		this.subjectname = subjectname;
	}


	public List<Student> getStudents() {
		return students;
	}


	public void setStudents(List<Student> students) {
		this.students = students;
	}

	@Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (subject_id ^ (subject_id >>> 32));
        result = prime * result + ((subjectname == null) ? 0 : subjectname.hashCode());
        return result;
    }
 
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof Subject))
            return false;
        Subject other = (Subject) obj;
        if (subject_id != other.subject_id)
            return false;
        if (subjectname == null) {
            if (other.subjectname != null)
                return false;
        } else if (!subjectname.equals(other.subjectname))
            return false;
        return true;
    }
	@Override
	public String toString() {
		return "Subject [subject_id=" + subject_id + ", subjectname=" + subjectname + ", students=" + students + "]";
	}
     
}