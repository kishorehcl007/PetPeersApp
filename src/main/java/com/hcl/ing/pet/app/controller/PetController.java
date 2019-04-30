package com.hcl.ing.pet.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.ing.pet.app.service.PetServiceImpl;
import com.hcl.pet.app.dto.MyPetsResponse;
import com.hcl.pet.app.dto.PetBuyRequest;
import com.hcl.pet.app.dto.PetBuyResponse;
import com.hcl.pet.app.dto.PetDto;
import com.hcl.pet.app.dto.PetRequest;
import com.hcl.pet.app.dto.PetResponse;

@RestController
@RequestMapping("pet")
public class PetController {

	
	@Autowired
	private PetServiceImpl petServiceImpl;
	
	@GetMapping("/findmypets")
	public MyPetsResponse findMyPets(@RequestParam("userId") Long userId) {
		return petServiceImpl.myPets(userId);
	}
	
	@PostMapping("/buypet")
	public PetBuyResponse buyPet(@RequestBody PetBuyRequest request) {
		return petServiceImpl.buyPet(request);
	}
	
	@PostMapping("/addpet")
	public PetResponse createPet(@RequestBody PetRequest request) {
		return petServiceImpl.createPet(request);
	}
	
	@GetMapping("/petlist")
	public List<PetDto> listPet()
	{
		List<PetDto> petListResult=petServiceImpl.listPet();
		
		return petListResult;
		
	}
}
