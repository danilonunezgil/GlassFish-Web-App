/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.glassfishwebapp.infraestructure;

import com.mycompany.glassfishwebapp.application.UserUseCase;
import com.mycompany.glassfishwebapp.domain.model.User;
import com.mycompany.glassfishwebapp.domain.service.RoleService;
import com.mycompany.glassfishwebapp.domain.service.UserService;
import com.mycompany.glassfishwebapp.domain.service.UserUseCaseImpl;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author danno
 */
@WebServlet("/login")
public class UserController extends HttpServlet {
    
    private UserUseCase userUseCase;
    
 
    @Override
    public void init() throws ServletException {
        RoleService roleService = new RoleService();
        UserService userService = new UserService(roleService);
        userUseCase = new UserUseCaseImpl(userService);
    }
    
        @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        User user = userUseCase.login(username, password);

        if (user != null) {
            HttpSession session = req.getSession();
            session.setAttribute("user", user);
            resp.sendRedirect("welcome.jsp");
        } else {
            req.setAttribute("error", "Usuario o contraseña inválidos");
            req.getRequestDispatcher("login.jsp").forward(req, resp);
        }
    }
}
