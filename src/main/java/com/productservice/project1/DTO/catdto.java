package com.productservice.project1.DTO;

import com.productservice.project1.models.Category;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class catdto {
    private Long id;
    private String name;

public Category tocat(){
        Category category = new Category();
        category.setName(getName());
        category.setId(getId());

        return category;
    }
}
