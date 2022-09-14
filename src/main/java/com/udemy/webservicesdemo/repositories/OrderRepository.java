package com.udemy.webservicesdemo.repositories;

import com.udemy.webservicesdemo.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    // JpaRepository<EntityType, PrimaryKeyType>
}
