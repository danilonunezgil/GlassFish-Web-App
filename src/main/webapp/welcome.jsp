<%-- 
    Document   : welcome
    Created on : 15/05/2025, 1:03:26 a. m.
    Author     : danno
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.mycompany.domain.model.User" %>
<%
    User user = (User) session.getAttribute("user");
%>
<html>
<head><title>Bienvenido</title></head>
<body>
    <h2>Bienvenido, <%= user != null ? user.getUsername() : "Invitado" %>!</h2>
</body>
</html>
