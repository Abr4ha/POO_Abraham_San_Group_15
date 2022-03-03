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
public class Leer extends Thread{
    Socket socket;
    Leer(Socket socket){
        this.socket = socket;
        start();
    }
    public void run(){
        try{
            while(true){
                InputStream aux = socket.getInputStream();
                DataInputStream flujo = new DataInputStream(aux);
                System.out.println("DAtos" + flujo.readUTF());
            }
        }catch(Exception e){
            System.out.println("Error al leer");
            System.out.println(e.getMessage());
        }
    }
}
