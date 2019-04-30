package com.hcl.ing.pet.app.service;

import java.util.List;

import com.hcl.pet.app.dto.MyPetsResponse;
import com.hcl.pet.app.dto.PetBuyRequest;
import com.hcl.pet.app.dto.PetBuyResponse;
import com.hcl.pet.app.dto.PetDto;
import com.hcl.pet.app.dto.PetRequest;
import com.hcl.pet.app.dto.PetResponse;

public interface PetService {

	public PetBuyResponse buyPet(PetBuyRequest request);
	
	public MyPetsResponse myPets(Long userId);
	
	public PetResponse createPet(PetRequest request);
	
	public List<PetDto> listPet();
}
