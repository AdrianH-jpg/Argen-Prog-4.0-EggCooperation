/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guia.ejercicio4.matriz;

import java.util.Random;

/**
 *
 * @author Adrian H
 */
public class Guia5Ejercicio4Matriz {

    /**
     * @param args the command line arguments Realizar un programa que rellene
     * un matriz de 4 x 4 de valores aleatorios y muestre la traspuesta de la
     * matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
     * cambiando sus filas por columnas (o viceversa).
     */
    public static void main(String[] args) {
        // Importamos la clase Random para generar números aleatorios.
        Random r = new Random();

    // Creamos dos matrices (vectorA y vectorB) de tamaño 4x4 para almacenar enteros.
        int[][] vectorA = new int[4][4];
        int[][] vectorB = new int[4][4];

    // Llenamos ambas matrices con números aleatorios entre 0 y 99 usando dos bucles for anidados.
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int a = r.nextInt(100);
                vectorA[i][j] = a;
                vectorB[j][i] = a; // Transponemos la matriz, intercambiando filas y columnas.
            }
        }

    // Imprimimos la matriz vectorA.
        System.out.println("Vector A");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[ " + vectorA[i][j] + " ]");
            }
            System.out.println(""); // Agregamos un salto de línea para separar filas.
        }

    // Imprimimos la matriz vectorB.
        System.out.println("Vector B");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[ " + vectorB[i][j] + " ]");
            }
            System.out.println(""); // Agregamos un salto de línea para separar filas.
        }

    }
}
