package com.productservice.project1.controller;

import java.util.List;

import com.productservice.project1.service.Dbproduct;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.productservice.project1.DTO.CreateproductDTO;
import com.productservice.project1.models.Category;
import com.productservice.project1.models.Product;
import com.productservice.project1.service.Productservice;



@RestController
public class Productcontroller {
    private final Productservice productservice;

    public Productcontroller(@Qualifier("thirdparty") Productservice productservice) {
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
    @GetMapping("/error")
    public String error(){
        String s="Problem in my code";
        return s;
    }
   @GetMapping("/products/{id}")
   public Product Getproductbyid(@PathVariable("id") Long id) {
       return productservice.Getproductbyid(id);
    }
    @DeleteMapping("/products/{id}")
    public void deleteproduct(@PathVariable("id") Long id) {
    productservice.deleteProduct(id);
    }
    @PutMapping("/products/{id}")
    public Product updateproduct(@PathVariable("id") Long id,String name,String des,String img,double price){
           return null;
    }
    @GetMapping("/products/category/{String name}")
    public Product getproductbycategory(@PathVariable("String name") String name){
        return productservice.getproductbycategory(name);

    }@GetMapping("/products")
    public List<Product> getallproducts(@RequestParam String param) {
        return productservice.getallproducts();
    }
    @GetMapping("/products/categories")
    public List<Category> getallcategory(){
    return productservice.getallCategory();
    }
}