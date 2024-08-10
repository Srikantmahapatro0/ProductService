package com.productservice.project1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.productservice.project1.models.Category;
import com.productservice.project1.models.Product;
import com.productservice.project1.repo.Categoryrepo;
import com.productservice.project1.repo.Productrepo;
@Service("dbquery")
public class Dbproduct implements Productservice {
    private static final String String = null;
    private Productrepo Productrepo;
    private Categoryrepo categoryrepo;

    public Dbproduct(Productrepo Productrepo,
                              Categoryrepo categoryrepo) {
        this.Productrepo = Productrepo;
        this.categoryrepo = categoryrepo;
    }

    @Override
    public Product Getproductbyid(Long id) {
        return Productrepo.findByIdIs(id);
    }

    @Override
    public Product Createproduct(String title, String description, String image, String category, double price) {
        Product product = new Product();
        product.setName(title);
        product.setDescription(description);
        product.setPrice(price);
        product.setImageurl(image);

        Category categoryFromDatabase = categoryrepo.findByTitle(category);
        if(categoryFromDatabase == null) {
            Category newCategory = new Category();
            newCategory.setName(category);
            categoryFromDatabase = newCategory;
        }
        product.setCategory(categoryFromDatabase);

        List<Product> productsTemp = categoryFromDatabase.getProducts();

        return Productrepo.save(product);

    }

    @Override
    public void deleteProduct(Long id) {
        return ;
    }

    @Override
    public List<Product> getallproducts() {
        return Productrepo.findAll();
    }

    @Override
    public List<Category> getallCategory() {
        return null;
    }

    @Override
    public Product getproductbycategory(String name) {
        return Productrepo.findByCategory(name);
    }

    @Override
    public Product updateproduct(Long id, String name, String des, String img, double price) {
        return null;}

    
}
