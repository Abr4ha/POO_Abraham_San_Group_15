/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._libreria;

/**
 *
 * @author hyexzc
 */
import java.io.*;
import java.util.*;
public class CLibro {
    private String nombre;
    private String autor;
    private String Editorial;
    public CLibro(){
        
    }
    public void aceptarDatos(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el Nombre del libro");
        nombre = entrada.nextLine();
        System.out.println("Ingrese el Nombre del Autor");
        autor = entrada.nextLine();
        
    }
}
