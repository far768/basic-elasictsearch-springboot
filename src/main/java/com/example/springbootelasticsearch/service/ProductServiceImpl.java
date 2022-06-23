package com.example.springbootelasticsearch.service;

import com.example.springbootelasticsearch.model.Product;
import com.example.springbootelasticsearch.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl {

    @Autowired
    private ProductRepository productRepository;

    public void createProducts(final List<Product> products) {
        productRepository.saveAll(products);
    }

    public void createProduct(final Product product) {
        productRepository.save(product);
    }

    public Iterable<Product> findAll() {
        return productRepository.findAll();
    }

    public void deleteAll() {
        productRepository.deleteAll();
    }
}
