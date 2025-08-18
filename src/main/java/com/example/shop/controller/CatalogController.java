package com.example.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.shop.feign.ProductInterface;
import com.example.shop.model.Product;



@RestController
@RequestMapping("/catalog")
public class CatalogController {
    
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private WebClient.Builder webClientBuilder;

    @Autowired
    private ProductInterface productInterface;

    @GetMapping("/{prodId}")
    public Product getMethodName(@PathVariable int prodId) {

        // List<Retailer> catalog = Arrays.asList(
        //     new Retailer(1,"Apple",1),
        //     new Retailer(2,"Samsung",2)
        // );

        // Product product = restTemplate.getForObject("http://localhost:8080/products/" + prodId, Product.class);

        // Product product = webClientBuilder.build()
        //                 .get()
        //                 .uri("http://localhost:8080/products/" + prodId)
        //                 .retrieve()
        //                 .bodyToMono(Product.class)
        //                 .block();

        Product product = productInterface.getProductById(prodId);

        return product;
    }
    
    
}
