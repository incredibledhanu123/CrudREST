package com.restcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restcrud.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
