package com.productservice.project1.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateproductDTO {
    private String title;
    private String image;
    private String description;
    private String category;
    private double price;
}
