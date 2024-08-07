package com.productservice.project1.service;

import java.util.List;

import com.productservice.project1.models.Category;
import com.productservice.project1.models.Product;

public class Dbproduct implements Productservice {

    @Override
    public Product Getproductbyid(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Getproductbyid'");
    }

    @Override
    public Product Createproduct(String title, String description, String image, String category, double price) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Createproduct'");
    }

    @Override
    public void deletepProduct(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deletepProduct'");
    }

    @Override
    public List<Product> getallproducts() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getallproducts'");
    }

    @Override
    public List<Category> getallCategory() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getallCategory'");
    }

    @Override
    public Product getproductbycategory(String name) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getproductbycategory'");
    }

    @Override
    public Product updateproduct(Long id, String name, String des, String img, double price) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateproduct'");
    }
    
}
