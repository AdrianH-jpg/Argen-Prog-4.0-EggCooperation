/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guia.ejercicio.extra6;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Adrian H
 */
public class Guia5EjercicioExtra6 {

    public static void main(String[] args) {
        // Definimos el tamaño de la sopa de letras.
        int tamano = 20;
        int cantidadPalabras = 5; // Cantidad de palabras en la sopa.
        int tamanoPalabraMin = 3; // Tamaño mínimo de palabras.
        int tamanoPalabraMax = 5; // Tamaño máximo de palabras.

// Creamos una matriz para representar la sopa de letras.
        char[][] sopaDeLetras = new char[tamano][tamano];

// Importamos la clase Scanner para obtener entrada del usuario.
        Scanner input = new Scanner(System.in);

// Importamos la clase Random para generar números aleatorios.
        Random r = new Random();

// Creamos un arreglo para almacenar las palabras de la sopa.
        String[] palabras = new String[cantidadPalabras];

// Creamos un arreglo para verificar si una fila está ocupada.
        boolean[] ocupado = new boolean[tamano];

// Solicitamos al usuario que ingrese las palabras de la sopa.
        for (int i = 0; i < cantidadPalabras; i++) {
            String palabra;
            do {
                // Solicitamos palabras con un rango de longitud específico.
                System.out.print("Ingrese la palabra " + (i + 1) + " de " + tamanoPalabraMin + " a " + tamanoPalabraMax + " caracteres: ");
                palabra = input.nextLine().trim().toUpperCase();
            } while (palabra.length() < tamanoPalabraMin || palabra.length() > tamanoPalabraMax);
            palabras[i] = palabra;
        }

// Generamos una fila aleatoria para comenzar a colocar las palabras.
        int fila = r.nextInt(tamano);
        int columna = 0;

// Colocamos las palabras en la sopa de letras.
        for (int i = 0; i < cantidadPalabras; i++) {
            String palabra = palabras[i];
            for (int j = 0; j < palabra.length(); j++) {
                sopaDeLetras[fila][columna + j] = palabra.charAt(j);
            }
            ocupado[fila] = true;
            columna += palabra.length();
        }

// Rellenamos las filas no ocupadas con caracteres aleatorios.
        for (int i = 0; i < tamano; i++) {
            if (!ocupado[i]) {
                for (int j = 0; j < tamano; j++) {
                    sopaDeLetras[i][j] = (char) (r.nextInt(10) + '0'); // Generamos dígitos aleatorios.
                }
            }
        }

// Mostramos la sopa de letras en la consola.
        System.out.println("La sopa de letras es:");
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                System.out.print(sopaDeLetras[i][j] + " ");
            }
            System.out.println(); // Agregamos un salto de línea para separar las filas.
        }

    }
}
