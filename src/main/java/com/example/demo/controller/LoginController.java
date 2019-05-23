package com.example.demo.controller;

import com.example.demo.dao.UserDao;
import com.example.demo.model.PO.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LoginController {
    @Autowired
    private UserDao userDao;
    @PostMapping("/register")
    public  String login( User user){
       userDao.addUser(user);
        System.out.println(user);
        return "ok";

    }
   @GetMapping("/select")
    public User select1( String username){

        return   userDao.selectUserByname(username);

    }

}