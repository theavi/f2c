package com.f2c.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.f2c.dto.UserDto;

@RestController
public class HomeController {

	@RequestMapping(value = "/userhhh", method = RequestMethod.GET)
	public ResponseEntity<List<UserDto>> getAllUser() {
		System.out.println("I GOT CALL");
		List<UserDto> userDtos = new ArrayList<UserDto>();
		UserDto user1 = new UserDto();
		user1.setUserName("Avinash");
		UserDto user2 = new UserDto();
		user2.setUserName("prameshwar");

		UserDto user3 = new UserDto();
		user3.setUserName("amol");
		userDtos.add(user1);
		userDtos.add(user2);
		userDtos.add(user3);
		return new ResponseEntity<List<UserDto>>(userDtos, HttpStatus.OK);
	}
}
