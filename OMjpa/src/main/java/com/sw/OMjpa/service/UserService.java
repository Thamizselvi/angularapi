package com.sw.OMjpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sw.OMjpa.model.User;
import com.sw.OMjpa.model.UserProfile;
import com.sw.OMjpa.repository.UserProfileRepository;
import com.sw.OMjpa.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private UserProfileRepository userProfileRepository;

	
	public Iterable<User> fetchAllRecords() {
		return userRepository.findAll();
	}


	public List<UserProfile> fetchAllRecords1() {
		return userProfileRepository.findAll();
	}


	public List<UserProfile> findAll() {
		return userProfileRepository.findAll();
	}
}
