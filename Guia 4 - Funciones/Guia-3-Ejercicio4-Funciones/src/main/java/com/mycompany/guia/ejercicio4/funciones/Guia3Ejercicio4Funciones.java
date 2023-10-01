/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guia.ejercicio4.funciones;

import java.util.Scanner;

/**
 *
 * @author Adrian H
 */
public class Guia3Ejercicio4Funciones {

    public static void main(String[] args) {
        // TODO code application logic here

        /**
         * Crea una aplicación que nos pida un número por teclado y con una
         * función se lo pasamos por parámetro para que nos indique si es o no
         * un número primo, debe devolver true si es primo, sino false. Un
         * número primo es aquel que solo puede dividirse entre 1 y sí mismo.
         * Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin
         * embargo, 17 si es primo.
         */
        // Importamos la clase Scanner para obtener entrada del usuario desde la consola.
        Scanner input = new Scanner(System.in);

        // Solicitamos al usuario que ingrese un número.
        System.out.println("Ingrese un número: ");
        int num = input.nextInt();

    // Llamamos a la función "esPrimo" para verificar si el número ingresado es primo o no.
        if (esPrimo(num)) {
            System.out.println(num + " es primo.");
        } else {
            System.out.println(num + " no es primo.");
        }

    }
    
    // Función para determinar si un número es primo.
    public static boolean esPrimo(int num) {
        // Comprobamos si el número es menor o igual a 1, en cuyo caso no es primo.
        if (num <= 1) {
            return false;
        }

        // Utilizamos un bucle for para verificar si el número es divisible por algún número entre 2 y num/2.
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                // Si es divisible por algún número distinto de 1 y sí mismo, no es primo.
                return false;
            }
        }

        // Si el bucle completo no encuentra divisores, el número es primo.
        return true;
    }
}




