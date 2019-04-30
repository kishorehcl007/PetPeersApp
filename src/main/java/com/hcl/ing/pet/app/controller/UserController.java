package com.hcl.ing.pet.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.ing.pet.app.dto.UserDto;
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
			return "User not created";

	}

}
