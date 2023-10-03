/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guia.ejercicio.extra2;

import java.util.Scanner;

/**
 *
 * @author Adrian H
 */
public class Guia5EjercicioExtra2 {

    /**
     * @param args the command line arguments Escriba un programa que averigüe
     * si dos vectores de N enteros son iguales (la comparación deberá detenerse
     * en cuanto se detecte alguna diferencia entre los elementos).
     */
    public static void main(String[] args) {
        // Importamos la clase Scanner para obtener entrada del usuario desde la consola.
        Scanner input = new Scanner(System.in);

// Declaramos una variable "N" para almacenar el tamaño de los vectores.
        int N;

// Solicitamos al usuario que ingrese el tamaño de los vectores.
        System.out.print("Ingrese el tamaño de los vectores: ");
        N = input.nextInt();

// Creamos dos arreglos llamados "vector1" y "vector2" de tamaño "N" para almacenar enteros.
        int[] vector1 = new int[N];
        int[] vector2 = new int[N];

// Inicializamos una variable "iguales" como verdadera (true) para verificar si los vectores son iguales.
        boolean iguales = true;

// Solicitamos al usuario que ingrese los elementos del primer vector uno por uno.
        System.out.println("Ingrese los elementos del primer vector: ");
        for (int i = 0; i < N; i++) {
            vector1[i] = input.nextInt();
        }

// Solicitamos al usuario que ingrese los elementos del segundo vector uno por uno.
        System.out.println("Ingrese los elementos del segundo vector: ");
        for (int i = 0; i < N; i++) {
            vector2[i] = input.nextInt();
        }

// Comparamos los elementos de ambos vectores para verificar si son iguales.
        for (int i = 0; i < N; i++) {
            if (vector1[i] != vector2[i]) {
                iguales = false;
                break; // Si encontramos elementos diferentes, no es necesario seguir comparando.
            }
        }

// Mostramos un mensaje indicando si los vectores son iguales o diferentes.
        if (iguales) {
            System.out.println("Los vectores son iguales.");
        } else {
            System.out.println("Los vectores son diferentes.");
        }

    }
}
