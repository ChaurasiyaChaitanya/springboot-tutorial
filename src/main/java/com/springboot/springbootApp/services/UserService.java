package com.springboot.springbootApp.services;

import java.util.List;

import com.springboot.springbootApp.payloads.UserDto;

public interface UserService {
	
	UserDto createUser(UserDto userDto);
	
	List<UserDto> getAllUsers();
	
	UserDto getUserById(Integer userId);
	
	UserDto updateUser(UserDto userDto, Integer userId);
	
	void deleteUser(Integer userId);
}
