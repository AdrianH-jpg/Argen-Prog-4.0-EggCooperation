/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guia.ejercicio2.vector;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Adrian H
 */
public class Guia5Ejercicio2Vector {

    /**
     * @param args the command line arguments Realizar un algoritmo que llene un
     * vector de tamaño N con valores aleatorios y le pida al usuario un número
     * a buscar en el vector. El programa mostrará dónde se encuentra el numero
     * y si se encuentra repetido
     */
    public static void main(String[] args) {
        /**
         * TODO code application logic here Realizar un algoritmo que llene un
         * vector de tamaño N con valores aleatorios y le pida al usuario un
         * número a buscar en el vector. El programa mostrará dónde se encuentra
         * el numero y si se encuentra repetido
         */

        // Importamos la clase Scanner para obtener entrada del usuario desde la consola.
        Scanner leer = new Scanner(System.in);

    // Importamos la clase Random para generar números aleatorios.
        Random r = new Random();

    // Solicitamos al usuario que ingrese el tamaño del vector.
        System.out.print("Ingrese el tamaño del vector: ");
        int n = leer.nextInt();

    // Creamos un arreglo llamado "vector" de tamaño "n" para almacenar números enteros.
        int[] vector = new int[n];

    // Llenamos el arreglo con números aleatorios entre 0 y 99 utilizando un bucle for.
        for (int i = 0; i < n; i++) {
            vector[i] = r.nextInt(100);
        }

    // Imprimimos el vector generado en una línea.
        System.out.print("Vector generado: ");
        for (int i = 0; i < n; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println(); // Agregamos un salto de línea para una mejor presentación.

    // Solicitamos al usuario que ingrese el número que desea buscar en el arreglo.
        System.out.println("Ingrese el número a buscar: ");
        int num = leer.nextInt();

    // Variable "count" se utiliza para contar cuántas veces se encuentra el número en el arreglo.
        int count = 0;

    // Recorremos el arreglo para buscar el número ingresado y mostramos la posición si se encuentra.
        for (int i = 0; i < n; i++) {
            if (vector[i] == num) {
                count++;
                System.out.println("El número " + num + " se encuentra en la posición " + i + " del vector.");
            }
        }

    // Mostramos el resultado según cuántas veces se encontró el número.
        switch (count) {
            case 0:
                System.out.println("El número " + num + " no se encuentra en el vector.");
                break;
            case 1:
                System.out.println("El número " + num + " aparece una sola vez en el vector.");
                break;
            default:
                System.out.println("El número " + num + " aparece " + count + " veces en el vector.");
                break;
        }

    }
}
