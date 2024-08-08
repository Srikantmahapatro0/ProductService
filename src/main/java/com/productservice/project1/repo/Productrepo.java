package com.productservice.project1.repo;

import java.util.List;

import org.jooq.Stringly.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.productservice.project1.models.Product;

public interface Productrepo extends JpaRepository<Product,Long> {

    Product save(Product entity);

    Product findByIdIs(Long id);

    List<Product> findAll();



}