/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentas;

/**
 *
 * @author kevin
 */
public class Calculadora {

    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {

        Calculadora ejemplo = new Calculadora();
        System.out.println("Suma:" + ejemplo.sumar(5, 3));
        System.out.println("Resta:"+ ejemplo.restar(8, 3));

    }

    /**
     * Este Medodo Suma 2 numeros
     * @param num1 dato tipo entero
     * @param num2 dato tipo entero
     * @return el valor de la suma
     */
    public int sumar(int num1, int num2) {
        return (num1 + num2);
    }

    /**
     * 
     * @param num1
     * @param num2
     * @return
     */
    public int restar(int num1, int num2) {
        return (num1 - num2);
    }

}
