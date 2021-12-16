/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._calculadora;

/**
 *
 * @author hyexzc
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Interfaz extends JFrame implements ActionListener{
    JTextField txtnum1;
    JTextField txtnum2;
    JButton btnresta;
    JButton btnsuma;
    JButton btnproducto;
    JButton btndivision;
    JLabel numero1;
    JLabel numero2;
    JLabel resultado;
    JLabel mostrarresultado;
    JPanel panel = (JPanel)this.getContentPane();
    Operaciones op = new Operaciones();
    double num1 ,num2;
    public Interfaz(){
        setLayout(null);
        setLocation(100, 80);
        setResizable(false);
        setSize(250, 210);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        componentes();
    }
    private void componentes() {
        panel.setLayout(null);
        numero1 = new JLabel("Numero 1");
        numero1.setBounds(10, 10, 60, 25);
        panel.add(numero1);
        numero2 = new JLabel("Numero 2");
        numero2.setBounds(10, 45, 60, 25);
        panel.add(numero2);
        resultado = new JLabel("Resultado");
        resultado.setBounds(10, 80, 60, 25);
        panel.add(resultado);
        mostrarresultado = new JLabel("");
        mostrarresultado.setBounds(80, 80, 100, 25);
        panel.add(mostrarresultado);
        txtnum1 = new JTextField();
        txtnum1.setBounds(100, 10, 70, 25);
        panel.add(txtnum1);
        txtnum2 = new JTextField();
        txtnum2.setBounds(100, 45, 70, 25);
        panel.add(txtnum2);
        btnsuma = new JButton("+");
        btnsuma.setBounds(10, 115, 45, 45);
        panel.add(btnsuma);
        btnsuma.addActionListener(this);
        btnresta = new JButton("-");
        btnresta.setBounds(65, 115, 45, 45);
        panel.add(btnresta);
        btnresta.addActionListener(this);
        btnproducto = new JButton("*");
        btnproducto.setBounds(120, 115, 45, 45);
        panel.add(btnproducto);
        btnproducto.addActionListener(this);
        btndivision = new JButton("/");
        btndivision.setBounds(175, 115, 45, 45);
        panel.add(btndivision);
        btndivision.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent event) {
        if(event.getSource()==btnsuma ){
            num1 = Double.parseDouble(txtnum1.getText());
            op.setNum1(num1);
            num2 = Double.parseDouble(txtnum2.getText());
            op.setNum2(num2);
            mostrarresultado.setText(String.valueOf(op.suma()));
        }
        if(event.getSource()==btnresta ){
            num1 = Double.parseDouble(txtnum1.getText());
            op.setNum1(num1);
            num2 = Double.parseDouble(txtnum2.getText());
            op.setNum2(num2);
            mostrarresultado.setText(String.valueOf(op.resta()));
        }
        if(event.getSource()==btnproducto ){
            num1 = Double.parseDouble(txtnum1.getText());
            op.setNum1(num1);
            num2 = Double.parseDouble(txtnum2.getText());
            op.setNum2(num2);
            mostrarresultado.setText(String.valueOf(op.producto()));
        }
        if(event.getSource()==btndivision ){
            num1 = Double.parseDouble(txtnum1.getText());
            op.setNum1(num1);
            num2 = Double.parseDouble(txtnum2.getText());
            op.setNum2(num2);
            mostrarresultado.setText(String.valueOf(op.division()));
        }
    }    
}
