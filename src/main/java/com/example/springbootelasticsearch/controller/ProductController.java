package com.example.springbootelasticsearch.controller;

import com.example.springbootelasticsearch.model.Product;
import com.example.springbootelasticsearch.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/product")
public class ProductController {

    @Autowired
    private ProductServiceImpl productService;

    @GetMapping("/findAll")
    public Iterable<Product> findByProductName() {
        return productService.findAll();
    }

    @PostMapping("/createProducts")
    public void createProductIndex(@RequestBody List<Product> products) {
        productService.createProducts(products);
    }

    @PostMapping("/createProduct")
    public void createProduct(@RequestBody Product product) {
        productService.createProduct(product);
    }
}
