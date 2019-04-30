package com.hcl.ing.pet.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.ing.pet.app.service.UserService;

import dto.UserResponse;

@RestController
public class UserController {
	
	
	@Autowired
	UserService userService;
	
	
	@GetMapping("/user/login")
	public ResponseEntity<String> loginUser(@RequestParam String mailId,@RequestParam String password){
		
		 UserResponse response=userService.loginUser(mailId, password);
		return new ResponseEntity<String>(response.getResponse(),HttpStatus.CREATED);
	}
	
	
}
