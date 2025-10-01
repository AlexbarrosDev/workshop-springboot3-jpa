package com.praticandoweb.webservice.resources;

import com.praticandoweb.webservice.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResources {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Alex", "Alex@gmail.com", "15997670178","198106");
        return ResponseEntity.ok().body(u);
    }
}
