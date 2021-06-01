package com.smart_transformation.app_helloSign_springboot.services;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.smart_transformation.app_helloSign_springboot.shared.dto.UserDto;

public interface UserService extends UserDetailsService {

	
	UserDto createUser(UserDto userDto);
	
	UserDto getUser(String email);
}
