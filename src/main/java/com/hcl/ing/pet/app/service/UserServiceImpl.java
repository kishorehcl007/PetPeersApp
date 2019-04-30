package com.hcl.ing.pet.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.ing.pet.app.entity.User;
import com.hcl.ing.pet.app.repository.UserRepository;

import dto.UserResponse;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;

	@Override
	public UserResponse loginUser(String mailId, String password) {
		
		UserResponse response=new UserResponse();
		
		      List<User> users=userRepository.findAll();
		      
		         		      
		      for(User user:users) {
		    	  
		    	  if(user.getEmail().equals(mailId) && user.getPassword().equals(password)) {
		    		  response.setResponse("Login user successfully");	    		  
		    		  
		    	  }
		    	  else if(!user.getEmail().equals(mailId)) {
		    		  response.setResponse("You are not the login user. Please go and register");
		    	  }
		    	  else {
		    		  response.setResponse("email or password did not match");
		    	  }	    	  
		    	  
		      }
			return response;
		      
		    
	}
	
	
}
