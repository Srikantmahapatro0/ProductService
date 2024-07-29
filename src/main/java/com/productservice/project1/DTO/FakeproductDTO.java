package com.productservice.project1.DTO;
import com.productservice.project1.models.Category;
import com.productservice.project1.models.Product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FakeproductDTO {
    private long id;
    @NonNull
    private String name;
    @NonNull
    private String description;
    
    private double price;
    @NonNull
    private String imageurl;
    
    private String category;
    
     public Product toProduct() {
        Product product = new Product();
        product.setId(getId());
        product.setName(getName());
        product.setDescription(getDescription());
        product.setImageurl(getImageurl());

        Category category = new Category();
        category.setName(getCategory());
        product.setCategory(category);

        return product;
    }
}