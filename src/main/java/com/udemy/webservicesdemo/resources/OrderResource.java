package com.udemy.webservicesdemo.resources;

import com.udemy.webservicesdemo.entities.Order;
import com.udemy.webservicesdemo.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {

    @Autowired
    private OrderService service;

    @GetMapping
    public ResponseEntity<List<Order>> findAll() {
        List<Order> orderList = service.findAll();
        return ResponseEntity.ok().body(orderList);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Order> findById(@PathVariable Long id) {
        //  the @PathVariable annotation can be used to handle template variables in the request URI mapping,
        //  and set them as method parameters.

        Order order = service.findById(id);
        return ResponseEntity.ok().body(order);
    }
}
