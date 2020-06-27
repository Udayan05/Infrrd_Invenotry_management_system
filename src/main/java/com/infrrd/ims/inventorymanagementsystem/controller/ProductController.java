package com.infrrd.ims.inventorymanagementsystem.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infrrd.ims.inventorymanagementsystem.controller.exception.UserNotFoundException;
import com.infrrd.ims.inventorymanagementsystem.dao.ProductDaoService;
import com.infrrd.ims.inventorymanagementsystem.entity.Product;

@RestController
public class ProductController {

	@Autowired
	private ProductDaoService service;
	
	/**
	 * api to retrieve all products
	 */
	@GetMapping("/products")
	public List<Product> retrieveAllProducts() {
		return service.viewAll();
	}

	/**
	 * api to retrieve product by id
	 */
	@GetMapping("/products/{id}")
	public Product retrieveProduct(@PathVariable int id) throws UserNotFoundException {
		Product product = service.productDetails(id);
		if (product == null)
			throw new UserNotFoundException("id-" + id);

		return product;
	}

	/**
	 * api to create a product
	 */
	@PostMapping("/products")
	public void createProduct(@RequestBody Product product) {
		service.create(product);
	}

	/**
	 * api to delete a product
	 */
	@DeleteMapping("/products/{id}")
	public String removeProduct(@PathVariable int id) {
		Product product = service.deleteById(id);

		if (product == null)
			throw new UserNotFoundException("id-" + id);
		
		return product.getProductId() + " is removed at " + new Date();
	}
}
