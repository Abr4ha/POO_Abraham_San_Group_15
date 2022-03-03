/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vx_zas

*/
import java.io.*;
public class ChatMensaje implements Serializable{
    static final int WHOISIN = 0, MESSAGE = 1, LOGOUT = 2;
    private int type;
    private String message;
    ChatMensaje(int type, String message){
        this.type = type;
        this.message = message;
    }
    int getType(){
        return type;
    }
    String getMessage(){
        return message;
    }
}
