/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guia.ejercicio1.vector;

/**
 *
 * @author Adrian H
 */
public class Guia5Ejercicio1Vector {
    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) {
        /**
         * TODO code application logic here Realizar un algoritmo que llene un
         * vector con los 100 primeros números enteros y los muestre por
         * pantalla en orden descendente.
         */
        
        // Declaración de un arreglo de enteros llamado "Vector" con 100 elementos.
        int[] Vector = new int[100];

        // Llenando el arreglo con valores del 0 al 99 usando un bucle for.
        for (int i = 0; i < 100; i++) {
            Vector[i] = i;
        }
        // Imprimiendo los elementos del arreglo en orden inverso usando un bucle for.
        for (int i = Vector.length - 1; i >= 0; i--) {
            System.out.println(Vector[i]);
        }
    }
}
