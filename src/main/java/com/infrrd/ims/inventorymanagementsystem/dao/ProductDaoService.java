package com.infrrd.ims.inventorymanagementsystem.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

import com.infrrd.ims.inventorymanagementsystem.entity.Product;

@Component
public class ProductDaoService {

	private static List<Product> products = new ArrayList<>();

	private static int productCount = 4;

	static {
		products.add(new Product(1, "CD", 506.90, 550.00, 3.0, "electronics", new Date()));
		products.add(new Product(2, "Mouse", 421.23, 500.00, 1.2, "electronics", new Date()));
		products.add(new Product(3, "Shoe", 899, 940, 5.0, "clothes", new Date()));
		products.add(new Product(4, "Brush", 234, 250.00, 1.0, "appliances", new Date()));
	}

	public List<Product> viewAll() {
		return products;
	}

	public Product create(Product product) {
		if (product.getProductId() == null) {
			product.setProductId(++productCount);
		}
		product.setCreateDate(new Date());
		products.add(product);
		return product;
	}
	
	public Product productDetails(int id) {
		for(Product product : products) {
			if(product.getProductId() == id)
				return product;
		}
		return null;
	}
	
	public Product deleteById(int id) {
		Iterator<Product> itr = products.iterator();
		while(itr.hasNext()) {
			Product product = itr.next();
			if(product.getProductId() == id) {
				itr.remove();
				return product;
			}
		}
		return null;
	}
}
