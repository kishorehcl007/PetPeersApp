package com.hcl.ing.pet.app.service;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.hcl.ing.pet.app.entity.User;
import com.hcl.ing.pet.app.repository.UserRepository;

import dto.UserResponse;



@RunWith(MockitoJUnitRunner.class)
public class UserLoginAppTest {
	
	@Mock
	UserRepository userRepository;
	
	@InjectMocks
	UserServiceImpl serviceImpl;
	
	@Test
	public void testLoginUser() {
		
		List<User> users=new ArrayList<User>();
		
		User user=new User();
		
		user.setEmail("suma@gmail.com");
		user.setPassword("karna");
		users.add(user);
		
		Mockito.when(userRepository.findAll()).thenReturn(users);
		
		UserResponse response=serviceImpl.loginUser("suma@gmail.com","karna");
		
		
	   Assert.assertEquals("Login user successfully", response.getResponse());
	
		
	
	}
	

}
