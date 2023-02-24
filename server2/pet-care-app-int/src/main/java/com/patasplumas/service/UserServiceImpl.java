package com.patasplumas.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.patasplumas.model.User;
import com.patasplumas.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	
	@Autowired 
	private UserRepository userRepository;	
	
	@Override
	public ArrayList<User> getAllUser() {		
		return (ArrayList<User>) userRepository.findAll(); //returns all users from DB
	}

	@Override
	public Optional<User> getUserById(Integer id) {		
		return userRepository.findById(id);
	}

	@Override
	public User saveUser(User user) {		
		return userRepository.save(user);
	}

	@Override
	public boolean deleteUserById(Integer id) {
		try {
			Optional<User> user = getUserById(id);
			userRepository.delete(user.get());
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}
