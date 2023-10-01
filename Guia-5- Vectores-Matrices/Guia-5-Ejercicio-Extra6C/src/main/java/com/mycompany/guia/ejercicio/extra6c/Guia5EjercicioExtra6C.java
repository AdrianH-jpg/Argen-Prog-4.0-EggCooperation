/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.guia.ejercicio.extra6c;

import java.util.Scanner;

/**
 *
 * @author Adrian H
 */
public class Guia5EjercicioExtra6C {

    public static void main(String[] args) {
        // Importamos la clase Scanner para obtener entrada del usuario desde la consola.
        Scanner input = new Scanner(System.in);

// Creamos una matriz de cadenas para representar la sopa de letras.
        String[][] sopa = new String[20][20];

// Creamos un arreglo de cadenas para almacenar las palabras ingresadas por el usuario.
        String[] palabra = new String[5];

// Creamos un arreglo de banderas para verificar si una fila está ocupada.
        boolean[] bandera = new boolean[20];

// Inicializamos la matriz de la sopa de letras con cadenas vacías.
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                sopa[i][j] = "";
            }
        }

        int fila, columna;

// Solicitamos al usuario que ingrese 5 palabras de entre 3 y 5 caracteres.
        for (int i = 0; i < 5; i++) {
            do {
                System.out.print("Ingrese la " + (i + 1) + "º palabra de entre 3 y 5 caracteres: ");
                palabra[i] = input.nextLine();
            } while (palabra[i].length() > 5 || palabra[i].length() < 3);
        }

// Colocamos las palabras en la sopa de letras en filas aleatorias.
        for (int i = 0; i < 5; i++) {
            do {
                fila = (int) (Math.random() * 20);
            } while (bandera[fila]);
            bandera[fila] = true;

            columna = (int) (Math.random() * (20 - palabra[i].length() + 1));

            for (int j = 0; j < palabra[i].length(); j++) {
                sopa[fila][columna + j] = palabra[i].substring(j, j + 1);
            }
        }

// Rellenamos los espacios no utilizados con números aleatorios del 0 al 9.
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if ("".equals(sopa[i][j])) {
                    sopa[i][j] = String.valueOf((int) (Math.random() * 10));
                }
            }
        }

// Imprimimos la sopa de letras en la consola.
        System.out.println("Sopa de letras:");
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(sopa[i][j] + " "); // Imprimimos cada elemento de la sopa.
            }
            System.out.println(); // Agregamos un salto de línea para separar las filas.
        }

    }
}
