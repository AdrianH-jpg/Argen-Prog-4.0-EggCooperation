/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guia3.ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Adrian H
 */
public class Guia3Ejercicio4 {

    public static void main(String[] args) {
        /**
         * Escriba un programa que pida una frase o palabra y valide si la
         * primera letra de esa frase es una ‘A’. Si la primera letra es una
         * ‘A’, se deberá de imprimir un mensaje por pantalla que diga
         * “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
         * Nota: investigar la función Substring y equals() de Java.
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Ingresa una frase:");
        String frase = input.nextLine();
        String subcadena = frase.substring(0, 1);
        if (subcadena.equals("A")) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }
}
