package com.Ox21.IdentityService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Ox21.IdentityService.dto.request.UserCreationRequest;
import com.Ox21.IdentityService.service.UserService;



@Controller
public class UserController {

    @Autowired
    private UserService userService;
    
    @GetMapping("path")
    public ResponseEntity CheckUserExist(@RequestParam String inputText) {
        return null;
    }


    @PostMapping("path")
    public ResponseEntity signIn(UserCreationRequest userCreationRequest){
     
        return null;
    }
    
}
