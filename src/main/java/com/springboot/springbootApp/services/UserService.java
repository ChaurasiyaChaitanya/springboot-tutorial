package com.springboot.springbootApp.services;

import java.util.List;

import com.springboot.springbootApp.payloads.UserDto;

public interface UserService {
	
	UserDto createUser(UserDto userDto);
	UserDto getUserById(Integer userId);
	List<UserDto> getAllUsers();
	UserDto updateUser(UserDto userDto, Integer userId);
	void deleteUser(Integer userId);
}
