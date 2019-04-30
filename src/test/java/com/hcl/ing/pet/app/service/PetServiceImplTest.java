package com.hcl.ing.pet.app.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.hcl.ing.pet.app.entity.Pet;
import com.hcl.ing.pet.app.repository.PetRepository;
import com.hcl.pet.app.dto.MyPetsResponse;
import com.hcl.pet.app.dto.PetBuyRequest;
import com.hcl.pet.app.dto.PetBuyResponse;
import com.hcl.pet.app.dto.PetDto;
import com.hcl.pet.app.dto.PetRequest;
import com.hcl.pet.app.dto.PetResponse;

@RunWith(MockitoJUnitRunner.class)
public class PetServiceImplTest {
	
	
	@InjectMocks
	private PetServiceImpl petServiceImpl;
	
	@Mock
	private PetRepository petRepository;

	@Test
	public void testCreatePet() {
		PetRequest petRequest=new PetRequest();
		petRequest.setAge(2);
		petRequest.setPetName("dog");
		petRequest.setPlace("ctr");
		
		Pet pet=new Pet();
		pet.setAge(2);
		pet.setPetName("dog");
		pet.setPlace("ctr");
		pet.setAvailability('T');
		
		//when(petRepository.save(pet)).thenReturn(pet);
		PetResponse petRes = petServiceImpl.createPet(petRequest);
		assertEquals("Pet added successfully..!", petRes.getMessage());
		
	}
	
	
	
	
}
