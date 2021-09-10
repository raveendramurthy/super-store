package com.tisya.productservice.service;


import com.tisya.productservice.model.Product;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductService {
    @RequestMapping("/{productId}")
    public Product getProductInfo(@PathVariable("productId") int productId ) {
        return new Product(productId, "LED TV");
    }
}
