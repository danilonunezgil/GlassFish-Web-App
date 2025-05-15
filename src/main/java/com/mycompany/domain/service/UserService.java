/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.domain.service;

import com.mycompany.domain.model.Role;
import com.mycompany.domain.model.User;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author danno
 */
public class UserService {
    private Map<String, User> users = new HashMap<>();
    
    public UserService(RoleService roleService){
        Role adminRole = roleService.getRoles().get("ADMIN");
        Role userRole = roleService.getRoles().get("USER");
        
        User user1 = new User("admin","admin123",adminRole);
        User user2 = new User("danno","danno123",adminRole);
        User user3 = new User("test","test123",userRole);
        
        users.put("admin", user1);
        users.put("danno", user2);
        users.put("test", user3);
    }
    
    public User getUserByUsername(String username){
        return this.users.get(username);
    }
    
    public boolean validateUser(String username, String password) {
        User user = users.get(username);
        return user != null && user.getPassword().equals(password);
    }
}
