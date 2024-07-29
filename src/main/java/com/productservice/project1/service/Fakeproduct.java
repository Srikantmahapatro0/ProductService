package com.productservice.project1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.productservice.project1.DTO.FakeproductDTO;
import com.productservice.project1.models.Category;
import com.productservice.project1.models.Product;

import lombok.NonNull;
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
        product.setDescription(fakeproductDTO.getDescription());
        product.setImageurl(fakeproductDTO.getImageurl());
        Category category=new Category();
        category.setName(fakeproductDTO.getCategory());
        product.setCategory(category);
        return product;
    }
    
    @Override
    public Product Createproduct(String title, String description, String image, String category, double price){
        FakeproductDTO newfake = new FakeproductDTO();
        newfake.setCategory(category);
        newfake.setDescription(description);
        newfake.setPrice(price);
        newfake.setImageurl(image);
        newfake.setName(title);

        FakeproductDTO response = restTemplate
                .postForObject("https://fakestoreapi.com/products",
                        newfake,
                        FakeproductDTO.class);


        return response.toProduct();
    }
}
