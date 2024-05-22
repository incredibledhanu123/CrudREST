package com.restcrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.restcrud.model.Category;
import com.restcrud.model.Product;
import com.restcrud.service.CategoryService;
import com.restcrud.service.ProductService;

 
@RestController
@RequestMapping("/api")
public class RESTController {
	
		private static final int DEFAULT_PAGE_SIZE = 10;

	 @Autowired
	 private CategoryService categoryService;
	 
	 @Autowired
	 private ProductService productService;
	 	
	 //Category related API
	 	@GetMapping("/categories")// GET all categories
	 	public Page<Category> showAll(@RequestParam(defaultValue = "0") int page) {
	        Pageable pageable = PageRequest.of(page, DEFAULT_PAGE_SIZE);
	        return categoryService.getAllCategories(pageable);
	    }
	
		@PostMapping("/categories")//Create Category
		public String createCategory(@RequestBody Category category) {
			categoryService.createCategory(category);
			return "Category Data saved!!";
		} 
		
		@GetMapping("/categories/{di}") // GET One Category by Id
		public Category showOneCategory(@PathVariable Long di) {
		    return categoryService.getCategoryById(di);
		}
	 
		@PutMapping("/categories/{di}")//Update Category By Id
		public String updateCategory(@PathVariable("di")long di,@RequestBody Category category) {
			Category updatedCategory = categoryService.updateCategory(di, category);
	        if (updatedCategory != null) {
	            return "Category updated successfully!";
	        } else {
	            return "Category not found!";
	        }
		}
		
		@DeleteMapping("/categories/{di}")//Delete Category By Id
		public String deleteCategory(@PathVariable("di") long di ) {
			categoryService.deleteCategory(di);
			return "Category Data Deleted!!";
		}
	//Category related API ends
		
	//Product related API
		@GetMapping("/products")// GET all products
		public Page<Product> showAllProducts(@RequestParam(defaultValue = "0") int page) {
			Pageable pageable = PageRequest.of(page, DEFAULT_PAGE_SIZE);
			return productService.getAllProducts(pageable);	
		}
		@PostMapping("/products")//Create Product
		public String createProduct(@RequestBody Product product) {
			productService.createProduct(product);
			return "Product Data saved!!";
		} 
		
		@GetMapping("/products/{di}") // GET One Product by Id
		public Product showOneProduct(@PathVariable Long di) {
		    return productService.getProductById(di);
		}
	 
		@PutMapping("/products/{di}")//Update Product By Id
		public String updateProduct(@PathVariable("di")long di,@RequestBody Product product) {
			Product updatedProduct =  productService.updateProduct(di, product);
	        if (updatedProduct != null) {
	            return "Product updated successfully!";
	        } else {
	            return "Product not found!";
	        }
		}
		
		@DeleteMapping("/products/{di}")//Delete Product By Id
		public String deleteProduct(@PathVariable("di") long di ) {
			productService.deleteProduct(di);
			return "Product Data Deleted!!";
		}
	//Product related API ends
}
