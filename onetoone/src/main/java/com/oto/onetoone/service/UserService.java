package com.oto.onetoone.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;

import com.oto.onetoone.model.Gender;
import com.oto.onetoone.model.User;
import com.oto.onetoone.model.UserProfile;
import com.oto.onetoone.repository.UserProfileRepository;
import com.oto.onetoone.repository.UserRepository;

public class UserService {

	
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private UserProfileRepository userProfileRepository;
	
	public void run (String... args) throws Exception{
		User user = new User();
		user.setName("Shivanya");
		user.setEmail("shivanya@gmail.com");
		
		UserProfile profile=new UserProfile();
		profile.setAddress("ZZZZZZZZZ");
		profile.setPhno("123456789");
		profile.setGender(Gender.Female);
		profile.setDob(LocalDate.of(1990/05/05, 0, 0));
		
		user.setUserprofile(profile);
		profile.setUser(user);
		
		userRepository.save(user);
	}


}
