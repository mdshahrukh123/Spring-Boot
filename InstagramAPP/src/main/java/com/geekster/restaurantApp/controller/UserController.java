package com.geekster.restaurantApp.controller;

import com.geekster.restaurantApp.dto.SignInInput;
import com.geekster.restaurantApp.dto.SignInOutput;
import com.geekster.restaurantApp.dto.SignUpInput;
import com.geekster.restaurantApp.dto.SignUpOutput;
import com.geekster.restaurantApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/signup")
    public SignUpOutput signup(@RequestBody SignUpInput signUpDto)
    {
        return userService.signUp(signUpDto);
    }

    //sign in

    @PostMapping("/signin")
    public SignInOutput signup(@RequestBody SignInInput signInDto)
    {
        return userService.signIn(signInDto);
    }



    }
