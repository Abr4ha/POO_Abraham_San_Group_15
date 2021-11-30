/*

Vamos a realizar un programa mediante el cual el usuario pueda gestionar
los pagos de los libros atrasados de la biblioteca

*/


//librerias
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Principal{
    int choice;
    String text_menu;
    boolean error;

    public static void main(String[] args){
        String text;
        int opciones=0;
        Principal mainp = new Principal();
        do{
            mainp.MenuP();
            text = JOptionPane.showInputDialog("En caso de que desee regresar al menu principal digite 1");
            opciones = Integer.parseInt(text);
        }while(opciones == 1);
        System.exit(0);
    }

    public void MenuP(){
        String text;
        int opciones=0;
        //los metodos void (vacios), son porque no reciben ningun parametro
        do{
            try{
                text = JOptionPane.showInputDialog("Seleccione el programa a ejecutar de la siguiente lista: \n 1.- Consultar el sueldo Personal." 
                        + "\n 2.- Costos y Proveedores."
                        + "\n 3.- Prestamo y devolucion de libros"
                        + "\n 4.- Salir");
                    if(text != null){
                        opciones = Integer.parseInt(text);
                        error = false;
                    }else{
                        System.exit(0);
                    }

            }catch(Exception e){
                //JOptionPane.showMessageDialog(null,"Por favor escoga una de las opciones validas del 1 al 3");
                //JOptionPane.showMessageDialog(null, " "+e.getMessage());
                //System.out.println("El erro es: " + e.getMessage());
                e.printStackTrace(System.err);
                error = true ;

            }
            switch ( opciones ) {
                case 1:
                    //System.out.println("Consulta");
                    JOptionPane.showInternalMessageDialog(null,"Consultar Sueldo Personal");
                    error = false;
                    break;
                case 2:
                    //metodo
                    JOptionPane.showInternalMessageDialog(null,"Costo y Proveedores");
                    error = false;
                    break;
                case 3:
                    Biblioteca mbiblioteca = new Biblioteca();
                    mbiblioteca.Libros();
                    error = false;
                    break;
                case 4:
                    error = false;
                    System.exit(0);
                    break;
                default:
                    error = true;
                    JOptionPane.showMessageDialog(null,"Opcion no valida ingrese un opcion valida 1 al 3","Error",JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }while (error);
    }
    



}