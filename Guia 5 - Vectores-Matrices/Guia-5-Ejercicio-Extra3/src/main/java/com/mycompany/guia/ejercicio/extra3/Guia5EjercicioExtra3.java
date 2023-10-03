/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guia.ejercicio.extra3;

import java.util.Random;

/**
 *
 * @author Adrian H
 */
public class Guia5EjercicioExtra3 {

    /**
     * @param args the command line arguments Crear una función rellene un
     * vector con números aleatorios, pasándole un arreglo por parámetro.
     * Después haremos otra función o procedimiento que imprima el vector.
     */
    public static void main(String[] args) {
        // Creamos un arreglo de enteros llamado "vector" con un tamaño de 10.
        int[] vector = new int[10];
        // Llamamos al método "rellenarVector" para llenar el arreglo con valores aleatorios.
        rellenarVector(vector);
        // Llamamos al método "imprimirVector" para mostrar el contenido del arreglo.
        imprimirVector(vector);
    }
    
// Método para llenar un arreglo con valores aleatorios.
    public static void rellenarVector(int[] vector) {
        Random r = new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i] = r.nextInt(100); // Generamos números aleatorios entre 0 y 99.
        }
    }

// Método para imprimir los elementos de un arreglo.
    public static void imprimirVector(int[] vector) {
        System.out.println("El vector es: ");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " "); // Imprimimos cada elemento del arreglo.
        }
    }
}
