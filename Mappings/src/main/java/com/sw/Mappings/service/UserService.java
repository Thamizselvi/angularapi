package com.sw.Mappings.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sw.Mappings.model.Student;
import com.sw.Mappings.model.Subject;
import com.sw.Mappings.repository.StudentRepository;
import com.sw.Mappings.repository.SubjectRepository;

@Service
public class UserService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private SubjectRepository subjectRepository;
	
	public Iterable<Student> fetchAllRecords() {
		
		return studentRepository.findAll();
	}

	public Iterable<Student> fetchAllsRecords() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}
	

	public Iterable<Subject> fetchAllRecord() {
		// TODO Auto-generated method stub
		return subjectRepository.findAll();
	}
}
