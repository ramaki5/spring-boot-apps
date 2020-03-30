package com.worktech.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.worktech.app.domain.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
