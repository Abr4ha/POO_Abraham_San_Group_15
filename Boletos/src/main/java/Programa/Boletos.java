/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Programa;

/**
 *
 * @author hyexzc
 */
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;
import javax.swing.*;
//import Peliculas.Lodo;
import java.awt.Image;

public class Boletos extends JFrame {
    //JFrame window1 = new JFrame("hola");
    //wiindo1.setLayout(null);
    //Lodo accion = new Lodo();
    //Object o;
    public Boletos(){
        setSize(800, 600);
        setTitle("Venta de Boletos");
        setLocationRelativeTo(null);
        setResizable(false);
        //this.getContentPane().setBackground(Color.WHITE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        componentes();
    }

    private void componentes(){
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.WHITE);
        JLabel txtescojer1 = new JLabel("Elije su película de tu preferencia:");
        txtescojer1.setBounds(10, 10, 200, 25);
        txtescojer1.setForeground(new Color(255, 255, 255));
        txtescojer1.setBackground(Color.RED);
        txtescojer1.setOpaque(true);
        panel.add(txtescojer1);
        
        JButton pelicula1 = new JButton("Spider-Man : No Way Home");
        pelicula1.setBounds(10, 290, 200, 25);
        panel.add(pelicula1);
        pelicula1.addActionListener(PeliSpiderman);
        
        JButton pelicula2 = new JButton("El lodo");
        pelicula2.setBounds(320, 55, 80, 25);
        panel.add(pelicula2);
        pelicula2.addActionListener(PeliLodo);
        
        JButton pelicula3 = new JButton("Querido Evan Hansen");
        pelicula3.setBounds(510, 55, 170, 25);
        panel.add(pelicula3);
        
        
        JButton pelicula4 = new JButton("Valentina");
        pelicula4.setBounds(260, 90, 90, 25);
        panel.add(pelicula4);
        
        JButton pelicula5 = new JButton("Tres pisos");
        pelicula5.setBounds(65, 354, 110, 25);
        panel.add(pelicula5);
        
        ImageIcon imagen = new ImageIcon("Spider_Man_310_420_.jpg");
        JLabel etiqueta1 = new JLabel();
        etiqueta1.setBounds(30, 45, 160, 220);
        //etiqueta1.setBackground(Color.RED);
        etiqueta1.setOpaque(true);
        etiqueta1.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(160, 220, Image.SCALE_SMOOTH)));
        panel.add(etiqueta1);
        this.getContentPane().add(panel);
    }
    ActionListener PeliSpiderman = new ActionListener(){
    @Override
    public void actionPerformed (ActionEvent event) {
            Spiderman();
    }
    };
    ActionListener PeliLodo = new ActionListener(){
    @Override
    public void actionPerformed (ActionEvent event) {
        Lodo();
    }
    };
  
    private void Spiderman(){
        JFrame funcion1 = new JFrame();
        funcion1.setSize(800, 600);
        funcion1.setTitle("Spider-Man : No Way Home");
        funcion1.setLocationRelativeTo(null);
        funcion1.setResizable(false);
        //this.getContentPane().setBackground(Color.WHITE);
        funcion1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        componentesFuncion();
        funcion1.setVisible(true);
    }
    private void Lodo(){
        JFrame funcion1 = new JFrame();
        funcion1.setSize(800, 600);
        funcion1.setTitle("El lodo");
        funcion1.setLocationRelativeTo(null);
        funcion1.setResizable(false);
        //this.getContentPane().setBackground(Color.WHITE);
        Boletos opc = new Boletos();
        funcion1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        funcion1.setVisible(true);
    }
    private void componentesFuncion(){
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.WHITE);
        JList ListFunciones = new JList();
        //Hello
        
    }

}