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
	

	@Test
	public void testBuyPet() {
		PetBuyRequest request=new PetBuyRequest();
		request.setPetId(2L);
		request.setUserId(1L);
		
		Pet pet=new Pet();
		pet.setPetId(2L);
		pet.setUserId(1L);
		
		Mockito.when(petRepository.findByPetId(2L)).thenReturn(pet);
		Mockito.when(petRepository.save(pet)).thenReturn(pet);
		
		PetBuyResponse buyPet = petServiceImpl.buyPet(request);
		assertEquals("Pet purchased to your cart successfully ...!", buyPet.getMessage());
		
		
	}
	
	@Test
	public void testMyPets() {
		Long userId=2L;
		
		MyPetsResponse response=new MyPetsResponse();
		List<Pet> list=new ArrayList<>();
		Pet dto=new Pet();
		dto.setPetId(1L);
		dto.setUserId(userId);
		
		Pet dto1=new Pet();
		dto1.setPetId(3L);
		dto1.setUserId(userId);
		list.add(dto1);
		list.add(dto);
		
		
		List<PetDto> dtoList=new ArrayList<>();
		PetDto petDto1=new PetDto();
		petDto1.setPetId(1L);
		petDto1.setUserId(userId);
		
		PetDto petDto2=new PetDto();
		petDto2.setPetId(3L);
		petDto2.setUserId(userId);
		dtoList.add(petDto2);
		dtoList.add(petDto1);
		
		Mockito.when(petRepository.findByUserId(2L)).thenReturn(list);
		
		MyPetsResponse myPets = petServiceImpl.myPets(userId);
		assertEquals(2L, myPets.getPetList().size());
		
	}
	
	
	
}
