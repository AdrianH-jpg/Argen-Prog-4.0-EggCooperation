/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guia.ejercicio.extra1;

import java.util.Scanner;

/**
 *
 * @author Adrian H
 */
public class Guia5EjercicioExtra1 {

    public static void main(String[] args) {
        /**
         * @param args the command line arguments Realizar un algoritmo que
         * calcule la suma de todos los elementos de un vector de tamaño N, con
         * los valores ingresados por el usuario.
         */
        // Importamos la clase Scanner para obtener entrada del usuario desde la consola.
        Scanner input = new Scanner(System.in);
        // Declaramos una variable "N" para almacenar el tamaño del vector.
        int N;
        // Solicitamos al usuario que ingrese el tamaño del vector.
        System.out.print("Ingrese el tamaño del vector: ");
        N = input.nextInt();
        // Creamos un arreglo llamado "vector" de tamaño "N" para almacenar enteros.
        int[] vector = new int[N];
        // Inicializamos una variable "suma" para calcular la suma de los elementos del vector.
        int suma = 0;
        // Solicitamos al usuario que ingrese los elementos del vector uno por uno.
        System.out.println("Ingrese los elementos del vector: ");
        for (int i = 0; i < N; i++) {
            vector[i] = input.nextInt();
            // Sumamos cada elemento al valor acumulado en "suma".
            suma += vector[i];
        }
        // Mostramos la suma de los elementos del vector.
        System.out.println("La suma de los elementos del vector es: " + suma);

    }
}
