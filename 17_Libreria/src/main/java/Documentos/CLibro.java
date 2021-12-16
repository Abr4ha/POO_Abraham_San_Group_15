/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Documentos;

/**
 *
 * @author hyexzc
 */
import java.io.*;
import java.util.*;
public class CLibro {
    private String nombre;
    private String autor;
    private String editorial;
    private float precio;
    public CLibro(){
        
    }

    public CLibro(String nombre, String autor, String editorial, float precio) {
        this.nombre = nombre;
        this.autor = autor;
        this.editorial = editorial;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    public void aceptarDatos(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el Nombre del Documento: ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese el Nombre del Autor: ");
        autor = entrada.nextLine();   
        System.out.println("Ingresa la Editorial del Libro: ");
        editorial = entrada.nextLine();
        System.out.println("Ingresa el Precio del Libro: ");
        precio = entrada.nextFloat();
    }
    
}
