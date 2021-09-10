package com.tisya.productservice.service;


import com.tisya.productservice.model.Product;
import com.tisya.productservice.model.ProductCatalog;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductService {
    @RequestMapping("")
    public ProductCatalog getProductCatalog() {
        List<Product> products = Arrays.asList(
                new Product(1, "LED TV"),
                new Product(2, "Mobile Phone")
        );
        ProductCatalog productCatalog = new ProductCatalog();
        productCatalog.setProductList(products);
        return productCatalog;
    }
}
