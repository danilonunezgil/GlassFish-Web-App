<%-- 
    Document   : login
    Created on : 14/05/2025, 10:32:19 p. m.
    Author     : danno
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Login de Usuario</title>
    </head>
    <body>
        <h2>Iniciar Sesión</h2>

        <form action="login" method="post">
            <label for="username">Usuario:</label><br/>
            <input type="text" id="username" name="username" required><br/>

            <label for="password">Contraseña:</label><br/>
            <input type="password" id="password" name="password" required><br/><br/>

            <input type="submit" value="Ingresar">
        </form>

        <% 
            String error = (String) request.getAttribute("error");
            if (error != null) {
        %>
            <p style="color:red;"><%= error %></p>
        <% 
            } 
        %>
    </body>
</html>
