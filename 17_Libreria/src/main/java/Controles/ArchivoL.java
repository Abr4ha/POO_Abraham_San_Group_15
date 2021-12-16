/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controles;

/**
 *
 * @author hyexzc
 */
import Documentos.CLibro;
import java.util.*;
import java.io.*;
class ArchivoL implements Serializable{
    ArrayList<CLibro> listarecuperada = new ArrayList<CLibro>();
    public ArrayList<CLibro> leer(){
        try{
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("libro.txt"));
            listarecuperada = (ArrayList<CLibro>)in.readObject();
            in.close();
        }catch(Exception e){
            System.out.println("Error" + e.getMessage());
            System.out.println("Se origino" + e.getStackTrace());
        }
        return listarecuperada;
    }
    void serializar(ArrayList<CLibro> listaserializada){
        try{
            FileOutputStream salida = new FileOutputStream("libro.txt");
            ObjectOutputStream salidaobjeto = new ObjectOutputStream(salida);
            salidaobjeto.writeObject(listaserializada);
            salidaobjeto.close();
        }catch(Exception e){
            System.out.println("Error" + e.getMessage());
            System.out.println("Se origino"+ e.getStackTrace());
        }
    }
    
}
