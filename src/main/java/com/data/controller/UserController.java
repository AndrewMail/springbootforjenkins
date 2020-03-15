package com.data.controller;

import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;

@RequestMapping("/user")
@RestController
public class UserController {

    @GetMapping
    public String index(){
        return new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()) + ",ok";
    }

    @PostMapping
    public String post(@RequestParam String name){
        return "name:" + name;
    }

}
