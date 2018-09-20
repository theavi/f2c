package com.f2c.daoImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AbstractDaoImpl {

	/**
	 * SessionFactory get injected from configuration
	 */
	@Autowired
	private SessionFactory sessionFactory;

	/**
	 * 
	 * @return hibernate Session object
	 */
	public Session getSession() {
		return sessionFactory.openSession();
	}
}
