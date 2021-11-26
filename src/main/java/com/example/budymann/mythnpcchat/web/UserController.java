package com.example.budymann.mythnpcchat.web;

import com.example.budymann.mythnpcchat.domain.model.Person;
import com.example.budymann.mythnpcchat.domain.wrappers.MessageTemplateWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//Add Friend, Remove Friend, Get User Profile, Get Friends

@RestController
public class UserController {

    @Autowired
    private MessageTemplateWrapper messageTemplateWrapper;

    @GetMapping("/search")
    @ResponseBody
    public Person searchUser(@RequestParam(value = "email") String email){
        return null;
    }




}
