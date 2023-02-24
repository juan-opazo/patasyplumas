package com.patasplumas.service;

import java.util.ArrayList;
import java.util.Optional;

import com.patasplumas.model.User;

public interface UserService {
	ArrayList<User> getAllUser();
	Optional<User> getUserById(Integer id);
	User saveUser(User user);
	boolean deleteUserById(Integer id);
}
