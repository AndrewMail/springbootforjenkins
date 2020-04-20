package com.data.controller;

import com.data.bean.User;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;

@RequestMapping("/user")
@RestController
public class UserController {

    @GetMapping
    public String index(){
        return new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()) + ",ok123";
    }

    @GetMapping("/queryuser/{id}")
    public User queryUser(@PathVariable("id") Long id){
        return new User(id,"Jack","男",23);
    }

    @GetMapping("/queryusername/{id}")
    public String queryUserName(@PathVariable("id") Long id){
        return "id:"+id+",name:Jack,okhaha12343434543534534";
    }

    @GetMapping("/queryusername2/{id}")
    public String queryUserName2(@PathVariable("id") Long id){
        return "id:"+id+",name:Jack,okhaha2223";
    }

    @GetMapping("/queryusername3/{id}")
    public String queryUserName3(@PathVariable("id") Long id){
        return "id:"+id+",name:Jack,okhaha3333";
    }

    @PostMapping
    public String post(@RequestParam String name){
        return "name:" + name;
    }

}
