package com.productservice.project1.controller;

import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.productservice.project1.DTO.SearchDTO;
import com.productservice.project1.models.Product;
import com.productservice.project1.service.Searchservice;


    @RestController
    public class Searchcontroller {
    private Searchservice searchService;

    public Searchcontroller(Searchservice searchService) {
        this.searchService = searchService;
    }

    @PostMapping("/search")
    public Page<Product> search(@RequestBody SearchDTO searchRequestDto) {
        return searchService.search(searchRequestDto.getQuery(),
                searchRequestDto.getPageNumber(),
                searchRequestDto.getPageSize());
    }
}

