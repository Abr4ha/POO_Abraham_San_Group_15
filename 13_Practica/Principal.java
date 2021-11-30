import java.util.Scanner;
import java.util.Random;
public class Principal{

    public static final String[] PalabrasSecretas={"camara","video","aula","profesor","abrigo","mochila","pantalla","ordenador","diccionario","test","rayar","cultura"};
    public static boolean[] Indices = new boolean[PalabrasSecretas.length];
    public static final int maxIntentos = 4;
    public static int Victorias=0, Derrotas=0;
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int opcion = 0;
        do{
            System.out.println("MENU\n\t1.- Jugar partida\n\t2.- Ver estadisticas\n\t0.-Salir");
            try{
                System.out.println("Seleccionar la opcion (1-2) o 0 para Salir");
                opcion=input.nextInt();
            }catch (Exception ex){
                ex.printStackTrace(System.err);
                System.out.println("\tError\n");
            }
            input.nextLine();
            switch (opcion){
                case 1:
                    if(partida(input)){
                        Victorias++;
                    }else{
                        Derrotas++;
                    }
                    break;
                case 2:
                    System.out.println("Victorias"+Victorias);
                    System.out.println("Derrotas"+Derrotas);
                    break;
                case 0:
                    System.out.println("Adios : ");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }while(opcion!=0);
        input.close();
    }
    public static String nuevaPalabra() {
        if((Victorias+Derrotas)%PalabrasSecretas.length == 0){
            for(int i=0;i<PalabrasSecretas.length;i++){
                Indices[i]=false;
            }
        }
        int i=0;
        do{
            i=new Random().nextInt(PalabrasSecretas.length);
        }while (Indices[i]==true);
            Indices[i]=true;
            return PalabrasSecretas[i];
        

    }
    public static char leerLetra(Scanner in){
        char l=' ';
        do{
            try{
                System.out.print("Introduzca una letra: ");
                l=in.nextLine().toLowerCase().charAt(0);
            }catch(Exception ex){
                System.out.println("Opcion no valida.\n");
            }
        }while (!Character.isLetter(l));
        System.out.println();
        return l;
    }
    public static void mostrarEstadoPartida(char[] palabra, char[] fallos){
        System.out.println("Palabara: \t");
        for (int i=0;i<palabra.length;i++){
            if((int) palabra[i]==0){
                System.out.print("_ ");
            }else{
                System.out.print(palabra[i]+"");
            }
        }
        System.out.print("\nFallos: \t");
        for(int i=0; i<fallos.length;i++){
            if((int) fallos[i]==0){
                System.out.print("_ ");
            }else{
                System.out.print(fallos[i]+" ");
            }
        }
        System.out.println();
    }
    public static boolean partida(Scanner in) {
        final String palabraSecreta=nuevaPalabra();
        char[] Palabra= new char[palabraSecreta.length()];
        char[] Letras=new char[maxIntentos];
        int fallos=0;
        char letra;
        boolean fin=false, letraCorrecta;
        do{
            letraCorrecta=false;
            mostrarEstadoPartida(Palabra, Letras);
            System.out.println("Intentos Restantes"+(maxIntentos-fallos));
            letra=leerLetra(in);
            for(int i=0; i<palabraSecreta.length();i++){
                if(palabraSecreta.charAt(i)==letra && Palabra[i]!=letra){
                    Palabra[i]=letra;
                    letraCorrecta=true;
                }
            }
            if(letraCorrecta){
                fin=palabraSecreta.equals(String.copyValueOf(Palabra));
            }else{
                Letras[fallos]=letra;
                fallos++;
            }
        }while(!fin&& fallos<maxIntentos);
    }
}