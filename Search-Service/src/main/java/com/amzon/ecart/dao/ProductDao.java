package com.amzon.ecart.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.amzon.ecart.model.Product;

@Repository
public interface ProductDao extends JpaRepository<Product,Integer>{

	@Query(value="select * from products p inner join brands b on p.brand_brand_id=b.brand_id inner join categories c on p.category_category_id=c.category_id where p.product_name=?",nativeQuery =true)
	Product findProductByName(String productName);

	@Query(value="select * from products p inner join brands b on p.brand_brand_id=b.brand_id inner join categories c on p.category_category_id=c.category_id where p.product_price>=? and p.product_price<=?",nativeQuery=true)
	List<Product> filterProductByPriceRange(double minPrice, double maxPrice);

	@Query(value="select * from products p inner join brands b on p.brand_brand_id=b.brand_id inner join categories c on p.category_category_id=c.category_id where p.product_price>=?",nativeQuery=true)
	List<Product> filterProductAboverThePriceRange(double minPrice);

	@Query(value="select * from products p inner join brands b on p.brand_brand_id=b.brand_id inner join categories c on p.category_category_id=c.category_id where b.brand_name=?",nativeQuery=true)
	List<Product> filterProductByBrandName(String brandName);

	@Query(value="select * from products p inner join brands b on p.brand_brand_id=b.brand_id inner join categories c on p.category_category_id=c.category_id where c.category_name=?",nativeQuery=true)
	List<Product> filterProductByCategoryName(String categoryName);

}
