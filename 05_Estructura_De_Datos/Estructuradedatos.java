import java.util.Scanner;
class EstructuradeDatos{
    /*EL PROGRAMA DEBE SOLICITAR LA EDAD DEL USUARIO. SI ÉSTA ES MAYOR DE 65, 
      AL PRECIO DEL ABONO SE LE APLICA UN DESCUENTO DEL 40%. SI LA EDAD ES MENOR QUE 21, 
      SE PREGUNTA AL USUARIO SI SUS PADRES SON SOCIOS. SI LA RESPUESTA ES AFIRMATIVA, 
      SE LES APLICA UN DESCUENTO DEL 45%; EN CASO CONTRARIO, SE LES APLICA UN 25%.
    
     */
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int edad, opcion, socio, numbinario, total, numerototal, n, a, b;
        int positivos = 0;
        int negativos = 0;
        double precio, bono;
        char letras, operacion, sistema_temperatura;
        float precios = 0;
        float resultado = 0;
        int cantidad = 0;
        String binario = "";
        double celsius = 0.00;
        double kelvin = 0.00;
        double rankine = 0.00;
        do{
            System.out.println("Bienvenido a tu primer programa de Estructuras.\nPor favor elija la opcion deseada:\n1.- Descuentos por edad\n2.- Convertir numero decimal a binario\n3.- Conversiones de temperatura\n4.- Numeros positivos y negativos\n5.- Tienda\n6.- Area y Perimetros\n7.- Tabla\n8.-Factorial\n9.-Dibujos de codigo\n10.-Figura Hueca\n11.-Patrones de codigo\n12.-Diamante\n13.-calculadora\n14.-Salir");
            opcion = entrada.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Ingrese el Bono A Cobrar");
                    bono = entrada.nextDouble();
                    System.out.println("Ingrese la Edad");
                    edad = entrada.nextInt();
                    if(edad >= 65){
                        bono = bono*.6;
                        System.out.println("Su descuento es de 40%");
                        System.out.println("El total a pagar es de: "+ bono);
                    }
                    if(edad <= 21){
                        System.out.println("Si tus padres son socios ingresa 1, si no lo son ingresa 2");
                        socio = entrada.nextInt();
                        switch(socio){
                            case 1:
                                bono = bono*.55;
                                System.out.println("Su descuento fue del 45%");
                                System.out.println("El total a Pagar es de: "+bono);
                                break;
                            case 2:
                                bono = bono*.75;
                                System.out.println("Su descuento fue del 25%");
                                System.out.println("El total a Pagar es de :" + bono);
                                break;
                            default:
                                System.out.println("Opcion no valida");

                        }
                    }
                    System.out.println("Tu edad es de: "+ edad);
                    System.out.println("El total a pagar es: "+bono);
                break;
                case 2:
                break;
                case 3:
                System.out.println("Bienvenido a Convercion de Temperaturas\nIngrese Uno de las Siguientes letras Para Ingresar su tipo de temperatura\n\tk para kelvin\n\tc para celcius\n\tr rankie\nCualquier otro caracter no esta");
                sistema_temperatura = entrada.next().charAt(0);
                switch(sistema_temperatura){
                    case 'k':
                        System.out.println("Ingrese la temperatura en Kelvin : ");
                        kelvin = entrada.nextFloat();
                        celsius = kelvin*272.15;
                        rankine = kelvin*1.8;
                        System.out.println("la Temperatura en celsius es : " +celsius+"\nla temperatura en rankie es : "+rankine);
                    break;
                    case 'c':
                        System.out.println("Ingrese la temperatura en celsius : ");
                        celsius = entrada.nextFloat();
                        kelvin = 274.14 * celsius;
                        rankine = 493.47 * celsius;
                        System.out.println("la Temperatura en kelvin es : " +kelvin+"\nla temperatura en rankie es : "+rankine);
                    break;
                    case 'r':
                        System.out.println("Ingrese la temperatura en rankie : ");
                        rankine = entrada.nextFloat();
                        kelvin = 0.5555 * rankine;
                        celsius = -272.5944 * rankine;
                        System.out.println("la Temperatura en kelvin es : " +kelvin+"\nla temperatura en celsius es : "+celsius);
                    break;
                    default:
                        System.out.println("No esta registrado");
                }
                //tarea
                break;
                case 4:
                break;
                case 5:
                break;
                case 6:
                //tarea
                break;
                case 7:
                    for(n = 1; n <= 10; n++){
                        System.out.println(n + " " + (n*10)+ " " + (n*100)+ " " + (n*1000));
                    }
                break;
                case 8:
                //tarea
                case 9:
                    /*
                    ESCRIBA UN PROGRAMA QUE LEA EL LADO DE UN CUADRADO Y A 
                    CONTINUACIÓN LO IMPRIMA EN FORMA DE ASTERISCOS. 
                    SU PROGRAMA DEBERA PODER FUNCIONAR PARA CUADRADOS DE 
                    TODOS TAMAÑOS ENTRE 1 Y 20
                     */
                    System.out.println("Cuadarado Magico");
                    System.out.println("Inserta el num de lados");
                    n = entrada.nextInt();
                    if( n>= 1 && n <= 20 ){
                        //aqui tengo las filas
                        for(int i = 1; i<=n; i++){
                            for(int j = 1; j<=n; j++){
                                System.out.print("* ");
                            }
                            System.out.println(" ");
                        }

                    }
                break;
                case 10:
                    System.out.println("Cuadarado Magico hueco");
                    System.out.println("Inserta el num de lados: ");
                    n = entrada.nextInt();
                    if( n>= 1 && n <=20){
                        for(int i = 0; i < n; i++){
                            System.out.print(" * ");
                        }
                        System.out.println();
                        for(int i = 0; i < n-2; i++){
                            System.out.print(" * ");
                            for(int j = 0;j < n-2; j++){
                                System.out.print(" ");
                            }
                        System.out.println("   * ");
                        }
                        for(int i = 0; i < n; i++){
                            System.out.print(" * ");
                        }
                    }else{
                        System.out.println("Error, el rango debe de ser entre 1 y 20,intente de nuevo");
                    }
                break;
                case 11:
                
                case 12:
                //tarea
                case 13:
                    System.out.println("Calculadora maizsora");
                    System.out.println("Ingrese un numero");
                    a = entrada.nextInt();
                    System.out.println("Ingrese un segundo numero");
                    b = entrada.nextInt();
                    System.out.println("Ingrese el tipo de opreaciones que deasea realizar : (+ , -, *, /)");
                    operacion = entrada.next().charAt(0);
                    /*
                    Switch
                        case -
                        case +
                        case * 
                        case /
                    */
                    switch(operacion){
                        case '+' :
                            resultado = a+b;
                            System.out.println("la suma es de: " + resultado);
                            break;
                        case '-' :
                            resultado = a-b;
                            System.out.println("la resta es de: " + resultado);
                            break;
                        case '*' :
                            resultado = a-b;
                            System.out.println("la multiplicacion es de: " + resultado);
                            break;  
                        case '/' :
                            if(b != 0){
                                resultado = a/b;
                                System.out.println("La division es de: " + resultado);
                            }else{
                                System.out.println("No es posible dividir 0");
                            }
                            break;
                        default:
                            System.out.println("Operacion no Valida");
                    }
                break;
                default:
                    System.out.println("Gracias por ver el Programa ");
            }
            System.out.println("¿Deseas Repetir el programa? Si lo desea escriba s");
            letras = entrada.next().charAt(0);
        }while(letras == 's'||letras == 'S');
    }
}   