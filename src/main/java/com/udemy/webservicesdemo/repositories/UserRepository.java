package com.udemy.webservicesdemo.repositories;

import com.udemy.webservicesdemo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    // JpaRepository<EntityType, PrimaryKeyType>


}
