package com.fakeorder.foodorder.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.fakeorder.foodorder.model.User;
import com.fakeorder.foodorder.repository.UserRepository;
@Service
public class UserService {

	 @Autowired
	    private UserRepository repo;

	    @Autowired
	    private PasswordEncoder passwordEncoder;

	    public void save(User user){
	        user.setPassword(passwordEncoder.encode(user.getPassword()));
	        repo.save(user);
	    }
}
