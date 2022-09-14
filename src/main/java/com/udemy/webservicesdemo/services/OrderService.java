package com.udemy.webservicesdemo.services;

import com.udemy.webservicesdemo.entities.Order;
import com.udemy.webservicesdemo.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll() {
        return repository.findAll();
    }

    public Order findById(Long id) {
        Optional<Order> obj = repository.findById(id);
        // A container object which may or may not contain a non-null value.
        // If a value is present, isPresent() will return true and get() will return the value.
        return obj.get();
    }
}
