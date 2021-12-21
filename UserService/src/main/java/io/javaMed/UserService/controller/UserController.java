package io.javaMed.UserService.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    @GetMapping("/{userName}")
    public String getUser(@PathVariable("userName") String userName )
    {
        return userName;
    }


}
