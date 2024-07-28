package com.productservice.project1.DTO;
import com.productservice.project1.models.Category;

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
    @NonNull
    private Category category;
}