/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servlet._sockects;

/**
 *
 * @author vx_zas
 */
import java.net.*;
import java.io.*;
import java.util.*;
public class AtenderClientes extends Thread {
    Socket socket;
    String mensajes;
    ArrayList<Socket> listaCliente;
    int clientes;
    public AtenderClientes(ArrayList<Socket> lista, Socket socket){
        this.listaCliente = lista;
        this.socket = socket;
        start();
    }
    public void run(){
        while(true){
            try{
                InputStream is = socket.getInputStream();
                DataInputStream flujo = new DataInputStream(is);
                mensajes = flujo.readUTF();
                for(int cont = 0; cont < listaCliente.size(); cont++){
                    OutputStream os = listaCliente.get(cont).getOutputStream();
                    DataOutputStream flujoDOS = new DataOutputStream(os);
                    flujoDOS.writeUTF(mensajes);
                }
            }catch(Exception e){
                System.out.println("Error de comunicacion");
                System.out.println(e.getMessage());
            }
        }
    }
}
