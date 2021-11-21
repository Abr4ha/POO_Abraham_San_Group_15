import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
public class Ejercicios {
    char op;
    boolean error;
    int n, m, e;
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
                System.out.println("Introduce el numero de columnas :");
                n = entrada.nextInt();
                System.out.println("Introduce el numero de filas :");
                m = entrada.nextInt();
                if(n >= 3){
                    if( n%2==0){
                        e = n/2;
                    }else{
                        e = (n-1)/2;
                    }
                }else if (n == 2){
                    e = n-1;
                }
                for(int i = 1; i<=e; i++){
                    for(int j = 1; j <= m; j++){
                        System.out.print("* ");
                    }
                    System.out.println(" ");
                    if( n >= 2){
                        for(int l = 1; l<=m; l++){
                            System.out.print("/ ");
                        }
                        System.out.println(" ");
                    }
                }
                if( n%2 !=0){
                    for(int j = 1; j <= m; j++){
                        System.out.print("* ");
                    }
                }
                break;
            default:
                error=true;
                System.out.println("\tError opcion no valida\n");
        }    
        }while (error);
    }
    
}
