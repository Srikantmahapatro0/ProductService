package com.productservice.project1.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.productservice.project1.models.Category;
import com.productservice.project1.models.Product;

public interface Categoryrepo extends JpaRepository<Category,Long> {

    
    Category findByTitle(String title);
    
   List<Category> findAll();
    
    Category save(Category category);
    Product findByName(String name);
}