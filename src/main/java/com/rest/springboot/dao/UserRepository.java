package com.rest.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.springboot.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
