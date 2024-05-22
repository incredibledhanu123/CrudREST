package com.restcrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.restcrud.model.Product;
import com.restcrud.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public Page<Product> getAllProducts(Pageable pageable) {
		return productRepository.findAll(pageable);
	}

	public Product createProduct(Product product) {
		return productRepository.save(product);
	}

	public Product getProductById(Long di) {
		return productRepository.findById(di).orElse(null);
	}

	public Product updateProduct(Long di, Product product) {
		product.setDi(di);
		return productRepository.save(product);
	}

	public void deleteProduct(Long di) {
		productRepository.deleteById(di);
	}

}
