package com.amzon.ecart.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.amzon.ecart.model.Brand;
@Repository
public interface  BrandDao extends JpaRepository<Brand,Integer>{


}
