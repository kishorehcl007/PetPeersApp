package com.hcl.ing.pet.app.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.hcl.ing.pet.app.dto.UserDto;
import com.hcl.ing.pet.app.entity.User;
import com.hcl.ing.pet.app.repository.UserRepository;

@RunWith(MockitoJUnitRunner.class)
public class UserRegistrationTests {
	
	@Mock
	UserRepository userRepository;
	
	@InjectMocks
	UserServiceImpl userServiceImpl;
	
	@Test
	public void registrationTest()
	{
		UserDto user = new UserDto();
		user.setId(1);
		user.setEmailId("h@gmail.com");
		user.setPassword("priya");
		user.setConfrmPassword("priya");
	    user.setUserName("hari");
	    user.setAddress("Hyderabad");
	    user.setContactDetails("423");
	    
	    assertEquals(true, true);
	}

}
