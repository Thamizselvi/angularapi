package com.sw.OMjpa.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sw.OMjpa.service.UserService;
import com.sw.OMjpa.model.User;
import com.sw.OMjpa.model.UserProfile;


@RequestMapping("/test")
@RestController

public class UserController {

	@Autowired
	UserService userService;
	
	@GetMapping("/beat")
	public String ping() {
		return LocalDate.now().toString();
	}

	//Fetch all data from database
	@GetMapping("/base")
	public Iterable<User> fecthAll() {
		return userService.fetchAllRecords();
	}
	
	@GetMapping("/Address-base")
	public List<UserProfile> fectchrecords() {
		return userService.fetchAllRecords1();
	}
	
	//one to one test
	@GetMapping("/all")
    public List<UserProfile> getAll() {
        return userService.findAll();
    }
}
