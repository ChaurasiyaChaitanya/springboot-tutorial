package com.springboot.springbootApp.services;

import java.util.List;
import com.springboot.springbootApp.payloads.PostDto;

public interface PostService {
	
	PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);
	
	List<PostDto> getAllPosts();
	
	PostDto getPostById(Integer postId);
	
	PostDto updatePost(PostDto postDto, Integer postId);
	
	void deletePost(Integer postId);
	
	List<PostDto> getPostsByCategory(Integer categoryId);
	
	List<PostDto> getPostsByUser(Integer userId);

}
