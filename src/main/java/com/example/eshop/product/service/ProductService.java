package com.example.eshop.product.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.eshop.product.model.Product;
import com.example.eshop.product.repository.ProductRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ProductService {

	private final ProductRepository productRepository;

	public List<Product> findAllProducts() {
		return productRepository.findAll();
	}

	public void createNewProduct(final Product product) {
		productRepository.save(product);
	}

	public Product getProductById(final long id) {
		return productRepository.findProductById(id);
	}

	public void updateProductById(final long id, final Product product) {
		final Product productById = productRepository.findProductById(id);
		productById.setName(product.getName());
		productById.setDescription(product.getDescription());
		productById.setPrice(product.getPrice());
		productRepository.save(productById);
	}

	public void deleteProductBy(final long id) {
		productRepository.deleteById(id);
	}

}
