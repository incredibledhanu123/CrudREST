package com.restcrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.restcrud.model.Category;
import com.restcrud.repository.CategoryRepository;

 

@Service
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
    public Page<Category> getAllCategories(Pageable pageable) {
        return categoryRepository.findAll(pageable);
    }

    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }

    public Category getCategoryById(Long di) {
        return categoryRepository.findById(di).orElse(null);
    }

    public Category updateCategory(Long di, Category category) {
    	category.setDi(di);
        return  categoryRepository.save(category);
    }

    public void deleteCategory(Long di) {
    	categoryRepository.deleteById(di);
    }
	
}
