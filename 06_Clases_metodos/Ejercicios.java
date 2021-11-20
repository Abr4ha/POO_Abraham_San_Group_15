import java.util.Scanner;
public class Ejercicios {
    char op;
    boolean error;
    Scanner entrada = new Scanner(System.in);    
    public void menu(){
        do{
        try{
            System.out.println("Ejercicios por yo, elija una opcion deseada: \na.- Calculadora\nb.-Conversion de unindades\nc.-creacion de cuadros.\nd.-Movimientio en cuadro.\nCualquier otra opcion sale del programa");
            op = entrada.next().charAt(0);
            error=false;
        }
        catch (Exception ex){
        ex.printStackTrace(System.err);
            error=true;
            System.out.println("\tError\n");
        }
        switch(op){
            case 'a':
                break;
            case 'b':
                break;
            case 'c':
                break;
            case 'd':
                break;
            default:
                error=true;
                System.out.println("\tError opcion no valida\n");
        }    
        }while (error);
    }
    
}
