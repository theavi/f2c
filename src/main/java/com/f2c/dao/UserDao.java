package com.f2c.dao;

import java.util.List;

import com.f2c.model.User;

public interface UserDao {

	/**
	 * 
	 * @param user
	 * @return
	 */
	User create(User user);

	/**
	 * 
	 * @param user
	 * @return
	 */
	User update(User user);

	/**
	 * 
	 * @param user
	 * @return
	 */
	User delete(User user);

	/**
	 * 
	 * @param user
	 * @return
	 */
	User getAllUser(User user);

	/**
	 * 
	 * @param name
	 * @return
	 */
	List<User> getByName(String name);

	/**
	 * 
	 * @param id
	 * @return
	 */
	User findById(Integer id);

	/**
	 * 
	 * @param id
	 * @return
	 */
	User update(Integer id);

}
