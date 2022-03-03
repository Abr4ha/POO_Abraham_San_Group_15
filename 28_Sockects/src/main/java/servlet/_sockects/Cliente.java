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
import java.util.*;
import java.net.*;
public class Cliente {
    Scanner entrada = new Scanner (System.in);
    Cliente(){
        try{
            Socket skcliente = new Socket("localhost", 5000);
            System.out.println("Introduce tu nombre");
            String nombre = entrada.next();
            Escribir hilo1 = new Escribir(skcliente, nombre);
            Leer hilo2 = new Leer(skcliente);
        }catch(Exception e){
            System.out.println("Error de comunicacion");
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args){
        new Cliente();
    }
}
