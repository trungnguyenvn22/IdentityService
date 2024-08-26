package com.Ox21.IdentityService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ox21.IdentityService.dto.request.UserCreationRequest;
import com.Ox21.IdentityService.dto.request.UserTextLoginRequest;
import com.Ox21.IdentityService.model.User;
import com.Ox21.IdentityService.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    boolean checkUsernameExist(String username){
        
        if (userRepository.findByUsername(username)) return true;
        
        return false;
    }

    boolean checkEmailExist(String email){

       if(userRepository.findByEmail(email)) return true;
       return false;
    }

    public boolean CheckAccountExist(UserTextLoginRequest userTextLoginRequest){

        if(userTextLoginRequest.getTypeInput() == 0){
            return checkUsernameExist(userTextLoginRequest.getInputLogin());
        } 
        else if(userTextLoginRequest.getTypeInput() == 1){
            return checkEmailExist(userTextLoginRequest.getInputLogin());
        }
        return false;

    }

    public User creationUserRquest(UserCreationRequest userCreationRequest){
        User user =  new User();
        user.setPassword(userCreationRequest.getPassword());
        if(userCreationRequest.getUsername() != null){
            user.setUsername(userCreationRequest.getUsername());
        }
        userRepository.save(user);      
        return user;
    }
}
