package com.example.shop.service;

import com.example.shop.model.Product;
import com.example.shop.repositery.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo productRepo;

//    List<Product> products = new ArrayList<>(Arrays.asList(
//            new Product(101,"Iphone",50000),
//            new Product(102,"Smart Tv",70000),
//            new Product(103,"Shura Mic",20000)
//    ));

    public List<Product> getProducts() {
        return productRepo.findAll();
    }

    public Product getProductById(int prodId) {
        return productRepo.findById(prodId).orElse(new Product());
    }

    public void addProduct(Product product) {
        productRepo.save(product);
    }

    public void updateProduct(Product product) {
        productRepo.save(product);
    }


    public void deleteProduct(int prodId) {
        productRepo.deleteById(prodId);
    }
}
