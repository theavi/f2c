package com.f2c.service;

import java.util.List;

import com.f2c.dto.UserDto;

public interface UserService {

	/**
	 * 
	 * @param user
	 * @return
	 */
	UserDto create(UserDto user);

	/**
	 * 
	 * @param user
	 * @return
	 */
	UserDto update(UserDto user);

	/**
	 * 
	 * @param user
	 * @return
	 */
	UserDto delete(UserDto user);

	/**
	 * 
	 * @param user
	 * @return
	 */
	UserDto getAllUser();

	/**
	 * 
	 * @param name
	 * @return
	 */
	List<UserDto> getUserByName(String name);

	/**
	 * 
	 * @param id
	 * @return
	 */
	UserDto findById(Integer id);
}
