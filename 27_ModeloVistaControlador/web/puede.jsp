<%-- 
    Document   : puede
    Created on : 2 mar. 2022, 19:25:08
    Author     : vx_zas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="BaseDatos.*" %>
<%@page import="java.util.*"%>
<%@page session="true" %>
<%
    String usuario = "";
    HttpSession sesionok = request.getSession();
    if(sesionok.getAttribute("id_rol") == null){
%>
<jsp:forward page="index.html">
    <jsp:param name="Error" value="Es obligatorio Autentificarse"/>
</jsp:forward>
<%
    }else{
        usuario = (String)sesionok.getAttribute("rol");
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Dueño</title>
    </head>
    <body>
        <h1>Bienvenido : </h1>
        <br>
        <table border="1">
            <tr>
            <th>Numero empleado</th>
            <th>Nombre</th>
            <th>Usario</th>
            <th>Password</th>
            <th>Rol</th>
            </tr>
        </table>
        <%
        %>
    </body>
</html>
