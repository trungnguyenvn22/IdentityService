package com.Ox21.IdentityService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Ox21.IdentityService.model.User;



public interface UserRepository extends JpaRepository<User, String>{

  
    boolean findByUsername(String username);
    boolean findByEmail(String email);
    
}
