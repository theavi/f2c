package com.f2c.daoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.f2c.dao.UserDao;
import com.f2c.model.User;

@Repository
public class UserDaoImpl extends AbstractDaoImpl implements UserDao {

	/**
	 * create new user return user object
	 */
	public User create(User user) {
		Session session = getSession();
		Transaction transaction = session.beginTransaction();
		Integer id = (Integer) session.save(user);
		transaction.commit();
		session.close();
		return id != null ? user : null;

	}

	/**
	 * update user
	 */
	public User update(User user) {
		Session session = getSession();
		session.update(user);
		session.beginTransaction().commit();
		session.close();
		return user;
	}

	public User delete(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	public User getAllUser(User user) {

		return null;
	}

	public List<User> getByName(String name) {
		Session session = getSession();
		Criteria criteria = session.createCriteria(User.class);
		@SuppressWarnings("unchecked")
		List<User> list = criteria.add(Restrictions.eq("userName", name)).list();
		return (!list.isEmpty() ? list : null);
	}

	public User findById(Integer id) {
		Session session = getSession();
		Criteria criteria = session.createCriteria(User.class);
		criteria.add(Restrictions.eq("id", id));
		List<User> users = criteria.list();
		return users.isEmpty() != true ? users.get(0) : null;
	}

	public User update(Integer id) {
		Session session = getSession();
		Transaction transaction = session.beginTransaction();
		Criteria criteria = session.createCriteria(User.class);
		criteria.add(Restrictions.eq("id", id));
		List<User> users = criteria.list();
		User u = users.get(0);
		User t = null;
		try {
			t = (User) u.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (users.get(0) != null) {
			t.setUserName("Avinash");
			u.setUserName("Dhananjay");
			transaction.commit();
		}
		session.close();
		return users.get(0);
	}

}
