package com.worktech.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.worktech.app.domain.User;
import com.worktech.app.services.UserDaoServices;

@Component
public class UserDaoServiceRunner implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(UserDaoServices.class);

	@Autowired
	private UserDaoServices service;

	@Override
	public void run(String... args) throws Exception {
		User user = new User("ramakrishna", "java profile");
		long insert = service.insert(user);
		log.info("new user is created ::" + user);

	}

}
