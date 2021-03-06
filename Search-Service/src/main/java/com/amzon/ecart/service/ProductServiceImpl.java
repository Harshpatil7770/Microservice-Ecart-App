package com.amzon.ecart.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amzon.ecart.dao.ProductDao;
import com.amzon.ecart.model.Product;
import com.amzon.ecart.util.GlobalResource;

@Service
public class ProductServiceImpl implements ProductService{

	private Logger logger=GlobalResource.getInstance(ProductServiceImpl.class);
	@Autowired
	ProductDao productDao;
	
	
	@Override
	public List<Product> fetchALLProducts() {
		String methodName="fetchALLProducts()";
		logger.info(methodName+"called()");
		return productDao.findAll();
	}

    @Override
	public Optional<Product> findProductById(int productId) {
		String methodName="findProductById()";
		logger.info(methodName+"called()");
		return productDao.findById(productId);
	}

    @Override
	public Product filterProductByName(String productName) {
		String methodName="filterProductByName()";
		logger.info(methodName+"called()");
		return productDao.findProductByName(productName);
	}

	@Override
	public List<Product> filterProductByPriceRange(double minPrice, double maxPrice) {
		String methodName="filterProductByPriceRange()";
		logger.info(methodName+"called()");
		return productDao.filterProductByPriceRange(minPrice,maxPrice);
	}

	@Override
	public List<Product> filterProductAboveThePriceRange(double minPrice) {
		String methodName="filterProductByPriceRange()";
		logger.info(methodName+"called()");
		return productDao.filterProductAboverThePriceRange(minPrice);
	}

	@Override
	public List<Product> filterProductByBrandName(String brandName) {
		String methodName="filterProductByBrandName()";
		logger.info(methodName+"called()");
		return productDao.filterProductByBrandName(brandName);
	}

	@Override
	public List<Product> filterProductByCategoryName(String categoryName) {
		String methodName="filterProductByBrandName()";
		logger.info(methodName+"called()");
		return productDao.filterProductByCategoryName(categoryName);
	}
    
    

}
