package com.udemy.webservicesdemo.services;

import com.udemy.webservicesdemo.entities.User;
import com.udemy.webservicesdemo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(Long id) {
        Optional<User> obj = repository.findById(id);
        // A container object which may or may not contain a non-null value.
        // If a value is present, isPresent() will return true and get() will return the value.
        return obj.get();
    }

    public User insert(User obj) {
        return repository.save((obj));
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
