/*
41 - 60
Las funciones de la biblioteca 
prestamo de libros
*/
import java.util.Scanner;
import java.util.*;
import javax.swing.*;
public class Biblioteca{

    //vamos a crear un objeto para poder introducir los datos
    Scanner entrada = new Scanner(System.in);

    /*
    Vamos a realizar el 
    Variables
    Autor, Titutlo, ISBN, Genero, 
    Ejemplares, Costo del prestamo
    //metodos
    prestamo de libros
    Devolucion de libros
    */
    private String titulo, autor, isbn, genero;
    private int ejemplares;
    private double costo_prestamo, total;
    boolean error;


    public void Libros(){
        //menu para el prestamo del libro
        //agregar el try catch para el manejo de errores
        //identificar si son variables publicas o privadas para el manejo de los datos
        String text;
        int opcion=0;
        do{
            error = false;
            try{
                text = JOptionPane.showInputDialog("Elija la funcion que desea ejecutar: "
                                        + "\n 1.- Prestamo del libro"
                                        + "\n 2.- Devolucion del libro"
                                        + "\n 3.- Menu");
                opcion = Integer.parseInt(text);
            }
            catch(Exception ex){
                JOptionPane.showMessageDialog(null,"Para acceder a un programa solo se puede ingresar los numeros del 1 al 2");
                error = true;
            }
            switch (opcion) {
                case 1:
                    Prestamo();
                    error = false;
                    break;
                case 2:
                    Devolucion();
                    error = false;
                    break;
                case 3:
                    Principal llamado = new Principal();
                    llamado.MenuP();
                    error = false;
                return;
                   // int opciones = 1;
                    
                    //break;
                default:
                    error = true;
                    JOptionPane.showMessageDialog(null,"Opcion no valida ingrese un opcion valida","Error",JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }while(error);
    }
    
    public void Prestamo(){
        /*
        Lo primero es que deberan de crear los objetos de Libros
        Donde cada uno de ustedes debera de tener 5 Libros diferentes
        Se debera de precargar la informacion del libro

        Primero se debe de crear la clase Libro
        Libro drama = new Libro("La cumbre escarlata", "No me lo se", "12345-BN", 5);
        Libro fantasmas = new Libro("Las cronicas Mutantes", "No me lo se", "00345-BN", 3);
        
        Segundo
        Tiene que aparecer la lista de todos los libros
        
        Tercero
        Ingrese el titulo que desea para su prestamo, y la cantidad de libros la debes de ir registrando
        porque se debe de preguntar, si desea agregar otro titlo

        Cuarto
        Se debe de visualizar los datos del libro que se presto y quedan x cantidad de existencias
        */
        String[] Libros = {"fantasmas", "novela", "drama"};
        for(String i:Libros){
            //JOptionPane.showInternalMessageDialog(nombres[i]);
            System.out.print(i+" ");

        }
        Libros tipoLibro = new Libro();
        
    }

    public void Devolucion(){

        /*
        Primero 

        Buscar en el sistema el libro que se presto

        Segundo 
        
        Cambiar el estado de ese prestamo -> Volver a sumar la cantidad del ejemplar

        Tercero

        Visualizar los datos del libro de nuevo
        */
    }    
}
