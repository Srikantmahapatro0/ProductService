package com.productservice.project1.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.productservice.project1.models.Category;

public interface Categoryrepo extends JpaRepository<Category,Long> {
    Category findByTitle(String title);

    Category save(Category category);
}