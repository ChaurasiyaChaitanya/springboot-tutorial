package com.springboot.springbootApp.services;

import java.util.List;
import com.springboot.springbootApp.payloads.PostDto;
import com.springboot.springbootApp.payloads.PostResponse;

public interface PostService {
	
	PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);
	
	PostResponse getAllPosts(Integer pageNumber, Integer pageSize, String sortBy, String sortDir);
	
	PostDto getPostById(Integer postId);
	
	PostDto updatePost(PostDto postDto, Integer postId);
	
	void deletePost(Integer postId);
	
	List<PostDto> getPostsByCategory(Integer categoryId);
	
	List<PostDto> getPostsByUser(Integer userId);
	
	List<PostDto> searchPosts(String keyword);
}
