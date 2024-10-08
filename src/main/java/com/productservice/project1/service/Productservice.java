package com.productservice.project1.service;

import java.util.List;

import com.productservice.project1.models.Category;
import com.productservice.project1.models.Product;

public interface Productservice {
    public Product Getproductbyid(Long id);
    public Product Createproduct(String title, String description,
    String image, String category, double price);
    public void deleteProduct(Long id);
    public List<Product>getallproducts();
    public List<Category>getallCategory();
    public Product getproductbycategory(String name);
    public Product updateproduct(Long id,String name,String des,String img,double price);
}
