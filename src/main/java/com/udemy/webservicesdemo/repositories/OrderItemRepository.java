package com.udemy.webservicesdemo.repositories;

import com.udemy.webservicesdemo.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
    // JpaRepository<EntityType, PrimaryKeyType>
}
