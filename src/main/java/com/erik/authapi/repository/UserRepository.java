package com.erik.authapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.erik.authapi.domain.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
