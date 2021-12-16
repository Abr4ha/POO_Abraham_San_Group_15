/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._calculadora;

/**
 *
 * @author hyexzc
 */
public class Operaciones {
    private double num1;
    private double num2;
    public Operaciones(){
    }
    public Operaciones(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
    public double suma(){
        return num1 + num2;
    }
    
   public double resta(){
        return num1-num2;
    }
   public double producto(){
        return num1 * num2;
    }
   public double division(){
        return num1/num2;
    }
}
