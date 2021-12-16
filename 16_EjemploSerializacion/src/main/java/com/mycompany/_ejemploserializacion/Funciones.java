/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._ejemploserializacion;

/**
 *
 * @author hyexzc
 */
import java.io.*;
import java.util.*;
import javax.swing.*;
public class Funciones {
    ArrayList<Persona> listapersonas = new ArrayList();
    String rep = "si";
    String nombre = "";
    int edad, numero_empleado, bol;
    Persona profesor = new Profesor();
    Persona alumno = new Alumno();
    void menu(){
       while(true){
           while(rep.equalsIgnoreCase("si")){
               try{
                   String var = JOptionPane.showInputDialog("Ingrese la Opocion deseada"
                           + "1.- Registrar nuevo Profesor."
                           + "2.- Registrar nuevo Alumno."
                           + "3.- Consultar Estudiantes"
                           + "4.-Salir");
                   if(var == null){
                       System.exit(0);
                   }
                   int opcion = Integer.parseInt(var);
                   switch (opcion){
                       case 1:
                           pedirDatosProfesor();
                           profesor = new Profesor(numero_empleado, nombre, edad);
                           guardaProfesor;
                       case 2:
                           pedirDatosAlumno();
                           alumno = new Alumno(bol, nombre, edad);
                           guardarAlumno();
                           break;
                       case 3:
                       default:
                           System.out.ptintln("Opcion no valida")
                   }
                   rep = JOptionPpane.showInputDialog("¿Desea Repetir?")
               }catch(Exception e){
                   JOptionPane.showMessage
               }
           }
       }
    }
    private void pedirDatosProfesor(){
        numero_empledado = Integer.parseInt(JOptionPane.showInputDialog(""));
        nombre = JOptionPane.showInputDialog("Ingreas el nombre del profesor");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingre"));
    }
    private void guardarProfesor(){
        listapersonas.add(profesor);
        guardar();
    }
    private void pedirDatosAlumno(){
        
        
    }
    private void guardarAlumno(){
        listapersonas.add(alumno);
        guardar();
    }
    private void leerAlumno(){
        FileInputStream archivo = new FileInputStream("archivo.dat");
        ObjectInputStream entrada = new ObjectInputStream(archivo);
        listapersonas = (ArrayList)entrada.readObject();
    }
}
