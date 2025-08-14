package com.example.shop.service;

import com.example.shop.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(101,"Iphone",50000),
            new Product(102,"Smart Tv",70000),
            new Product(103,"Shura Mic",20000)
    ));

    public List<Product> getProducts() {
        return products;
    }

    public Product getProductById(int prodId) {
        return products.stream()
                .filter(p -> p.getProdId() == prodId)
                .findFirst().get();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void updateProduct(Product product) {
        int index = 0;
        for(int i =0 ; i<products.size(); i++) {
            if(products.get(i).getProdId() == product.getProdId()) {
                index = i;
            }
        }

        products.set(index, product);
    }


    public void deleteProduct(int prodId) {
        int index = 0;
        for(int i =0 ; i<products.size(); i++) {
            if(products.get(i).getProdId() == prodId) {
                index = i;
            }
        }
        products.remove(index);
    }
}
