package com.productservice.project1.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
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
    @ManyToOne(cascade = (CascadeType.PERSIST))
    private Category category;
}
