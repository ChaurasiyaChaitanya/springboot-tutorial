package com.springboot.springbootApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.springbootApp.entities.Comment;

public interface CommentRepo extends JpaRepository<Comment, Integer> {

}
