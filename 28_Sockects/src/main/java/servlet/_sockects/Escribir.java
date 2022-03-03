/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servlet._sockects;

/**
 *
 * @author vx_zas
 */
import java.io.*;
import java.net.*;
import java.util.*;

public class Escribir extends Thread{
    Socket socket;
    String nombre;
    Scanner entrada;
    Escribir(Socket socket, String nombre){
        entrada = new Scanner(System.in);
        this.socket = socket;
        this.nombre = nombre;
        start();
        
    }
    public void run(){
        try{
            boolean terminar = false;
            String mensaje;
            while(terminar){
                OutputStream os = socket.getOutputStream();
                DataOutputStream flujoDOS = new DataOutputStream(os);
                System.out.println("Escribe tu mensaje"+ nombre + "");
                mensaje = entrada.nextLine();
                if(mensaje.equals("salir")){
                    terminar = true;
                }else{
                    flujoDOS.writeUTF(nombre + "dice: " + mensaje);
                }
                
            }
            socket.close();
        }catch(Exception e){
                System.out.println("Error al conectar");
                System.out.println();
        }
    }
}
