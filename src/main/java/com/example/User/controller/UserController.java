package com.example.User.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user/create")
    public String createUser() {
        return "successfully created User";
    }
    @GetMapping("/user/delete")
    public String deleteUser() {
        return "deleted User";
    }
    @GetMapping("/user/update")
    public String updateUser() {
        return "updated User";
    }
    @GetMapping("/user/detail")
    public String detailUser() {
        return "detailed User";
    }

}