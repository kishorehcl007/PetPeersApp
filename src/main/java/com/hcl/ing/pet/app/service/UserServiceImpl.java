package com.hcl.ing.pet.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.ing.pet.app.dto.UserDto;
import com.hcl.ing.pet.app.dto.UserResponse;
import com.hcl.ing.pet.app.entity.User;
import com.hcl.ing.pet.app.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public boolean createUser(UserDto userDto) {
		

		if (userDto.getConfrmPassword().equals(userDto.getPassword())) {
			User user = new User();
			user.setUserId(userDto.getId());
			user.setEmail(userDto.getEmailId());
			user.setPassword(userDto.getPassword());
		    user.setUsername(userDto.getUserName());
		    user.setAddress(userDto.getAddress());
		    user.setContactDetails(userDto.getContactDetails());

			userRepository.save(user);
			return true;

		} else {
			return false;
		}

	}
	
	
	@Override
	public UserResponse loginUser(String mailId, String password) {
		
		UserResponse response=new UserResponse();
		
		      List<User> users=userRepository.findAll();
		      
		         		      
		      for(User user:users) {
		    	  
		    	  if(user.getEmail().equals(mailId) && user.getPassword().equals(password)) {
		    		  response.setResponse("Login user successfully");	    		  
		    		  
		    	  }
		    	  else if(!user.getEmail().equals(mailId)) {
		    		  response.setResponse("Unregistered user please register ..!");
		    	  }
		    	  else {
		    		  response.setResponse("email or password did not match");
		    	  }	    	  
		    	  
		      }
			return response;
		      
		    
	}

	
	
	

}
