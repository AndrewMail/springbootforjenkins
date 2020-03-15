package com.data.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RequestMapping("/user")
@RestController
public class UserController {

    @GetMapping
    public String index(){
        return new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()) + ",ok";
    }
}
