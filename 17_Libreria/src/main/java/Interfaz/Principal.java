/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz;

/**
 *
 * @author hyexzc
 */
import Controles.ManipularLibros;
import java.io.*;
import java.util.*;
public class Principal {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        ManipularLibros listadelibrosobj = new ManipularLibros();
        int Opcion;
        do{
            System.out.println("Bienvenido a la Biblioteca del Oscurantismo"
                    + "\nIbrese la Opcion deseada: "
                    + "\n1.- Agregar nuevo Libro"
                    + "\n2.-Consultar Libro"
                    + "\n3.-Consultar todos los libros"
                    + "\n4.-Borrar un libro"
                    + "\n5.-Modificar los datos de un libro"
                    + "\n6.-Salir");
            Opcion = entrada.nextInt();
            switch(Opcion){
                case 1:
                    listadelibrosobj.agregarLibro();
                    break;
                case 2:
                    listadelibrosobj.buscar();
                    break;
                case 3:
                    listadelibrosobj.consultaGeneral();
                    break;
                case 4:
                    listadelibrosobj.borrar();
                    break;
                case 5:
                    listadelibrosobj.modificar();
                    break;
                case 6:
                    System.out.println("Gracias por Usar");
                    listadelibrosobj.grabar();
                    break;
                default:
                    System.out.println("Error Ingrese una opcion valida");
            }
            Opcion = entrada.nextInt();
        }while((Opcion >= 1)&&(Opcion < 6));
    }
    
}
