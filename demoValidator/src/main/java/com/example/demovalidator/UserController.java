package com.example.demovalidator;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
@RestController
@RequestMapping("api/v1/users")
public class UserController {
    @PostMapping
    public Object createUser(@Valid @RequestBody User user){
        return user;
    }
}
