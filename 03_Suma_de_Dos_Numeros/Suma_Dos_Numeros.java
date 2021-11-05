import java.util.Scanner;
class sumadedosnumeros{
        public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        int num1, num2;
        int resultado=0;

       do{
        
        System.out.println("Introduce los numeros que quieras sumar; si pones 0 se detiene la suma: ");
        
        num1 = entrada.nextInt();
        resultado = resultado + num1;  

        
       }while(num1 !=0);
        
       System.out.println("El resultado de la suma es: " + resultado);
    }
}