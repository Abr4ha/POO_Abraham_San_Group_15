/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vx_zas
 */
import java.io.*;
import java.net.*;
import java.util.*;
import java.text.SimpleDateFormat;
public class Servidor {
    private static int uniqueID;
    private ArrayList<ClienteThread> al;
    private SimpleDateFormat fecha;
    private int port;
    private boolean keepgoing;
    private String notificaciones = " *** ";
    public Servidor(int port){
        this.port = port;
        fecha = new SimpleDateFormat("HH:mm:ss");
        al = new ArrayList<ClienteThread>();
    }
    public void start(){
        keepgoing = true;
        try{
            ServerSocket serversocket = new ServerSocket(port);
            while(keepgoing){
                display("Servidor esperando por el cliente en el puerto : " + port + " . ");
                Socket socket = serversocket.accept();
                if(!keepgoing){
                    break;
                }
                ClienteThread t = new ClienteThread(socket);
                al.add(t);
                t.start();
                try{
                    serversocket.close();
                    for(int i = 0; i < al.size(); ++i){
                        ClienteThread tc = new ClienteThread(socket);
                        tc.in.close();
                        tc.os.close();
                        tc.socket.close();
                    }
                }catch(IOException e){
                    System.out.println("Error no se puede cerrar al cliente");
                    System.out.println(e.getMessage());
                }
            }
        }catch(IOException e){
            System.out.println("Nadie quiere mudar el server");
            System.out.println(e.getMessage());
        }
    }
    protected void stop(){
        keepgoing = false;
        try{
            new Socket ("localhost", port);
        }catch(Exception e){
            System.out.println("No se quiere mudar el server");
            System.out.println(e.getMessage());
        }
    }
    private void display(String msg){
        String tiempo = fecha.format(new Date() + " " + msg);
        System.out.println(tiempo);
    }
    private synchronized boolean broadcast(String mensaje){
        String tiempo = fecha.format(new Date());
        String[] escribir = mensaje.split(" ", 3);
        boolean esprivado = false;
        if(escribir[1].charAt(0) == '@' ){
            esprivado = true;
        }
        if(esprivado == true){
            String tocheck = escribir[1].substring(1, escribir[1].length());
            mensaje = escribir[0] + escribir[2];
            String mensajepriv = tiempo + " " + mensaje + "\n";
            boolean encontrar = false;
            for(int y=al.size(); --y>=0; ){
                ClienteThread ct1 = al.get(y);
                String check = ct1.getusername();
                if(check.equals(tocheck)){
                    if(!ct1.writeMsg(mensajecliente)){
                        al.remove(y);
                        display("Se desconecto el cliente "+ ct1.username + "se elimino de lista ");
                    }
                    encontrar = true;
                    break;
                }
                if(encontrar != true){
                    return false;    
                }
                else{
                    String mensajecliente = fecha + " " + mensaje + "\n";
                    System.out.println(mensajecliente);
                    for(int i = al.size(); --i>=0; ){
                        ClienteThread ct = al.get(i);
                        if(!ct.writeMsg(mensajeCliente)){
                            al.remove(i);
                            display("Se desconecto el cliente "+ ct.username + "se elimino de la lista");
                        }
                    }
                }
            }
        }
        return true;
    }
    synchronized void remove(int id){
        String desconectadoCliente = "";
        for(int i = 0; i < al.size(); ++i){
            ClienteThread ct = al.get(i);
            if(ct.id == id){
                desconectadoCliente = ct.getusername();
                al.remove(i);
                break;
            }
        }
        broadcast(notificaciones + desconectadoCliente + "Se fue del chat");
    }
    public static void main(String[] args){
        int numeropuerto = 1500;
        switch (args.length){
            case 1:
                try{
                    numeropuerto = Integer.parseInt(args[0]);
                }catch(Exception e){
                    System.out.println("Puerto invalido");
                    return;
                }
            case 0:
                break;
            default:
                System.out.println("Usa el puerto: " + numeropuerto);
                return;
        }
        Servidor server = new Servidor(numeropuerto);
        server.start();
    }
    class ClienteThread extends Thread{
        Socket socket;
        ObjectInputStream in;
        ObjectOutputStream os;
        int id;
        String username;
        ChatMessage cm;
        String dato;
        public ClienteThread(Socket socket){
            id = ++uniqueID;
            this.socket = socket;
            System.out.println("Creacion de los Hilo de los flujos Input/Output");
            try{
                in = new ObjectInputStream(socket.getInputStream());
                os = new ObjectOutputStream(socket.getOutputStream());
                username = (String)in.readObject();
            }catch(IOException e){
                System.out.println("Error al contenedor");
                System.out.println(e.getMessage());
            }catch(ClassNotFoundException ce){
                System.out.println("Error al no se encuentra la clase");
                System.out.println(ce.getMessage());
            }
            dato = new Date().toString() + "\n";
        }
        public String getusername(){
            return username;
        }
        public void setusername(String usrname){
            this.username = username;
        }
        
        public void run(){
            boolean keepgoing = true;
            while(keepgoing){
                try{
                    cm = (ChatMessage)in.readObject();
                }catch(IOException e){
                   display(username + "Error al leer el flujo " + e);
                    System.out.println(e.getMessage());
                    break;
                }catch(ClassNotFoundException ec){
                    System.out.println("Error no se encuentra la clase");
                    System.out.println(ec.getMessage());
                    break;
                }
                String mensajes = cm.getMessage();
                switch (cm.getType()){
                    case ChatMessage.MESSAGE:
                        boolean confirmacion = broadcast(username+ " : "+ mensajes);
                        if(confirmacion == false){
                            String msg = notificaciones + "No hay mensajes " + notificaciones;
                            writeMsg(msg);
                        }
                        break;
                    case ChatMessage.LOGOUT:
                        display(username + " Se ha desconectado adios :");
                        keepgoing = false;
                        break;
                    case ChatMessage.WHOISIN:
                        writeMsg("Se ha conectado un nuevo participante: "+ fecha.format(new Date())+ "\n");
                        for(int i = 0;i < al.size(); ++i){
                            ClienteThread ct = al.get(i);
                            writeMsg((i+1) + ")" + ct.username + " desde " +ct.dato);
                        }
                        break;
                }
                remove(id);
                close();
            }
        }
        private void close(){
            try{
                if(os != null){
                    os.close();
                }
            }catch(Exception e){
                try{
                    if(in != null){
                        in.close();
                    }
                }catch(Exception ed){
                    try{
                        if(socket != null){
                            socket.close();
                        }
                    }catch(Exception ev){
                        
                    }
                }
            }
        }
        private boolean writeMsg(String msg){
            if(!socket.isConnected()){
                close();
                return false;
            }
            try{
                os.writeObject(msg);
            }catch(IOException e){
                display(notificaciones + "Error al enviar el mensaje" + username + notificaciones);
                display(e.toString());
            }
            return true;
        }
    }
}
