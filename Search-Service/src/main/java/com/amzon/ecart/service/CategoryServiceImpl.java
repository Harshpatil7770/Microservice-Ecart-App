package com.amzon.ecart.service;

import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amzon.ecart.dao.CategoryDao;
import com.amzon.ecart.model.Category;
import com.amzon.ecart.util.GlobalResource;

@Service
public class CategoryServiceImpl implements CategoryService{

	
	private Logger logger=GlobalResource.getInstance(CategoryServiceImpl.class);
	
	@Autowired
	CategoryDao categoryDao;
	
	
	
	@Override
	public List<Category> fetchAllCategories() {
		String methodName="fetchAllCategories()";
		logger.info(methodName+"called()");
		return categoryDao.findAll();
	}

}
