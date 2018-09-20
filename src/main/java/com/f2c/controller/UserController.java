package com.f2c.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.f2c.dto.UserDto;
import com.f2c.service.UserService;

/**
 * 
 * @author Avinash
 *
 */
@Controller
public class UserController {
	@Autowired
	UserService userService;

	/**
	 * 
	 * @param user
	 * @return create new user
	 */
	@RequestMapping(value = "/user", method = RequestMethod.POST)
	@ResponseBody
	public UserDto create(@RequestBody UserDto user) {
		return userService.create(user);
	}

	/**
	 * 
	 * @param name
	 * @return list of user who is having same name
	 */
	@RequestMapping(value = "/user/byName/{name}", method = RequestMethod.GET)
	@ResponseBody
	public List<UserDto> findByName(@PathVariable("name") String name) {
		return userService.getUserByName(name);

	}

	/**
	 * pass user id
	 * 
	 * @return unique user
	 */
	@RequestMapping(value = "/user/byId/{id}", method = RequestMethod.GET)
	@ResponseBody
	public UserDto findById(@PathVariable("id") Integer id) {
		return userService.findById(id);

	}

	/**
	 * 
	 * @param id
	 * @param name
	 * @param password
	 * @return update user detail and return updated user
	 */
	@RequestMapping(value = "/user/update/{id}", method = RequestMethod.PUT)
	@ResponseBody
	public UserDto update(@PathVariable("id") Integer id, @RequestParam("name") String name,
			@RequestParam("password") String password) {
		UserDto dto = new UserDto();
		dto.setId(id);
		dto.setUserName(name);
		dto.setPassword(password);
		return userService.update(dto);

	}
}
