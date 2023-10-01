/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guia.ejercicio.extra5;

import java.util.Random;

/**
 *
 * @author Adrian H
 */
public class Guia5EjercicioExtra5 {

    /**
     * @param args the command line arguments Realizar un programa que llene una
     * matriz de tamaño NxM con valores aleatorios y muestre la suma de sus
     * elementos.
     */
    public static void main(String[] args) {
        // Definimos el número de filas y columnas de la matriz.
        int N = 3; // Número de filas
        int M = 4; // Número de columnas

// Creamos una matriz de enteros de tamaño N x M.
        int[][] matriz = new int[N][M];
// Importamos la clase Random para generar números aleatorios.
        Random r = new Random();
// Inicializamos una variable "suma" para calcular la suma de los elementos de la matriz.
        int suma = 0;
// Llenamos la matriz con valores aleatorios entre 0 y 9.
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matriz[i][j] = r.nextInt(10); // Generamos números aleatorios entre 0 y 9.
                suma += matriz[i][j]; // Agregamos cada elemento a la suma.
            }
        }
// Mostramos la matriz en la consola.
        System.out.println("La matriz es:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(matriz[i][j] + " "); // Imprimimos cada elemento de la matriz.
            }
            System.out.println(); // Agregamos un salto de línea para separar las filas.
        }
// Mostramos la suma de los elementos de la matriz.
        System.out.println("La suma de los elementos de la matriz es: " + suma);

    }
}
