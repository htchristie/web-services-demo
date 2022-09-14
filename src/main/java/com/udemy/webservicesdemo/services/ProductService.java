package com.udemy.webservicesdemo.services;

import com.udemy.webservicesdemo.entities.Order;
import com.udemy.webservicesdemo.entities.Product;
import com.udemy.webservicesdemo.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll() {
        return repository.findAll();
    }

    public Product findById(Long id) {
        Optional<Product> obj = repository.findById(id);
        // A container object which may or may not contain a non-null value.
        // If a value is present, isPresent() will return true and get() will return the value.
        return obj.get();
    }
}
