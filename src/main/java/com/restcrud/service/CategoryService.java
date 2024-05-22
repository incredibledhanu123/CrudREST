package com.restcrud.service;


import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.restcrud.model.Category;



public interface CategoryService {
	
	 Page<Category> getAllCategories(Pageable pageable);

	 Category createCategory(Category category);

	 Category getCategoryById(Long di);

	 Category updateCategory(Long di, Category category);

	 void deleteCategory(Long di);
	
}
