package com.hcl.ing.pet.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.ing.pet.app.dto.UserDto;
import com.hcl.ing.pet.app.dto.UserResponse;
import com.hcl.ing.pet.app.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;

	@RequestMapping(value = "/createUser", method = RequestMethod.POST)
	public String createUser(@RequestBody UserDto userDto) {

		boolean value = userService.createUser(userDto);
		if (value)
			return "User created sucessfully";
		else
			return "Password and confirm password doesn't match..!";

	}
	
	
	
	@GetMapping("/user/login")
	public ResponseEntity<String> loginUser(@RequestParam String mailId,@RequestParam String password){
		
		 UserResponse response=userService.loginUser(mailId, password);
		return new ResponseEntity<String>(response.getResponse(),HttpStatus.CREATED);
	}
	
	
	
}
