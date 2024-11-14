package com.intern.car.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intern.car.dao.userDao;
import com.intern.car.model.users;

@Service
public class userService {

    @Autowired
    userDao user;

    public boolean getByName (String Name, String password){
        users u = user.findByUserName(Name);

        if (u.getPassword().equals(password)){
            return true;
        }
        return false;
    }

    public List<users> getallusers() {

        return user.findAll();
        // TODO Auto-generated method stub
        
    }


    
}
