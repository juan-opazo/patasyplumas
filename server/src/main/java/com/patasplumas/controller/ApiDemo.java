package com.patasplumas.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.patasplumas.model.User;
import com.patasplumas.service.UserService;

@RestController
@RequestMapping("api")
public class ApiDemo {
	
	
	@Autowired //Inject the service 
	UserService userService; //To inject a service we need to inject the interface, not the implementation
	
	@GetMapping("/saludar")
	public String saludar() {
		return "Hi my friend, here's your API xD";
	}
	
	@GetMapping("/all")
	public ArrayList<User> getAllUsers(){
		return userService.getAllUser();
	}
	
	@GetMapping("/find/{id}")
	public Optional<User> getUserById(@PathVariable("id") int id){
		return userService.getUserById(id);
	}
	
	@PostMapping("/save")
	public User saveUser(@RequestBody User user) {
		return userService.saveUser(user);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleUserById(@PathVariable("id") int id) {
		if(userService.deleteUserById(id)) {
			return "User deletedd";
		}
		else {
			return "User is not deleted";
		}
	}
}
