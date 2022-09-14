package com.udemy.webservicesdemo.resources;

import com.udemy.webservicesdemo.entities.Product;
import com.udemy.webservicesdemo.services.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {

    private ProductService service;

    @GetMapping
    public ResponseEntity<List<Product>> findAll() {
        List<Product> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id) {
        //  the @PathVariable annotation can be used to handle template variables in the request URI mapping,
        //  and set them as method parameters.

        Product product = service.findById(id);
        return ResponseEntity.ok().body(product);
    }
}
