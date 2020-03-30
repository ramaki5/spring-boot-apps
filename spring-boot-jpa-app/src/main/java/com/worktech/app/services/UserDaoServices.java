package com.worktech.app.services;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class UserDaoServices {

	@PersistenceContext
	private EntityManager entityManager;

	public long insert(com.worktech.app.domain.User user) {
		entityManager.persist(user);
		return user.getId();
	}

}
