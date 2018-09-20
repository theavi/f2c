/**
 * 
 */
package com.f2c.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.f2c.dao.UserDao;
import com.f2c.dto.UserDto;
import com.f2c.model.User;
import com.f2c.service.UserService;

/**
 * @author Avinash
 *
 */
@Service
public class UserServiceImpl implements UserService {

	/**
	 * spring will inject userDao in to UserImpl class
	 */
	@Autowired
	UserDao userDao;

	public UserDto create(UserDto userDto) {
		User user = new DozerBeanMapper().map(userDto, User.class);
		return new DozerBeanMapper().map(userDao.create(user), UserDto.class);
	}

	/**
	 * update the user
	 */
	public UserDto update(UserDto userDto) {
		User isExist = userDao.findById(userDto.getId());
		if (isExist != null) {
			isExist = userDao.update(new DozerBeanMapper().map(userDto, User.class));
		}
		return new DozerBeanMapper().map(isExist, UserDto.class);
	}

	public UserDto delete(UserDto user) {
		// TODO Auto-generated method stub
		return null;
	}

	public UserDto getAllUser() {

		return null;
	}

	public List<UserDto> getUserByName(String name) {
		List<UserDto> userlist = new ArrayList<UserDto>();
		List<User> users = userDao.getByName(name);
		if (!users.isEmpty()) {
			for (User user : users) {
				UserDto dto = new DozerBeanMapper().map(user, UserDto.class);
				userlist.add(dto);
			}
		}
		return userlist;
	}

	public UserDto findById(Integer id) {
		return new DozerBeanMapper().map(userDao.findById(id), UserDto.class);
	}

}
