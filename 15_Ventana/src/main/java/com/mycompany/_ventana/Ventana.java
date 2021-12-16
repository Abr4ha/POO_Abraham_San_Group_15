/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._ventana;

/**
 *
 * @author hyexzc
 */
import java.awt.Font;
import java.awt.event.*;
import java.util.EventListener;
import javax.swing.*;
public class Ventana extends EventListener{

    String Usuario, passwordUser;
    int count = 0;
    public static void main(String[] args){
        JFrame ventana = new JFrame("Acesso");
        ventana.setSize(400, 165);
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(false);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        ventana.add(panel);
        agregarComponente(panel);
        ventana.setVisible(true);
    }
    private static void agregarComponente(JPanel panel){
        panel.setLayout(null);
        JLabel userlabel = new JLabel("Nombre de usuario : ");
        userlabel.setBounds(10, 10, 140, 25);
        panel.add(userlabel);
        JTextField usertext = new JTextField(1);
        usertext.setBounds(160, 10, 160, 25);
        panel.add(usertext);
        JLabel userpassword = new JLabel("Password : ");
        userpassword.setBounds(10, 45, 80, 25);
        panel.add(userpassword);
        JPasswordField passtext = new JPasswordField(1);
        passtext.setBounds(160, 45, 160, 25);
        panel.add(passtext);
        JButton loginbutton = new JButton("Iniciar Sesion.");
        loginbutton.setBounds(10, 90, 120, 25);
        loginbutton.addActionListener((ActionEvent e) -> {
            String usuario=usertext.getText();
            String passwordUser1 = passtext.getText();
            if (usuario.equals("Usuario1") && passwordUser1.equals("clave123")) {
                panelBienvenida();
            } else {
                JOptionPane.showMessageDialog(null, "Usuario o Contraseña no valida");
            }
        });
        panel.add(loginbutton);
        JButton registroButton = new JButton("Registrarse");
        registroButton.setBounds(180, 90, 120, 25);
        registroButton.addActionListener((ActionEvent e) -> {
            RegistrarUsuario();
        });
        panel.add(registroButton);
    }
    private static void RegistrarUsuario() {
    }
    private static void panelBienvenida(){
        JFrame ventana2 = new JFrame("Bienvenido");
        ventana2.setSize(300, 300);
        ventana2.setLocationRelativeTo(null);
        //ventana2.setResizable(false);
        ventana2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        ventana2.add(panel);
        Bienvenida(panel);
        ventana2.setVisible(true);
    }
    private static void Bienvenida(JPanel panel) {
        panel.setLayout(null);
        JLabel texto1 = new JLabel("Bienvendido", JLabel.CENTER);
        texto1.setBounds(0, 0, 160, 25);
        panel.add(texto1);
        JButton cerarSesion = new JButton("Registrarse");
        cerarSesion.setBounds(180, 90, 120, 25);
        cerarSesion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
    }
        
    public static void UsuarioNoValido(){
            JOptionPane.showMessageDialog(null, "Usuario o Contraseña no valida");
        }
    
}
