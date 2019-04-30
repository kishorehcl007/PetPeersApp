package com.hcl.ing.pet.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.ing.pet.app.dto.UserDto;
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

}
