package com.springboot.springbootApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.springbootApp.entities.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
