package com.amzon.ecart.resource;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amzon.ecart.model.Brand;
import com.amzon.ecart.model.Category;
import com.amzon.ecart.model.Product;
import com.amzon.ecart.service.BrandService;
import com.amzon.ecart.service.CategoryService;
import com.amzon.ecart.service.ProductService;
import com.amzon.ecart.util.GlobalResource;

@RestController
@RequestMapping("/api/search")
@RefreshScope
@CrossOrigin
public class SearchController {

	private Logger logger=GlobalResource.getInstance(SearchController.class);
	
	@Autowired
	CategoryService categoryService;
	
	@Autowired
	BrandService brandService;
	
	@Autowired
	ProductService productService;
	
	@GetMapping("/list/categories")
	List<Category> fetchAllCategories(){
		String methodName="fetchAllCategories()";
		logger.info(methodName+"called()");
		return categoryService.fetchAllCategories();
	}
	
	@GetMapping("/list/brands")
	public List<Brand> fetchAllBrand() {
		String methodName="fetchAllBrand()";
		logger.info(methodName+"called()");
		return brandService.fetchAllBrand();
}
	@GetMapping("/list/products")
	public List<Product> fetchALLProducts() {
		String methodName="fetchALLProducts()";
		logger.info(methodName+"called()");
		return productService.fetchALLProducts();
}
	@GetMapping("/filter/products/{productId}")
	public Optional<Product> findProductById(@PathVariable int productId) {
		String methodName="findProductById()";
		logger.info(methodName+"called()");
		return productService.findProductById(productId);
	}
	
	@GetMapping("/filter/products/byname/{productName}")
	public Product filterProductByName(@PathVariable String productName) {
		String methodName="filterProductByName()";
		logger.info(methodName+"called()");
		return productService.filterProductByName(productName);
	}
	
	@GetMapping("/filter/products/{minPrice}/{maxPrice}")
	public List<Product> filterProductByPriceRange(@PathVariable double minPrice,@PathVariable double maxPrice) {
		String methodName="filterProductByPriceRange()";
		logger.info(methodName+"called()");
		return productService.filterProductByPriceRange(minPrice, maxPrice);
	}
	

	@GetMapping("/filter/products/byprice/{minPrice}")
	public List<Product> filterProductAboveThePriceRange(@PathVariable double minPrice) {
		String methodName="filterProductByPriceRange()";
		logger.info(methodName+"called()");
		return productService.filterProductAboveThePriceRange(minPrice);
	}
	
	@GetMapping("/filter/products/bybrandname/{brandName}")
	public List<Product> filterProductByBrandName(@PathVariable String brandName) {
		String methodName="filterProductByBrandName()";
		logger.info(methodName+"called()");
		return productService.filterProductByBrandName(brandName);
	}
	
	@GetMapping("/filter/product/categoryname/{categoryName}")
	public List<Product> filterProductByCategoryName(@PathVariable String categoryName) {
		String methodName="filterProductByBrandName()";
		logger.info(methodName+"called()");
		return productService.filterProductByCategoryName(categoryName);
	}
	
}
