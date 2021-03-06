package com.amzon.ecart.service;

import java.util.List;
import java.util.Optional;

import com.amzon.ecart.model.Brand;
import com.amzon.ecart.model.Product;

public interface ProductService {

	List<Product> fetchALLProducts();
	
	Optional<Product> findProductById(int productId);
	
	Product filterProductByName(String productName);
	
	List<Product> filterProductByPriceRange(double minPrice,double maxPrice);
	
	List<Product> filterProductAboveThePriceRange(double minPrice);
	
	List<Product> filterProductByBrandName(String brandName);
	
	List<Product> filterProductByCategoryName(String categoryName);
	
}
