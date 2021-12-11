package com.amzon.ecart.service;

import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amzon.ecart.dao.BrandDao;
import com.amzon.ecart.model.Brand;
import com.amzon.ecart.util.GlobalResource;

@Service
public class BrandServiceImpl implements BrandService{

	private Logger logger=GlobalResource.getInstance(BrandServiceImpl.class);
	
	@Autowired
	BrandDao brandDao;
	
	
	
	@Override
	public List<Brand> fetchAllBrand() {
		String methodName="fetchAllBrand()";
		logger.info(methodName+"called()");
		return brandDao.findAll();
	}


}
