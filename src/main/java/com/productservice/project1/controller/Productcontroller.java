package com.productservice.project1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.productservice.project1.DTO.CreateproductDTO;
import com.productservice.project1.models.Product;
import com.productservice.project1.service.Productservice;


@RestController
public class Productcontroller {
    private final Productservice productservice;

    public Productcontroller(Productservice productservice) {
        this.productservice = productservice;
    }

    @PostMapping("/products")
    public Product Createproduct(@RequestBody CreateproductDTO newproduct) {
        return productservice.Createproduct(
                newproduct.getTitle(),
                newproduct.getDescription(),
                newproduct.getImage(),
                newproduct.getCategory(),
                newproduct.getPrice());
   }
   @RequestMapping("/hello")
   public String requestMethodName(@RequestParam String param) {
       return ("hello");
   }
   
    
   // @GetMapping("/products")
   // public List getMethodName(@RequestParam String param) {
    //    ArrayList <Integer>a=new ArrayList<Integer>();
    //    return a;
   // }
   @GetMapping("/products/{id}")
   public Product Getproductbyid(@PathVariable Long id) {
       return productservice.Getproductbyid(id);
   }
 
    public void deleteproduct() {

    }
    public void updateproduct(){

    }
    public void getproductbycategory(){

    }
    public void getallcategory(){

    }
}