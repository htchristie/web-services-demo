package com.udemy.webservicesdemo.repositories;

import com.udemy.webservicesdemo.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    // JpaRepository<EntityType, PrimaryKeyType>
}
