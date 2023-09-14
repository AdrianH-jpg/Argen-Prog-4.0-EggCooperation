/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guia3.ejerciciosextras;

import java.util.Scanner;

/**
 *
 * @author Adrian H
 */
public class Guia3EjerciciosExtras_10 {

    public static void main(String[] args) {
        /**
         * Realice un programa para que el usuario adivine el resultado de una
         * multiplicación entre dos números generados aleatoriamente entre 0 y
         * 10. El programa debe indicar al usuario si su respuesta es o no
         * correcta. En caso que la respuesta sea incorrecta se debe permitir al
         * usuario ingresar su respuesta nuevamente. Para realizar este
         * ejercicio investigue como utilizar la función Math.random() de Java.
         */

        Scanner input = new Scanner(System.in);

        int respuesta = 0;

        int num1 = (int) (Math.random() * 11);
        int num2 = (int) (Math.random() * 11);

        System.out.println("Numero aleatorio 1 " + num1);
        System.out.println("Numero aleatorio 2 " + num2);

        while (respuesta != (num1 * num2)) {
            System.out.println("Ingrese un nuemero entre 1 y 10 : ");
            respuesta = input.nextInt();

            if (respuesta == (num1 * num2)) {
                System.out.println("Su respuesta es CORRECTA !");
            } else {
                System.out.println("Su respuesta es INCORRECTA");
            }
        }

    }
}
