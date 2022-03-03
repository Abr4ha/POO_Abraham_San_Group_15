/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaseDatos;

/**
 *
 * @author vx_zas
 */
import java.sql.*;
public class Conexion {
    public static Connection getConexion() throws ClassNotFoundException{
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/funko", "root", "isGVOYcd4|>g04<>S");
        }catch(SQLException ed){
            System.out.println("Error al conectar");
            System.out.println(ed.getMessage());
        }catch(Exception ex){
            System.out.println("Error Logico");
            System.out.println(ex.getMessage());
        }
        return null;
    }
}
