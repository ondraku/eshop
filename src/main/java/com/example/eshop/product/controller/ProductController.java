package com.example.eshop.product.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.eshop.product.model.Product;
import com.example.eshop.product.service.ProductService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class ProductController {

	private final ProductService productService;

	@GetMapping("/products")
	public List<Product> getAllProducts() {
		return productService.findAllProducts();
	}

	@PostMapping("/products")
	public ResponseEntity<String> createNewProduct(@RequestBody Product product) {
		productService.createNewProduct(product);
		return ResponseEntity.status(HttpStatus.CREATED).body("New product added.");
	}

	@GetMapping("/products/{id}")
	public Product getProduct(@PathVariable long id) {
		return productService.getProductById(id);
	}

	@PutMapping("/products/{id}")
	public ResponseEntity<String> updateProduct(@PathVariable long id, @RequestBody Product product) {
		productService.updateProductById(id, product);
		return ResponseEntity.status(HttpStatus.OK).body("Product was updated.");
	}

	@DeleteMapping("/products/{id}")
	public ResponseEntity<String> deleteProduct(@PathVariable long id) {
		productService.deleteProductBy(id);
		return ResponseEntity.status(HttpStatus.OK).body("Product was deleted.");
	}

}
