package com.udemy.webservicesdemo.services;

import com.udemy.webservicesdemo.entities.User;
import com.udemy.webservicesdemo.repositories.UserRepository;
import com.udemy.webservicesdemo.services.exceptions.DatabaseException;
import com.udemy.webservicesdemo.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
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
        return obj.orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public User insert(User obj) {
        return repository.save((obj));
    }

    public void delete(Long id) {

        try {
            repository.deleteById(id);
        }
        catch (EmptyResultDataAccessException e) {
            throw new ResourceNotFoundException(id);
        }
        catch (DataIntegrityViolationException e) {
            throw new DatabaseException(e.getMessage());
        }
    }

    public User update(Long id, User obj) {
        User entity = repository.getOne(id);
        updateEntity(entity, obj);
        return repository.save(entity);
    }

    private void updateEntity(User entity, User obj) {
        entity.setName(obj.getName());
        entity.setEmail(obj.getEmail());
        entity.setPhone(obj.getPhone());
    }
}
