package com.restcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restcrud.model.Category;

@Repository
public interface CategoryRepository extends  JpaRepository<Category , Long>{

}
