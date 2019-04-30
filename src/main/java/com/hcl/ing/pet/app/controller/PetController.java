package com.hcl.ing.pet.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.ing.pet.app.service.PetServiceImpl;

@RestController
@RequestMapping("pet")
public class PetController {

	
	@Autowired
	private PetServiceImpl petServiceImpl;
	
	
	
	
	
	
}
