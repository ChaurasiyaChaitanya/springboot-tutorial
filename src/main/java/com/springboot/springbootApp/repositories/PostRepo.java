package com.springboot.springbootApp.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.springbootApp.entities.Category;
import com.springboot.springbootApp.entities.Post;
import com.springboot.springbootApp.entities.User;

public interface PostRepo extends JpaRepository<Post, Integer> {
	
	List<Post> findByUser(User user);
	
	List<Post> findByCategory(Category category);

}
