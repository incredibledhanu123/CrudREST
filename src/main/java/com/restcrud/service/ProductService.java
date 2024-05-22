package com.restcrud.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.restcrud.model.Product;

public interface ProductService {
	Page<Product> getAllProducts(Pageable pageable);

	Product createProduct(Product product);

	Product getProductById(Long di);

	Product updateProduct(Long di, Product product);

	void deleteProduct(Long di);
}
