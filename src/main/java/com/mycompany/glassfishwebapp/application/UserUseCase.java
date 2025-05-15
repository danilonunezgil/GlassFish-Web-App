/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.glassfishwebapp.application;

import com.mycompany.glassfishwebapp.domain.model.User;

/**
 *
 * @author danno
 */
public interface UserUseCase {
    User login(String username, String password);
}
