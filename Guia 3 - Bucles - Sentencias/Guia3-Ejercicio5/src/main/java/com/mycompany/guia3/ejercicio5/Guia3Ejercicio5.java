/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guia3.ejercicio5;

import java.util.Scanner;

/**
 *
 * @author Adrian H
 */
public class Guia3Ejercicio5 {

    public static void main(String[] args) {
        /**
         * Escriba un programa en el cual se ingrese un valor límite positivo,
         * y a continuación solicite números al usuario hasta que la suma de
         * los números introducidos supere el límite inicial.
         */
        Scanner input = new Scanner(System.in);

        int limit;
        int suma;

        System.out.println("Ingrese un numero limte");
        limit = input.nextInt();

        suma = 0;
        while (suma < limit) {
            System.out.println("Ingrese un numero");
            suma += input.nextInt();
        }
        System.out.println("La suma es de : " + suma);
    }
}
