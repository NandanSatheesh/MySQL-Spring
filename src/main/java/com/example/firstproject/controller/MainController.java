package com.example.firstproject.controller;


import com.example.firstproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.firstproject.models.User ;

import java.util.Iterator;

@Controller
@RequestMapping("/demo")
public class MainController {


    @Autowired
    private UserRepository userRepository ;



    @GetMapping(path = "/add")
    public @ResponseBody String addUser(@RequestParam String name , @RequestParam String email){


        User newUser = new User();
        newUser.setEmail(email);
        newUser.setName(name );
        userRepository.save(newUser);
        return "data saved" ;
    }

    @GetMapping(path = "/show")
    public @ResponseBody Iterable<User> getAllUser() {


        return userRepository.findAll() ;
    }


}
