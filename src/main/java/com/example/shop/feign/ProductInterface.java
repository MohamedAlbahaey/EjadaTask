package com.example.shop.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.shop.model.Product;

@FeignClient(name = "localhost")
public interface ProductInterface {

    @GetMapping("/products/{prodId}")
    public Product getProductById(@PathVariable int prodId);

}
