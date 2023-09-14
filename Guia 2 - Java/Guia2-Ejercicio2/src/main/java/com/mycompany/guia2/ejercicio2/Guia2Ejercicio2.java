/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guia2.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Adrian H
 */
public class Guia2Ejercicio2 {

    public static void main(String[] args) {
        // Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
        // Inicializo Scanner 
        Scanner input = new Scanner(System.in);
        //defino variable
        String palabra;
        //muestro mensaje por consola
        System.out.println("Ingrese su nombre : ");
        //ingreso la palabra por teclado
        palabra = input.next();
        //muestro el mensaje por pantalla
        System.out.println("Su nombre es : " + palabra);
    }
}
