<%-- 
    Document   : dueno
    Created on : 23 feb. 2022, 09:19:49
    Author     : vx_zas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*;" %>
<%@page import="BaseDatos.*" %>
<%@page session = "true" %>
<% 
    String usuario = "";
    HttpSession sesionok = request.getSession();
    if(sesionok.getAttribute("rol") == null){
        %>
        <jsp:forward page="index.html">
            <jsp:param name="Error" value="Es obiglatorio Autenticarse"></jsp:param>
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
        <title>Solo el Master</title>
    </head>
    <body>
        <h1>Bienvenido : <%=usuario%>!</h1>
        <br>
        <h1>Tabla de Empleados de la tienda Funkos</h1>
        <br>
        <% Vector<Empleado> listaempleados = new Empleado().listaEmpleado(); %>
        <div class="table_usuarios">
            <table border="1" class="tabla_empledos">
                <tr>
                    <th>Numero de Empleados</th>
                    <th>Nombre</th>
                    <th>Usuario</th>
                    <th>Password</th>
                    <th>Rol</th>
                </tr>
            <%
                for(Empleado emp : listaempleados){
                    %>
                    <tr>
                        <td><%=emp.getNum_empleado()%></td>
                        <td><%=emp.getNombre()%></td>
                        <td><%=emp.getUser()%></td>
                        <td><%=emp.getPass()%></td>
                        <td><%=emp.getNombrerol()%></td>
                    </tr>
                    
            <%} %>
            </table>
        </div>
    </body>
</html>
