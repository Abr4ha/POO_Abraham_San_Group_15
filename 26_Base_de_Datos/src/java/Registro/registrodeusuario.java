    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Registro;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import javax.servlet.ServletConfig;
/**
 *
 * @author vx_zas
 */
public class registrodeusuario extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    /**
     * Para Poder Realizar una conexion con la base de datos se necesita el uso de los objetos ;
     * Connection, Statement, ResultSet
     * Esos objetos deben de ser privados, porque vamos a establecer una conexion remota a un
     * servidor diferente
     */
    private Connection con = null;
    private Statement set = null;
    private ResultSet rs = null;
     public void init(ServletConfig cfg) throws ServletException{
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/funko","root", "isGVOYcd4|>g04<>S");
            set = con.createStatement();
            System.out.println("Conectado!!");
       }catch(Exception e){
            System.out.println("No se Conecto a BD");
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }
    }
    //Se necesita el constructor de la clase
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet registrodeusuario</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<table border=1 >"
                    +"<tr> "
                        + "<th>Num_Empleado</th>"
                        + "<th>Nombre</th>"
                        + "<th>User</th>"
                        + "<th>Password</th>"
                        + "<th>Id rol</th>"
                        + "<th>Usuario rol</th>"
                    + "</tr>");
            try{
                int num_empleado, idrol;
                String nombre, user, password, nrol;
                num_empleado = Integer.parseInt(request.getParameter("num_emp"));
                nombre = request.getParameter("nombre_e");
                user = request.getParameter("user");
                password = request.getParameter("password");
                set.executeUpdate("insert into empleado values("+num_empleado+", '"+nombre+"', '"+user+"', '"+password+"', '4', 'Vendedor')");
                set = con.createStatement();
                rs = set.executeQuery("SELECT * FROM funko.empleado;");
                while(rs.next()){
                    num_empleado = rs.getInt("num_empleado");
                    nombre = rs.getString("nombre");
                    user = rs.getString("user");
                    password = rs.getString("pass");
                    idrol = rs.getInt("id_rol");
                    nrol = rs.getString("nombre_rol");
                    out.println("<tr>"
                            + "<td>"+num_empleado+"</td>"
                            + "<td>"+nombre+"</td>"
                            + "<td>"+user+"</td>"
                            + "<td>"+password+"</td>"
                            + "<td>"+idrol+"</td>"
                            + "<td>"+nrol+"</td>"
                        +"</tr>");
                }
                out.println("</table>");
                out.println("<h1>registro Exitoso</h1>");
            }catch (SQLException ex){
                System.out.println("No se conecto con la tabla");
                System.out.println(ex.getMessage());
                System.out.println(ex.getStackTrace());
                out.println("<h1>Registro No exitoso</h1>");
            }
            out.println("<a href='registro.html' >Regresar al registro</a>");
            out.println("</body>");
            out.println("</html>");
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
