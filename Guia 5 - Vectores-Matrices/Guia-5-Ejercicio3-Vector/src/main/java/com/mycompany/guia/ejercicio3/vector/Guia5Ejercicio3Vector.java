/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guia.ejercicio3.vector;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Adrian H
 */
public class Guia5Ejercicio3Vector {

    /**
     * @param args the command line arguments
     *
     * Recorrer un vector de N enteros contabilizando cuántos números son de 1
     * dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
     */
    public static void main(String[] args) {
        // Importamos la clase Scanner para obtener entrada del usuario desde la consola.
        Scanner input = new Scanner(System.in);

    // Importamos la clase Random para generar números aleatorios.
        Random r = new Random();

    // Solicitamos al usuario que ingrese el tamaño del vector.
        System.out.println("Ingrese el tamaño del vector: ");
        int n = input.nextInt();

    // Creamos un arreglo llamado "vector" de tamaño "n" para almacenar números enteros.
        int[] vector = new int[n];

    // Llenamos el arreglo con números aleatorios entre 0 y 99999 utilizando un bucle for.
        for (int i = 0; i < vector.length; i++) {
            vector[i] = r.nextInt(99999);
        }

    // Imprimimos el vector generado en una línea.
        System.out.print("Vector generado: ");
        int u = 0; // Contador de números de un dígito
        int d = 0; // Contador de números de dos dígitos
        int c = 0; // Contador de números de tres dígitos
        int m = 0; // Contador de números de cuatro dígitos
        int dm = 0; // Contador de números de cinco o más dígitos

        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");

            // Contamos los números según su cantidad de dígitos.
            if (vector[i] < 10) {
                u++;
            }
            if (vector[i] >= 10 && vector[i] < 100) {
                d++;
            }
            if (vector[i] >= 100 && vector[i] < 1000) {
                c++;
            }
            if (vector[i] >= 1000 && vector[i] < 10000) {
                m++;
            }
            if (vector[i] >= 10000) {
                dm++;
            }
        }
        System.out.println(""); // Agregamos un salto de línea para una mejor presentación.

    // Mostramos la cantidad de números de cada tipo de dígito.
        System.out.println("Cantidad de números de 1 dígito: " + u);
        System.out.println("Cantidad de números de 2 dígitos: " + d);
        System.out.println("Cantidad de números de 3 dígitos: " + c);
        System.out.println("Cantidad de números de 4 dígitos: " + m);
        System.out.println("Cantidad de números de 5 o más dígitos: " + dm);

    }
}
