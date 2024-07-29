package com.productservice.project1.service;

import com.productservice.project1.models.Product;

public interface Productservice {
    public Product Getproductbyid(Long id);
    public Product Createproduct(String title, String description,
    String image, String category, double price);
}
