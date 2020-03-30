package com.worktech.app;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.worktech.app.domain.User;
import com.worktech.app.repository.UserRepository;
import com.worktech.app.services.UserDaoServices;

@Component
public class UserRepositoryServiceRunner implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(UserDaoServices.class);

	@Autowired
	private UserRepository repository;

	@Override
	public void run(String... args) throws Exception {
		User user = new User("jack", "php profile");
		repository.save(user);
		log.info("new user is created ::" + user);

		Optional<User> findById = repository.findById(1L);
		log.info("findBy new User ::" + user);

		List<User> findAll = repository.findAll();
		log.info("All retrived users " + findAll);

	}

}
