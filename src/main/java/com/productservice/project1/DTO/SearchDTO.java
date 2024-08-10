package com.productservice.project1.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
    
public class SearchDTO {
    private String query;
    private int pageNumber;
    private int pageSize;
    private String sortValue;
}

