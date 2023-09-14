/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guia3.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Adrian H
 */
public class Guia3Ejercicio2 {

    public static void main(String[] args) {
        /**
         * Crear un programa que pida una frase y si esa frase es igual a
         * “eureka” el programa pondrá un mensaje de Correcto, sino mostrará un
         * mensaje de Incorrecto. Nota: investigar la función equals() en Java.
         */

        Scanner input = new Scanner(System.in);

        String frase;

        System.out.println("Ingrese un numero");
        frase = input.next();

        if (frase.equals("eureka")) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }
}
