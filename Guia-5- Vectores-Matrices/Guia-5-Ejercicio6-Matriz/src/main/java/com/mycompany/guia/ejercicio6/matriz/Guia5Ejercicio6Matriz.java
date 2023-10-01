/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guia.ejercicio6.matriz;

import java.util.Scanner;

/**
 *
 * @author Adrian H
 */
public class Guia5Ejercicio6Matriz {
    /**
     * @param args the command line arguments
     * Un cuadrado mágico 3 x 3 es una
     * matriz 3 x 3 formada por números del 1 al 9 donde la suma de sus filas,
     * sus columnas y sus diagonales son idénticas. Crear un programa que
     * permita introducir un cuadrado por teclado y determine si este cuadrado
     * es mágico o no. El programa deberá comprobar que los números introducidos
     * son correctos, es decir, están entre el 1 y el 9.
     */
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
        int[][] cuadrado = new int[3][3];
        int suma = 0;

        // Lectura del cuadrado
        System.out.println("Introduce los números del cuadrado mágico (del 1 al 9):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + (i + 1) + "][" + (j + 1) + "]: ");
                cuadrado[i][j] = input.nextInt();
                // Comprobar que los números introducidos son correctos
                if (cuadrado[i][j] < 1 || cuadrado[i][j] > 9) {
                    System.out.println("Error: los números deben estar entre 1 y 9.");
                    return;
                }
            }
        }

        // Comprobar si el cuadrado es mágico
        for (int i = 0; i < 3; i++) {
            suma += cuadrado[0][i];
        }

        // Comprobar filas
        for (int i = 1; i < 3; i++) {
            int sumaFila = 0;
            for (int j = 0; j < 3; j++) {
                sumaFila += cuadrado[i][j];
            }
            if (sumaFila != suma) {
                System.out.println("No es un cuadrado mágico.");
                return;
            }
        }

        // Comprobar columnas
        for (int i = 0; i < 3; i++) {
            int sumaColumna = 0;
            for (int j = 0; j < 3; j++) {
                sumaColumna += cuadrado[j][i];
            }
            if (sumaColumna != suma) {
                System.out.println("No es un cuadrado mágico.");
                return;
            }
        }

        // Comprobar diagonales
        if (cuadrado[0][0] + cuadrado[1][1] + cuadrado[2][2] != suma
                || cuadrado[0][2] + cuadrado[1][1] + cuadrado[2][0] != suma) {
            System.out.println("No es un cuadrado mágico.");
            return;
        }

        // Si llegamos hasta aquí es porque el cuadrado es mágico
        System.out.println("Es un cuadrado mágico.");
    }
    
}
