/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guia.ejercicio5.matriz;

import java.util.Random;

/**
 *
 * @author Adrian H
 */
public class Guia5Ejercicio5Matriz {

    /**
     * @param args the command line arguments Realice un programa que compruebe
     * si una matriz dada es antisimétrica. Se dice que una matriz A es
     * antisimétrica cuando ésta es igual a su propia traspuesta, pero cambiada
     * de signo. Es decir, A es antisimétrica si A = -AT. La matriz traspuesta
     * de una matriz A se denota por AT y se obtiene cambiando sus filas por
     * columnas (o viceversa).
     */
    public static void main(String[] args) {
        // Importamos la clase Random para generar números aleatorios.
        Random r = new Random();

// Creamos dos matrices (vectorA y vectorB) de tamaño 3x3 para almacenar enteros.
        int[][] vectorA = new int[3][3];
        int[][] vectorB = new int[3][3];

// Llenamos ambas matrices con valores específicos para que sean matrices antisimétricas.
        vectorA[0][0] = 0;
        vectorA[0][1] = -2;
        vectorA[0][2] = 4;
        vectorA[1][0] = 2;
        vectorA[1][1] = 0;
        vectorA[1][2] = 2;
        vectorA[2][0] = -4;
        vectorA[2][1] = -2;
        vectorA[2][2] = 0;

        vectorB[0][0] = 0;
        vectorB[0][1] = 2;
        vectorB[0][2] = -4;
        vectorB[1][0] = -2;
        vectorB[1][1] = 0;
        vectorB[1][2] = -2;
        vectorB[2][0] = 4;
        vectorB[2][1] = 2;
        vectorB[2][2] = 0;

// Variable "e" se inicializa como verdadera (true) para verificar si las matrices son antisimétricas.
        Boolean e = true;

// Comparamos los elementos de ambas matrices para determinar si son antisimétricas.
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (vectorA[i][j] != (vectorB[i][j] * -1)) {
                    e = false; // Si encontramos un elemento que no cumple con la condición, cambiamos "e" a falso.
                }
            }
            if (e == false) {
                break; // Si ya sabemos que no son antisimétricas, no es necesario seguir revisando.
            }
        }

// Mostramos un mensaje indicando si las matrices son antisimétricas o no.
        if (e) {
            System.out.println("Las matrices son antisimétricas.");
        } else {
            System.out.println("Las matrices no son antisimétricas.");
        }

    }
}
