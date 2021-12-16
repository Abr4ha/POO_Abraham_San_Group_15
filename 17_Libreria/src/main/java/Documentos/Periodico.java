/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Documentos;

/**
 *
 * @author hyexzc
 */
import java.util.*;
public class Periodico extends CLibro{
    private Date fecha = new Date();
    private String fecha2;
    public Periodico(){
        
    }
    public Periodico(String tipo_revista, String nombre, String autor, String editorial, float precio) {
        super(nombre, autor, editorial, precio);
        this.fecha2 = fecha2;
    }
    
    public void agregarPeriodico(){
        CLibro datosLibro = new CLibro();
        Scanner entrada = new Scanner(System.in);
        datosLibro.aceptarDatos();
        System.out.println("Ingresa la fecha de publicacion: ");
        fecha2 = entrada.nextLine();
        /*
        System.out.println("Año: "+ fecha.getYear);
        System.out.println("Mes: "+ fecha.setMonth(0));
        System.out.println("Dia: ");
        tipo_revista = entrada.nextLine();
        */
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getFecha2() {
        return fecha2;
    }

    public void setFecha2(String fecha2) {
        this.fecha2 = fecha2;
    }
}
