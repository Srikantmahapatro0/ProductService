package com.productservice.project1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import lombok.NonNull;
import com.productservice.project1.DTO.FakeproductDTO;
import com.productservice.project1.models.Category;
import com.productservice.project1.models.Product;
@Service
public class Fakeproduct implements Productservice {
    @Autowired
    private RestTemplate restTemplate;
    @NonNull
    @Override
    public Product Getproductbyid(Long id){
        FakeproductDTO fakeproductDTO=restTemplate.getForObject("https://fakestoreapi.com/products/"+id, FakeproductDTO.class);
        Product product=new Product();
        product.setId(id);
        product.setName(fakeproductDTO.getName());
        product.setPrice(fakeproductDTO.getPrice());
        product.setCategory(fakeproductDTO.getCategory());
        product.setDescription(fakeproductDTO.getDescription());
        product.setImageurl(fakeproductDTO.getImageurl());
        Category category=new Category();
        category.setId(fakeproductDTO.getCategory().getId());
        category.setName(fakeproductDTO.getCategory().getName());
        product.setCategory(category);
        return product;
    }
}
