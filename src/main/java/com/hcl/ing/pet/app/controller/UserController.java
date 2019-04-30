package com.hcl.ing.pet.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.ing.pet.app.service.UserService;

@RestController
public class UserController {
	
	
	@Autowired
	UserService userService;
	
	
}
