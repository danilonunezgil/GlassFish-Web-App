/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.domain.service;

import com.mycompany.application.UserUseCase;
import com.mycompany.domain.model.User;

/**
 *
 * @author danno
 */
public class UserUseCaseImpl implements UserUseCase {
    
    private final UserService userService;

    public UserUseCaseImpl(UserService userService) {
        this.userService = userService;
    }
    
    
    @Override
    public User login(String username, String password) {
        if (userService.validateUser(username, password)) {
            return userService.getUserByUsername(username);
        }
        return null;
    }
    
}
