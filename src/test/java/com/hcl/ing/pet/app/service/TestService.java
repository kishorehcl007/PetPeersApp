package com.hcl.ing.pet.app.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.hcl.ing.pet.app.entity.Pet;
import com.hcl.ing.pet.app.repository.PetRepository;
import com.hcl.pet.app.dto.PetDto;

@RunWith(MockitoJUnitRunner.class)
public class TestService {

	@InjectMocks
	PetServiceImpl petService;
	
	@Mock
	PetRepository petRepository;
	@Test
	public void testPetList()
	{
			List<Pet> petList=new ArrayList<Pet>();
			Pet pet=new Pet();
			pet.setAge(2);
			pet.setAvailability('T');
			pet.setPetName("dog");
			petList.add(pet);
			List<PetDto> petDtoList=new ArrayList<PetDto>();
			PetDto petDto=new PetDto();
			pet.setAge(2);
			pet.setAvailability('T');
			pet.setPetName("dog");
			petDtoList.add(petDto);
			when(petRepository.findAll()).thenReturn(petList);
			List<PetDto> result=petService.listPet();
			assertEquals(result.size(), petDtoList.size());
	}
}
