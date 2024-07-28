package com.productservice.project1.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Product {
    private long id;
    private String name;
    private String description;
    private double price;
    private String imageurl;
    private Category category;
}
