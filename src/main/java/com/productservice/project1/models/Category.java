package com.productservice.project1.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Category extends Basemodel {
    private String name;
     @OneToMany(mappedBy = "category", cascade = {CascadeType.REMOVE})
    @JsonIgnore
    private List<Product> products;
}
