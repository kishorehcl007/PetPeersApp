package com.hcl.ing.pet.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.ing.pet.app.entity.Pet;
import com.hcl.ing.pet.app.repository.PetRepository;
import com.hcl.pet.app.dto.MyPetsResponse;
import com.hcl.pet.app.dto.PetBuyRequest;
import com.hcl.pet.app.dto.PetBuyResponse;
import com.hcl.pet.app.dto.PetDto;
import com.hcl.pet.app.dto.PetRequest;
import com.hcl.pet.app.dto.PetResponse;

@Service
public class PetServiceImpl implements PetService {
	
	@Autowired
	private PetRepository petRepository;

	@Override
	public PetBuyResponse buyPet(PetBuyRequest request) {
		PetBuyResponse response=null;
		try {
			response=new PetBuyResponse();
			Pet pet = petRepository.findByPetId(request.getPetId());
			pet.setUserId(request.getUserId());
			Pet petresponse = petRepository.save(pet);
			if(petresponse!=null) {
				response.setMessage("Pet added to cart successfully ...!");
			}
			
			
		} catch (Exception e) {
			
		}
		return response;
	}
	
	@Override
	public MyPetsResponse myPets(Long userId) {
		MyPetsResponse response=null;
		try {
			response=new MyPetsResponse();
			List<Pet> petList = petRepository.findByUserId(userId);
			List<PetDto> petDtoList=new ArrayList<>();
			petList.stream().forEach(pet ->{
				PetDto dto=new PetDto();
				dto.setAge(pet.getAge());
				dto.setPetId(pet.getPetId());
				dto.setPetName(pet.getPetName());
				dto.setPlace(pet.getPlace());
				dto.setAvailability(pet.getAvailability());
				dto.setUserId(pet.getUserId());
				petDtoList.add(dto);
			});
			response.setPetList(petDtoList);
			
		} catch (Exception e) {
		}
		
		return response;
	}
	
	@Override
	public PetResponse createPet(PetRequest request) {
		PetResponse response=null;
		try {
			response=new PetResponse();
			Pet pet=new Pet();
			pet.setAge(request.getAge());
			pet.setAvailability('T');
			pet.setPetName(request.getPetName());
			pet.setPlace(request.getPlace());
			pet.setUserId(0L);
			Pet save = petRepository.save(pet);
			response.setMessage("Pet added successfully..!");
		} catch (Exception e) {
		}
		
		return response;
	}
	
	public List<PetDto> listPet() {
		List<PetDto> list=new ArrayList<>();
		
		List<Pet> petListResult=petRepository.findAll();
		for(Pet pet:petListResult)
		{
			PetDto petDto=new PetDto();
			petDto.setPetId(pet.getPetId());
			petDto.setPetName(pet.getPetName());
			petDto.setUserId(pet.getUserId());
			petDto.setAge(pet.getAge());
			petDto.setPlace(pet.getPlace());
			petDto.setAvailability(pet.getAvailability());
			list.add(petDto);
		}
		return list;
		
	}
	
	
	
}
