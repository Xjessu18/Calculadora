/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;

/**
 *
 * @author ALUMNO
 */
public class Calculadora {
    public int operador1;
    public int operador2;
    public double deoperador1;
    public double deoperador2; 
    public int sumar(int poperador1, int poperador2){
        return poperador1+poperador2;
    }
    public int sumar(int poperador1, int poperador2, int poperador3){
        return poperador1+poperador2+poperador3;
    }
    public double sumar(double poperador1,double poperador2){
        return poperador1 + poperador2;
    }
    
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Calculadora cal = new Calculadora();
        System.out.println("Suma de dos enteros");
        System.out.println( cal.sumar(12, 90));
        System.out.println("Suma de tres enteros");
        System.out.println(cal.sumar(12, 90, 125));
        System.out.println("Suma de dos double");
        System.out.println(cal.sumar(1.5, 2.87));
    }
}
