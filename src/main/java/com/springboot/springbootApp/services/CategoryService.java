package com.springboot.springbootApp.services;

import java.util.List;

import com.springboot.springbootApp.payloads.CategoryDto;

public interface CategoryService {

	CategoryDto createCategory(CategoryDto categoryDto);
	
	List<CategoryDto> getAllCategories();
	
	CategoryDto getCategoryById(Integer categoryId);
	
	CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId);
	
	void deleteCategory(Integer categoryId);
}
