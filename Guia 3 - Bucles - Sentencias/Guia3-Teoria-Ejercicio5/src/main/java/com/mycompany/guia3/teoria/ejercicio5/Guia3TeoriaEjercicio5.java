/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guia3.teoria.ejercicio5;

import java.util.Scanner;

/**
 *
 * @author Adrian H
 */
public class Guia3TeoriaEjercicio5 {

    public static void main(String[] args) {
        /**
         * Ejercicio 10 Realizar un programa que lea 4 números (comprendidos
         * entre 1 y 20) e imprima el número ingresado seguido de tantos
         * asteriscos como indique su valor. Por ejemplo: 5 ***** 3 *** 11
         * *********** 2 **
         */

        Scanner input = new Scanner(System.in);

        int num1, num2, num3, num4;

        System.out.println("Ingrese 4 numeros : ");
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();
        num4 = input.nextInt();

        for (int i = 0; i < 1; i++) {
            System.out.print(num1);
            for (int j = 0; j < num1; j++) {
                System.out.print("*");
            }
        }
        System.out.println("");
        for (int i = 0; i < 1; i++) {
            System.out.print(num2);
            for (int j = 0; j < num2; j++) {
                System.out.print("*");
            }
        }
        System.out.println("");
        for (int i = 0; i < 1; i++) {
            System.out.print(num3);
            for (int j = 0; j < num3; j++) {
                System.out.print("*");
            }
        }
        System.out.println("");
        for (int i = 0; i < 1; i++) {
            System.out.print(num4);
            for (int j = 0; j < num4; j++) {
                System.out.print("*");
            }
        }
        System.out.println("");
    }
}
