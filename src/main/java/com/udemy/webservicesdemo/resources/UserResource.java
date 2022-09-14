package com.udemy.webservicesdemo.resources;

import com.udemy.webservicesdemo.entities.User;
import com.udemy.webservicesdemo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @Autowired
    private UserService service;

    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        List<User> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id) {
        //  the @PathVariable annotation can be used to handle template variables in the request URI mapping,
        //  and set them as method parameters.

        User user = service.findById(id);
        return ResponseEntity.ok().body(user);
    }
}
