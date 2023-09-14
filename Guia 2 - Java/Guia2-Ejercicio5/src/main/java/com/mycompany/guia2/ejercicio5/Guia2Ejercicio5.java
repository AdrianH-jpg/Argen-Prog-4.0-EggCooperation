/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guia2.ejercicio5;

import java.util.Scanner;

/**
 *
 * @author Adrian H
 */
public class Guia2Ejercicio5 {

    public static void main(String[] args) {
        // Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número.
        // Nota: investigar la función Math.sqrt().
        //inicio el Scanner para ingresar los datos por teclado
        Scanner input = new Scanner(System.in);
        //defino la variable y le asigno el valor 0
        int num = 0;
        //muestro un mensaje por pantalla solicitando el ingreso de datos
        System.out.println("Ingrese un numero ; ");
        //asigno a la variable los datos ingresados por teclado
        num = input.nextInt();
        //muestro los resultados por consola
        System.out.println("El Doble es : " + Math.scalb(num, 1));        
        System.out.println("El Triple es : " + Math.scalb(num, 2));
        System.out.println("La Raiz Cuadrada es : " + Math.scalb(num, num));
    }
}
