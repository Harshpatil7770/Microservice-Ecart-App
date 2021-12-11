package com.amzon.ecart.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amzon.ecart.model.Category;
@Repository
public interface CategoryDao extends JpaRepository<Category,Integer>{

}
