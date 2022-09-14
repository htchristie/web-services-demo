package com.udemy.webservicesdemo.services;

import com.udemy.webservicesdemo.entities.Category;
import com.udemy.webservicesdemo.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Category findById(Long id) {
        Optional<Category> obj = repository.findById(id);
        // A container object which may or may not contain a non-null value.
        // If a value is present, isPresent() will return true and get() will return the value.
        return obj.get();
    }
}
