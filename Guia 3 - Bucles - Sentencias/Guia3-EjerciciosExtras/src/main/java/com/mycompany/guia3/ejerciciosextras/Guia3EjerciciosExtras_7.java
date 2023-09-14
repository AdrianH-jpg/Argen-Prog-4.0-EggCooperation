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
public class Guia3EjerciciosExtras_7 {

    public static void main(String[] args) {
        /**
         * Realice un programa que calcule y visualice el valor máximo, el valor
         * mínimo y el promedio de n números (n>0). El valor de n se solicitará
         * al principio del programa y los números serán introducidos por el
         * usuario. Realice dos versiones del programa, una usando el bucle
         * “while” y otra con el bucle “do - while”.
         */

        Scanner input = new Scanner(System.in);

        int num;
        int n;
        int i = 0;
        int sum = 0;
        int max = 0;
        int min = 99999;
        System.out.print("Introduzca el número de elementos: ");
        n = input.nextInt();
        do {
            System.out.print("Introduzca un número ENTERO : ");
            num = input.nextInt();
            sum += num;
            max = Math.max(max, num);
            min = Math.min(min, num);
            i++;
        } while (n != i);
        double prom = sum / n;
        System.out.println("Valor máximo: " + max);
        System.out.println("Valor mínimo: " + min);
        System.out.println("Promedio: " + prom);
    }
}
