package com.intern.car.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intern.car.service.userService;
import com.intern.car.model.users;

@RestController
public class carController {

    @Autowired
    userService UserService;

    @PostMapping("/userlogin")
    public boolean userLogin(@RequestParam String userAlias, @RequestParam String password){
        return UserService.getByName(userAlias,password);
    }

    @PostMapping("/users")
    public List<users> users(){
        return UserService.getallusers();
    }
    
}
