package io.javaMed.userservice.controller;


import io.javaMed.userservice.model.User;
import io.javaMed.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;


}
