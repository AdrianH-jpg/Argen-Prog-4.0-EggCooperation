/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guia.ejercicio.extra6b;

import java.util.Scanner;

/**
 *
 * @author Adrian H
 */
public class Guia5EjercicioExtra6B {

    public static void main(String[] args) {
        // Importamos la clase Scanner para obtener entrada del usuario desde la consola.
        Scanner input = new Scanner(System.in);

// Creamos un arreglo para almacenar las palabras ingresadas por el usuario.
        String[] palabras = new String[5];

// Creamos una matriz para representar la sopa de letras.
        char[][] sopa = new char[20][20];

// Solicitamos al usuario que ingrese 5 palabras y las guardamos en el arreglo.
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese palabra " + (i + 1) + ": ");
            palabras[i] = input.next().toUpperCase();

            // Validamos que las palabras tengan entre 3 y 5 caracteres.
            while (palabras[i].length() < 3 || palabras[i].length() > 5) {
                System.out.println("La palabra debe tener entre 3 y 5 caracteres");
                System.out.print("Ingrese palabra " + (i + 1) + ": ");
                palabras[i] = input.next().toUpperCase();
            }
        }

// Colocamos las palabras en la sopa de letras en filas y columnas aleatorias.
        for (int i = 0; i < 5; i++) {
            String palabra = palabras[i];
            int filaAleatoria = (int) (Math.random() * 20);
            int columnaAleatoria = (int) (Math.random() * (20 - palabra.length() + 1));
            for (int j = 0; j < palabra.length(); j++) {
                sopa[filaAleatoria][columnaAleatoria + j] = palabra.charAt(j);
            }
        }

// Rellenamos los espacios no utilizados con números aleatorios del 0 al 9.
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (sopa[i][j] == 0) {
                    sopa[i][j] = (char) ((int) (Math.random() * 10) + 48);
                }
            }
        }

// Imprimimos la sopa de letras en la consola.
        System.out.println("Sopa de letras:");
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(sopa[i][j] + " "); // Imprimimos cada caracter de la sopa.
            }
            System.out.println(); // Agregamos un salto de línea para separar las filas.
        }

    }
}
