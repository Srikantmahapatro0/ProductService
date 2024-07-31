package com.productservice.project1.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired
;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.productservice.project1.DTO.FakeproductDTO;
import com.productservice.project1.DTO.catdto;
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
       ResponseEntity<FakeproductDTO> responseEntity = restTemplate.getForEntity(
                "https://fakestoreapi.com/products/" + id,
                FakeproductDTO.class);


                FakeproductDTO fakeproductDTO = responseEntity.getBody();
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

    @Override
    public void deletepProduct(Long id) {
        restTemplate.delete("https://fakestoreapi.com/products/"+id);
    }

    @Override
    public List<Product> getallproducts() {
        FakeproductDTO[] response=restTemplate.getForObject("https://fakestoreapi.com/products", FakeproductDTO[].class);
        List<Product> products = new ArrayList<>();
        for(FakeproductDTO fakeStoreProductDto: response) {
            products.add(fakeStoreProductDto.toProduct());
        }return products;
    }

    @Override
    public List<Category> getallCategory() {
        catdto[] response=restTemplate.getForObject("https://fakestoreapi.com/products/categories", catdto[].class);
        List<Category> products = new ArrayList<>();
        for(catdto Catdto: response) {
            products.add(Catdto.tocat());
        }return products;
    }

    @Override
    public Product getproductbycategory(String name) {
        FakeproductDTO fakeproductDTO=restTemplate.getForObject("https://fakestoreapi.com/products/category"+name,FakeproductDTO.class);
        Product product=new Product();
        product.setId(fakeproductDTO.getId());
        product.setName(fakeproductDTO.getName());
        product.setPrice(fakeproductDTO.getPrice());
        product.setDescription(fakeproductDTO.getDescription());
        product.setImageurl(fakeproductDTO.getImageurl());
        Category category=new Category();
        category.setName(name);
        product.setCategory(category);
        return product;
    }

    @Override
    public Product updateproduct(Long id, String name, String des, String img, double price) {
        FakeproductDTO fakeproductDTO=restTemplate.getForObject("https://fakestoreapi.com/products"+id,FakeproductDTO.class);
        Product product=new Product();
        product.setId(id);
        product.setName(name);
        product.setPrice(price);
        product.setDescription(des);
        product.setImageurl(img);
        return product;
    }

        
}

