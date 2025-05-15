/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.glassfishwebapp.domain.service;

import com.mycompany.glassfishwebapp.domain.model.Role;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author danno
 */
public class RoleService {
    private Map<String, Role> roles = new HashMap<>();

    public RoleService() {
        initDefaultRoles();
    }

    private void initDefaultRoles() {
        this.roles.put("ADMIN_ROLE", new Role("Role-1","ADMIN_ROLE"));
        this.roles.put("USER_ROLE", new Role("Role-2", "USER_ROLE"));
    }

    public Map<String, Role> getRoles() {
        return roles;
    }

    public void setRoles(Map<String, Role> roles) {
        this.roles = roles;
    }  
    
}
