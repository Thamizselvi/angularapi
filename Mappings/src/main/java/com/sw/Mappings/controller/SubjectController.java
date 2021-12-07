package com.sw.Mappings.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.sw.Mappings.model.Subject;
import com.sw.Mappings.model.Student;
import com.sw.Mappings.service.UserService;

@RestController
@RequestMapping("/check")
public class SubjectController {
	
	@Autowired
	private UserService userService;

	
	@GetMapping("/beat")
	public String ping() {
		return LocalDate.now().toString();}
		
		@GetMapping("/base")
		public Iterable<Student> fecthAll() {
		return userService.fetchAllsRecords();
		}
		
		@GetMapping("/base-subject")
		public Iterable<Subject> fecthAlls() {
		return userService.fetchAllRecord();
		}
		
		
}
