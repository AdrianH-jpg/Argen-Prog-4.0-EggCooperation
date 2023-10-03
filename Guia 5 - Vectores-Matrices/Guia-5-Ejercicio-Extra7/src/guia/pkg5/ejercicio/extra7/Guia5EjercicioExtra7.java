/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia.pkg5.ejercicio.extra7;

import java.util.Scanner;

/**
 *
 * @author Adrian H
 */
public class Guia5EjercicioExtra7 {

    /**
     * @param args the command line arguments Realizar un programa que complete
     * un vector con los N primeros números de la sucesión de Fibonacci.
     * Recordar que la sucesión de Fibonacci es la sucesión de los siguientes
     * números: 1, 1, 2, 3, 5, 8, 13, 21, 34, ... Donde cada uno de los números
     * se calcula sumando los dos anteriores a él. Por ejemplo: La sucesión del
     * número 2 se calcula sumando (1+1) Análogamente, la sucesión del número 3
     * es (1+2), Y la del 5 es (2+3), Y así sucesivamente… La sucesión de
     * Fibonacci se puede formalizar de acuerdo a la siguiente fórmula:
     * Fibonaccin = Fibonaccin-1 + Fibonaccin-2 para todo n>1 Fibonaccin = 1
     * para todo n <= 1 Por lo tanto, si queremos calcular el término “n”
     * debemos escribir una función que reciba como parámetro el valor de “n” y
     * que calcule la serie hasta llegar a ese valor.
     */
    public static void main(String[] args) {
        // Importamos la clase Scanner para obtener entrada del usuario desde la consola.
        Scanner input = new Scanner(System.in);
// Solicitamos al usuario la cantidad de números de la sucesión de Fibonacci que desea generar.
        System.out.println("Ingrese la cantidad de números de la sucesión de Fibonacci que desea generar: ");
        int n = input.nextInt();
// Creamos un arreglo para almacenar los números de la sucesión de Fibonacci.
        int[] fibonacci = new int[n];
// Inicializamos los dos primeros números de la sucesión.
        fibonacci[0] = 0;
        fibonacci[1] = 1;
// Generamos los números de Fibonacci restantes.
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
// Mostramos los primeros n números de la sucesión de Fibonacci.
        System.out.println("Los primeros " + n + " números de la sucesión de Fibonacci son:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci[i] + " "); // Imprimimos cada número de Fibonacci.
        }
    }

}
