/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._arraypersona;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hyexzc
 */
public class ManipularPersona {
    Scanner entrada = new Scanner(System.in);
    int opcion;
    ControladorPersona crud = new ControladorPersona();
    public void Principal(){
        do{
            System.out.println("Bienvenido a NetBeans");
            System.out.println("Por favor elije una opcion del siguiente menu:"
                    + "\n1.- Mostrar lista del Personal"
                    + "\n2.- Registrar una nueva Persona"
                    + "\n3.- Editar los datos de una persona"
                    + "\n4.- Borrar el registro de una persona"
                    + "\n5.- Salir");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    ArrayList<Persona> listadepersonas = crud.mostrarPersonas();
                    for(Persona objeto : listadepersonas){
                        System.out.println("el id:"+objeto.getId()
                                            +"\nEl nombre es:"+ objeto.getNombre()
                                            +"La edad es: "+ objeto.getEdad() +"\n");
                    }
                    break;
                case 2:
                    System.out.println("ingresa el id de la persona: ");
                    int idpersona = entrada.nextInt();
                    System.out.println("Ingrese el nombre de la persona: ");
                    String nombrepersona = entrada.nextLine();
                    System.out.println("Ingrese la edad de la persona: ");
                    int edadpersona = entrada.nextInt();
                    
                    Persona nuevapersona = new Persona(idpersona, nombrepersona, edadpersona);
                    
                    crud.registrarPersona(nuevapersona);
                    
                    break;
                case 3:
                    System.out.println("Ingrese el ID de la Persona que desea actualizar");
                    int id = entrada.nextInt();
                    Persona personaSeleccionada = crud.buscarPersona(id);
                    System.out.println("La informacion de la persona es: ");
                    System.out.println("Id: "+personaSeleccionada.getId()
                                        +"\n Nombre: "+ personaSeleccionada.getNombre()
                                        +"\n Edada:"+ personaSeleccionada.getEdad()+"\n");
                    
                    System.out.println("Ingresa el nuevo nombre para el registro: ");
                    String nuevonombre = entrada.nextLine();
                    System.out.println("Ingresa la nueva edad para el registro:");
                    int nuevaedad = entrada.nextInt();
                    
                    personaSeleccionada.setNombre(nuevonombre);
                    personaSeleccionada.setEdad(nuevaedad);
                    
                    crud.actualizarPersona(personaSeleccionada);
                    break;
                case 4:
                    System.out.println("Ingresa el ID de la persona a borrar: ");
                    int ideliminar = entrada.nextInt();
                    
                    Persona personaEliminar = crud.buscarPersona(ideliminar);
                    crud.eliminarPersona(personaEliminar);
                    System.out.println("Registro eliminado");
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Ingrese una opcion valida");
            }
        }while(opcion != 5);
    }
    
}
