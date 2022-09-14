package com.udemy.webservicesdemo.repositories;

import com.udemy.webservicesdemo.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    // JpaRepository<EntityType, PrimaryKeyType>
}
