package io.javaMed.userservice.controller;


import io.javaMed.userservice.model.User;
import io.javaMed.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;



    @PostMapping("/")
    public User saveUser(@RequestBody User user)
    {
        return userService.saveUser(user);

    }

    @GetMapping("/{id}")
    public User findUserById(@PathVariable("id") Long userId)
    {
        return userService.findByUserId(userId);

    }

}
