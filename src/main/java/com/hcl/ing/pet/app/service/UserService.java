package com.hcl.ing.pet.app.service;

import com.hcl.ing.pet.app.dto.UserDto;
import com.hcl.ing.pet.app.dto.UserResponse;

public interface UserService {

	public boolean createUser(UserDto userDto);
	public UserResponse loginUser(String mailId,String name); 
}
