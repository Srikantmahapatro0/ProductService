package com.productservice.project1.service;

import java.util.List;

import com.productservice.project1.models.Category;
import com.productservice.project1.models.Product;

public interface Productservice {
    public Product Getproductbyid(Long id);
    public Product Createproduct(String title, String description,
    String image, String category, double price);
    public void deletepProduct(Long id);
    public List<Product>getallproducts();
    public List<Category>getallCategory();
}
