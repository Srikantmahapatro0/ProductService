package com.productservice.project1.models;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product extends Basemodel{
    private String name;
    private String description;
    private double price;
    private String imageurl;
    private Category category;
}
