package com.smart_transformation.app_helloSign_springboot.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.smart_transformation.app_helloSign_springboot.request.UserRequest;
import com.smart_transformation.app_helloSign_springboot.responce.UserResponce;
import com.smart_transformation.app_helloSign_springboot.services.UserService;
import com.smart_transformation.app_helloSign_springboot.shared.dto.UserDto;



@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping
	public String getUser() {
		return "get User was called !!";
	}
	
	@PostMapping
	public UserResponce createUser(@RequestBody UserRequest userRequest) {
		UserDto userDto = new UserDto();
		BeanUtils.copyProperties(userRequest, userDto);
		
		UserDto createUser = userService.createUser(userDto);
		UserResponce userResponce  = new UserResponce();
		
		BeanUtils.copyProperties(createUser, userResponce);
		
		return userResponce;
		
		
		
	}
	
	@PutMapping
	public String updateUser() {
		return "update User was called !!";
	}
	
	
	@DeleteMapping
	public String deleteUser() {
		return "delete User was called !!";
	}

}
