/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controles;

/**
 *
 * @author bygwb3co
 */
import Documentos.CLibro;
import java.util.*;
import java.io.*;
public class ManipularLibros {
    
    private ArrayList<CLibro> listadelibros;
    private ArchivoL objetoarchivolibros = new ArchivoL();
    public ManipularLibros(){
        listadelibros = new ArrayList<CLibro>();
        listadelibros = objetoarchivolibros.leer();
    }
    public void agregarLibro(){
        Scanner entrada = new Scanner(System.in);
        char resp = 's';
        while(resp == 's'){
            CLibro objlibro = new CLibro();
            objlibro.aceptarDatos();
            listadelibros.add(objlibro);
            System.out.println("¿Deseas agrager otro libro?");
            resp = entrada.next().charAt(0);
        }
    }
    public void consultaGeneral(){
        if(listadelibros.isEmpty()){
            System.out.println("No hay libros agregados");
        }else{
            System.out.println("Los linro s on: ");
            for(int i = 0; i < listadelibros.size(); i++){
                System.out.println("Nombre del libro: "+ listadelibros.get(i).getNombre()+"\n");
                System.out.println("Autor del libro: "+ listadelibros.get(i).getAutor()+"\n");
                System.out.println("Editorial del libro: "+ listadelibros.get(i).getEditorial()+"\n");
                System.out.println("Precio del libro: "+ listadelibros.get(i).getPrecio()+"\n");
            }
        }
    }
    private int traePosicion(String buscarNombre){
        int pos = 0 ;
        boolean existe = false;
        for(int i = 0; i < listadelibros.size(); i++){
            if(buscarNombre.equalsIgnoreCase(listadelibros.get(i).getNombre())){
                pos = i;
                existe = true;
            }else{
                System.out.println("Libro no encontrado. Favor de ponerse en contacto con el admin");
            }
        }
        if(!existe){
            System.out.println("No existe registro del libro");
            pos = -1;
        }
        return pos;
    }
    public int buscar(){
        int posbuscar = 0;
        String nombreBuscar;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre del libro que desea buscar");
        nombreBuscar = entrada.nextLine();
        posbuscar = traePosicion(nombreBuscar);
        System.out.println("Nombre del libro"+listadelibros.get(posbuscar).getNombre());
        System.out.println("Autor del Libro"+listadelibros.get(posbuscar).getAutor());
        System.out.println("Editorial del Libro"+listadelibros.get(posbuscar).getEditorial());
        System.out.println("Precio del Libro"+listadelibros.get(posbuscar).getPrecio());
        return posbuscar;
    }
    public void borrar(){
        Scanner entrada = new Scanner(System.in);
        String libroborrar;
        int posborrar;
        if(listadelibros.isEmpty()){
            System.out.println("No hay libros Registrados");
        }else{
            System.out.println("Ingrese el ID del libro que vas a eleminar");
            posborrar = buscar();
            if(posborrar < listadelibros.size()){
                listadelibros.remove(posborrar);
                System.out.println("libro eliminado");
            }else{
                System.out.println("Imposible eliminar ese registro");
            }
        }
    }
    public void modificar(){
        int posmodificar = 0;
        int resmod = 0;
        String modificar;
        String opcion = "s";
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el Nombre del libro que deseas modificar: ");
        modificar = entrada.nextLine();
        while("s".equalsIgnoreCase(opcion)){
            posmodificar = traePosicion(modificar);
            System.out.println("¿Que dato deseas modifiacar el libro?"
                    + "\n 1.-Autor"
                    + "\n 2-Editorial"
                    + "\n 3.-Precio"
                    + "\n");
            resmod = entrada.nextInt();
            switch(resmod){
                case 1:
                    System.out.println("El Autor es: ");
                    System.out.println("Autor "+ listadelibros.get(posmodificar).getAutor());
                    System.out.println("Ingresa el nuevo actor");
                    listadelibros.get(posmodificar).setAutor(entrada.next());
                    System.out.println("El dato a sido modificado");
                    System.out.println("Autor" + listadelibros.get(posmodificar).getAutor());
                    break;
                case 2:
                    System.out.println("La editorial es: ");
                    System.out.println("Editorial: "+listadelibros.get(posmodificar).getEditorial());
                    System.out.println("Ingrese la nueva editorial");
                    listadelibros.get(posmodificar).setEditorial(entrada.next());
                    System.out.println("El dato a sido modificado");
                    System.out.println("Editorial: "+listadelibros.get(posmodificar).getEditorial());
                    break;
                case 3:
                    System.out.println("El Precio es: ");
                    System.out.println("Precio: "+listadelibros.get(posmodificar).getPrecio());
                    System.out.println("Ingrese el nuevo precio");
                    listadelibros.get(posmodificar).setEditorial(entrada.next());
                    System.out.println("El dato a sido modificado");
                    System.out.println("Precio: "+listadelibros.get(posmodificar).getPrecio());
                    break;
                default:
                    System.out.println("Opcion no Valida");
            }
            System.out.println("¿Quieres cambiar algun otro dato s/n?");
            opcion = entrada.nextLine();
        }
    }
    public void grabar(){
        getObjetoarchivolibros().serializar(listadelibros);
    }

    public ArrayList<CLibro> getListadelibros() {
        return listadelibros;
    }

    public void setListadelibros(ArrayList<CLibro> listadelibros) {
        this.listadelibros = listadelibros;
    }

    public ArchivoL getObjetoarchivolibros() {
        return objetoarchivolibros;
    }

    public void setObjetoarchivolibros(ArchivoL objetoarchivolibros) {
        this.objetoarchivolibros = objetoarchivolibros;
    }
    
}
