/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Documentos;

import java.util.Scanner;

/**
 *
 * @author hyexzc
 */
public class Revista extends CLibro{
    private String tipo_revista;
    public Revista(){
        
    }

    public Revista(String tipo_revista) {
        this.tipo_revista = tipo_revista;
    }

    public Revista(String tipo_revista, String nombre, String autor, String editorial, float precio) {
        super(nombre, autor, editorial, precio);
        this.tipo_revista = tipo_revista;
    }

    public String getTipo_revista() {
        return tipo_revista;
    }

    public void setTipo_revista(String tipo_revista) {
        this.tipo_revista = tipo_revista;
    }
    public void agregarRevista(){
        CLibro datosLibro = new CLibro();
        Scanner entrada = new Scanner(System.in);
        datosLibro.aceptarDatos();
        System.out.println("Ingresa el tipo de revista: ");
        tipo_revista = entrada.nextLine();
    }
    
}
